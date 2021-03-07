### 目標
- MiniShift上でSpringBatchのjobを動かす    
- チェーンビルドでビルドする  
- java11でビルドする  
- java実行のexit codeの取得の確認

Jobの実行後の状態を確認したい。それで、アプリケーションの失敗が、Jobの失敗として確認できることが目標となります。  
あと、Jobが失敗した場合、再実行をしないことも要件となります。
javaが返すexit codeはconfig mapに定義しておいて、環境変数を読み込みそれを返すようにします。  

java内で設定するSystem.exitとjobが受け取るexit codeは↓となりました。  
えーと256で割って余りがexit codeとなる理解でよいようです。  
```
EXIT_CODE:  255 → Exit Code:    255
EXIT_CODE:  256 → Exit Code:    0
EXIT_CODE:  257 → Exit Code:    1
EXIT_CODE:  511 → Exit Code:    255
EXIT_CODE:  512 → Exit Code:    0
EXIT_CODE:  513 → Exit Code:    1
```

### ⭐️参考⭐️  
docker images -a | grep "my-javatest" | awk '{print $3}' | xargs docker rmi  
oc get bc myruntime -o yaml> runtime.yaml  
docker run --rm -it 172.30.1.1:5000/my-job11/myjob11-runtime /bin/bash

https://catalog.redhat.com/software/containers/openjdk/openjdk-11-rhel7/5bf57185dd19c775cddc4ce5

#### 👍あとかたづけ  
oc delete all -l app=mybuilder11  
docker images -a | grep "myjob11" | awk '{print $3}' | xargs docker rmi  
docker images -a | grep "myjob11-runtime" | awk '{print $3}' | xargs docker rmi 
docker images -a | grep "myjob11-builder" | awk '{print $3}' | xargs docker rmi 

oc delete project my-job11  

#### 👍イメージの取得
oc import-image ubi8/openjdk-11 --from=registry.access.redhat.com/ubi8/openjdk-11 --confirm  

#### 👍プロジェクト作成  
oc new-project myjob11  

#### 👍ビルダーコンパイルよう  

ビルドコンフィグの作成
oc new-build registry.access.redhat.com/ubi8/openjdk-11 --strategy=source --binary=true --name=myjob11-builder  

成功したらyamlを変更してビルド履歴を減らす
成功したらyamlを変更してincrementalを有効にすること  
oc edit bc myjob11-builder  
```
  failedBuildsHistoryLimit: 1
```
```
  successfulBuildsHistoryLimit: 1
```
```
      from:
        kind: ImageStreamTag
        name: openjdk-11:latest
      incremental: true
```
確認  
oc get bc myjob11-builder -o yaml  

ビルド実行
oc start-build myjob11-builder --from-dir=. --follow  

再ビルドしてダウンロードしてないことを確認  

#### 👍ランタイムを作成する  
これが、チェーンビルドのふたつめとなる  
一段目で作成したjarファイルをリネームしてコピーしてdocker imageを作成する  

```
cat <<EOS | oc new-build --name=myjob11-runtime --source-image=myjob11-builder \
  --source-image-path=/deployments/SpringBatchDayo-0.0.1-SNAPSHOT.jar:. \
  --dockerfile=-
FROM fedora
RUN dnf -y update \
 && dnf -y install java-11-openjdk-headless \
 && dnf clean all
COPY SpringBatchDayo-0.0.1-SNAPSHOT.jar /deployments/app.jar
EOS
```
#### 👍docker imageがみつかるようにする  
ランタイムを作成後では、lookupができないのでできるようにしておく  
imageをローカルからみつけるようになっていないことを確認  
oc describe is myjob11-runtime  
```
Image Lookup:		local=false
```
変更する  
oc set image-lookup myjob11-runtime  

#### 👍jobのyamlを適用する  
これはコマンドでなくyamlで定義しています  

```
apiVersion: batch/v1
kind: Job
metadata:
  name: myjob11
spec:
  backoffLimit: 0
  parallelism: 1
  completions: 1
  template:
    metadata:
      name: myjob11
    spec:
      containers:
      - name: myjob11
        image: myjob11-runtime
        imagePullPolicy: IfNotPresent
        command: ["java","-jar", "/deployments/app.jar"]
      restartPolicy: Never
```
#### 👍その他(再ビルド)

再ビルド  
oc start-build mybuilder11 --follow  

jobの削除
oc delete job myjob11  


### 以下、おまけ  

#### シェルをはさんでを実行する 
java実行の間にシェルをはさむパターンを試してみました。  

```
cat <<EOS | oc new-build --name=myjob11-runtime --source-image=myjob11-builder \
  --source-image-path=/deployments/SpringBatchDayo-0.0.1-SNAPSHOT.jar:. \
  --dockerfile=-
FROM fedora
RUN dnf -y update \
 && dnf -y install java-11-openjdk-headless \
 && dnf clean all
COPY SpringBatchDayo-0.0.1-SNAPSHOT.jar /deployments/app.jar
RUN echo -e '#!/bin/bash\\njava -jar /deployments/app.jar\\nexit $? '> /deployments/batch.sh && \
    chmod +x /deployments/batch.sh
EOS
```

job.yamlのcommandを↓のものにさしかえる  
```
        command: ["sh","/deployments/batch.sh"]
```