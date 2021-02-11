### 目標
- MiniShift上でSpringBatchのjobを動かす    
- チェーンビルドでビルドする  

hello


docker images -a | grep "my-javatest" | awk '{print $3}' | xargs docker rmi  
oc get bc myruntime -o yaml> runtime.yaml  

課題は多いけどとりあえずできた  

### TODO
- yamlの整理  
- 手順まとめ  
