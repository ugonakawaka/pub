###
https://docs.okd.io/  
https://github.com/minishift  
[openshift/source-to-image: A tool for building artifacts from source and injecting into container images](https://github.com/openshift/source-to-image)  

### 本家(OKD)
- [Command-Line Walkthrough | Getting Started | OKD 3.11](https://docs.okd.io/3.11/getting_started/developers_cli.html)  
- [Minishift Docker Daemon - Using Minishift | Minishift | OKD 3.11](https://docs.okd.io/3.11/minishift/using/docker-daemon.html)  
- [Java - Source-to-Image (S2I) | Using Images | OKD 3.11](https://docs.okd.io/3.11/using_images/s2i_images/java.html#s2i-images-java-deploy-applications-from-source)  

### 本家(redhat)
- [イメージの使用 3 | Red Hat Customer Portal](https://access.redhat.com/documentation/ja-jp/openshift_online/3/html-single/using_images/index#using-images-s2i-images-java)  
- [8.5.1.2. 増分ビルド](https://access.redhat.com/documentation/ja-jp/openshift_container_platform/3.11/html/developer_guide/builds)  
- [CLI リファレンス OpenShift Container Platform 3.11 | Red Hat Customer Portal](https://access.redhat.com/documentation/ja-jp/openshift_container_platform/3.11/html-single/cli_reference/index)  
- [redhat-openjdk-18/openjdk18-openshift - Certified Container Image - Red Hat Ecosystem Catalog](https://catalog.redhat.com/software/containers/redhat-openjdk-18/openjdk18-openshift/58ada5701fbe981673cd6b10?container-tabs=overview&gti-tabs=unauthenticated)  

### 記事 オープンシフト関連
- [Product Documentation for OpenShift Container Platform 3.11](https://access.redhat.com/documentation/ja-jp/openshift_container_platform/3.11/)  
- [Projectとアプリケーションデプロイ](https://thinkit.co.jp/article/15696?page=0%2C1)  
- [OpenShift と Kubernetes の違いを理解するためのサンプル演習](https://developer.ibm.com/jp/technologies/containers/tutorials/examples-differentiate-openshift-kubernetes/)  
- [MiniShiftに関する疑問の整理、「 Dockerから入るKubernetes」執筆打明け話とか、OKDやCRCとの整理など](https://qiita.com/MahoTakara/items/3c1c208640518e832660)  
- [Minishift環境でWildFlyとMySQL構成のmaven-webappをデプロイする - Qiita](https://qiita.com/zaki-lknr/items/867d858ccb7430521a8a) 
- [OpenShift v3 と source-to-image (s2i) - Qiita](https://qiita.com/nak3/items/6407c01cc2d1f153c0f1)  

---

### チュートリアル
- ibm
https://github.com/IBM/minishift101  

- この記事参考(記事内ではbuilderとしているところをmybuilderとしている,runtimeもmyruntimeで読み替え)
[Projectとアプリケーションデプロイ](https://thinkit.co.jp/article/15696?page=0%2C1)  

##### ビルダー(s2i)
oc new-project my-javatest  
oc new-build registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift --strategy=source --binary=true --name=mybuilder  
oc start-build mybuilder --from-dir=. --follow  
oc new-app mybuilder  
oc expose svc mybuilder  
oc edit bc mybuilder  


チェーンビルド(マルチステージビルド)

oc delete all -l app=mybuilder  

```
cat <<EOS | oc new-build --name=myruntime --source-image=mybuilder \
  --source-image-path=/deployments/sample-jetty-1.0-SNAPSHOT.jar:. \
  --dockerfile=-
FROM fedora
RUN dnf -y update \
 && dnf -y install java-1.8.0-openjdk-headless \
 && dnf clean all
COPY sample-jetty-1.0-SNAPSHOT.jar /deployments/runtime.jar
EXPOSE 8080
CMD java -jar /deployments/runtime.jar
EOS
```  
oc expose svc myruntime  
oc get route myruntime  

---
#### dockerのコマンド
Usage:	docker rmi [OPTIONS] IMAGE [IMAGE...]  

---
#### osx
起動する  
minishift start --vm-driver virtualbox  
止める  
minishift stop  

minishift oc-env  

ログイン忘れずに  
権限がないユーザでアプリをつくらないように!!  

oc whoami  
oc login -u system:admin  
oc login -u developer  

全て消す  
oc delete all --all  


minishiftでのdocker imageの確認をすること  

s2i install  
brew install source-to-image  

systemユーザでないと編集できないことに注意
oc edit scc privileged -n default  

イメージストリーム  
oc get is -n openshift  
oc get is --all-namespaces=true  


