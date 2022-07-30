
https://meetup-jp.toast.com/3476  

https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.endpoints.exposing  


discoveryをtrueにするとブラウザでアクセスする分には楽になる  
http://localhost:9091/actuator  

curl 'http://localhost:9091/actuator/auditevents' -i -X GET  
curl 'http://localhost:9091/actuator/beans' -i -X GET  
curl 'http://localhost:9091/actuator/caches' -i -X GET  
curl 'http://localhost:9091/actuator/conditions' -i -X GET  
curl 'http://localhost:9091/actuator/configprops' -i -X GET  
curl 'http://localhost:9091/actuator/env' -i -X GET  
curl 'http://localhost:9091/actuator/flyway' -i -X GET  
curl 'http://localhost:9091/actuator/health' -i -X GET  
curl 'http://localhost:9091/actuator/httptrace' -i -X GET  
curl 'http://localhost:9091/actuator/info' -i -X GET  
curl 'http://localhost:9091/actuator/integrationgraph' -i -X GET  
curl 'http://localhost:9091/actuator/loggers' -i -X GET  
curl 'http://localhost:9091/actuator/liquibase' -i -X GET  
curl 'http://localhost:9091/actuator/metrics' -i -X GET  
curl 'http://localhost:9091/actuator/mappings' -i -X GET  
curl 'http://localhost:9091/actuator/quartz' -i -X GET  
curl 'http://localhost:9091/actuator/scheduledtasks' -i -X GET  
curl 'http://localhost:9091/actuator/sessions' -i -X GET  
curl 'http://localhost:9091/actuator/shutdown' -i -X POST  
curl 'http://localhost:9091/actuator/startup' -i -X GET  
curl 'http://localhost:9091/actuator/threaddump' -i -X GET  






curl 'http://localhost:9091/actuator/heapdump' -i -X GET  
curl 'http://localhost:9091/actuator/jolokia' -i -X GET  
curl 'http://localhost:9091/actuator/logfile' -i -X GET  
curl 'http://localhost:9091/actuator/prometheus' -i -X GET  



