### 目標
- MiniShift上でSpringBatchのjobを動かす    
- チェーンビルドでビルドする  
- java11でビルドする


https://catalog.redhat.com/software/containers/openjdk/openjdk-11-rhel7/5bf57185dd19c775cddc4ce5

docker images -a | grep "my-javatest" | awk '{print $3}' | xargs docker rmi  
oc get bc myruntime -o yaml> runtime.yaml  
docker run --rm -it 172.30.1.1:5000/my-job11/myjob11-runtime /bin/bash

### 目標  
java11でバッチをビルドすること  

#### イメージの取得
oc import-image ubi8/openjdk-11 --from=registry.access.redhat.com/ubi8/openjdk-11 --confirm  

#### あとかたづけ  
oc delete all -l app=mybuilder11  
docker images -a | grep "my-job11" | awk '{print $3}' | xargs docker rmi  
oc delete project my-job11  

#### プロジェクト作成  
oc new-project my-job11  

#### ビルダーコンパイルよう  
oc new-build registry.access.redhat.com/ubi8/openjdk-11 --strategy=source --binary=true --name=mybuilder11  

成功したらyamlを変更してincrementalを有効にすること  
oc edit bc mybuilder11  
```
      from:
        kind: ImageStreamTag
        name: openjdk-11:latest
      incremental: true
```
確認  
oc get bc mybuilder11 -o yaml  

再ビルドしてダウンロードしてないことを確認  
oc start-build mybuilder11 --from-dir=. --follow  

#### ランタイムを作成する  
```
cat <<EOS | oc new-build --name=myjob11-runtime --source-image=mybuilder11 \
  --source-image-path=/deployments/SpringBatchDayo-0.0.1-SNAPSHOT.jar:. \
  --dockerfile=-
FROM fedora
RUN dnf -y update \
 && dnf -y install java-11-openjdk-headless \
 && dnf clean all
COPY SpringBatchDayo-0.0.1-SNAPSHOT.jar /deployments/app.jar
EOS
```

oc set image-lookup myjob11-runtime  

#### シェルをはさんでを実行する  
```
cat <<EOS | oc new-build --name=myjob11-runtime --source-image=mybuilder11 \
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
