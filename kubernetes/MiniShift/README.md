###
https://docs.okd.io/  
https://github.com/minishift  
[openshift/source-to-image: A tool for building artifacts from source and injecting into container images](https://github.com/openshift/source-to-image)  

### 本家(OKD)
- [Command-Line Walkthrough | Getting Started | OKD 3.11](https://docs.okd.io/3.11/getting_started/developers_cli.html)  
- [Minishift Docker Daemon - Using Minishift | Minishift | OKD 3.11](https://docs.okd.io/3.11/minishift/using/docker-daemon.html)  

### 本家(redhat)
[イメージの使用 3 | Red Hat Customer Portal](https://access.redhat.com/documentation/ja-jp/openshift_online/3/html-single/using_images/index#using-images-s2i-images-java)  

### 記事 オープンシフト関連
- [Product Documentation for OpenShift Container Platform 3.11](https://access.redhat.com/documentation/ja-jp/openshift_container_platform/3.11/)  
- [Projectとアプリケーションデプロイ](https://thinkit.co.jp/article/15696?page=0%2C1)  
- [OpenShift と Kubernetes の違いを理解するためのサンプル演習](https://developer.ibm.com/jp/technologies/containers/tutorials/examples-differentiate-openshift-kubernetes/)  
- [MiniShiftに関する疑問の整理、「 Dockerから入るKubernetes」執筆打明け話とか、OKDやCRCとの整理など](https://qiita.com/MahoTakara/items/3c1c208640518e832660)  
- [Minishift環境でWildFlyとMySQL構成のmaven-webappをデプロイする - Qiita](https://qiita.com/zaki-lknr/items/867d858ccb7430521a8a) 

### チュートリアル
https://github.com/IBM/minishift101  


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

minishiftでのdocker imageの確認をすること  

s2i install  
brew install source-to-image  

systemユーザでないと編集できないことに注意
oc edit scc privileged -n default  





