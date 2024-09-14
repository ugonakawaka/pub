[https://spring.pleiades.io/guides/gs/graphql-server/](https://spring.pleiades.io/guides/gs/graphql-server/)  
  
[https://docs.spring.io/spring-graphql/docs/current/reference/html/#graphiql](https://docs.spring.io/spring-graphql/docs/current/reference/html/#graphiql  )  




====

[https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/parameter-name-discoverer.html](https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/parameter-name-discoverer.html)  
[https://www.logicbig.com/how-to/java-command/java-class-default-debug-info.html](https://www.logicbig.com/how-to/java-command/java-class-default-debug-info.html)  
 

eclipseでこのようなエラーがでた場合、コンパイル時のオプションがたりないかもしれない、リフレクションの情報がクラスについていない？からかもしれない。
「Store informaton method parametar」をチェックすること  
```
java.lang.IllegalArgumentException: Name for argument of type [java.lang.String] not specified, and parameter name information not found in class file either.
	at org.springframework.graphql.data.method.annotation.support.ArgumentMethodArgumentResolver.getArgumentName(ArgumentMethodArgumentResolver.java:92) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.data.method.annotation.support.ArgumentMethodArgumentResolver.resolveArgument(ArgumentMethodArgumentResolver.java:69) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.data.method.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:81) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.data.method.annotation.support.DataFetcherHandlerMethod.getMethodArgumentValues(DataFetcherHandlerMethod.java:177) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.data.method.annotation.support.DataFetcherHandlerMethod.invoke(DataFetcherHandlerMethod.java:119) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.data.method.annotation.support.DataFetcherHandlerMethod.invoke(DataFetcherHandlerMethod.java:107) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.data.method.annotation.support.AnnotatedControllerConfigurer$SchemaMappingDataFetcher.get(AnnotatedControllerConfigurer.java:680) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.graphql.execution.ContextDataFetcherDecorator.lambda$get$0(ContextDataFetcherDecorator.java:87) ~[spring-graphql-1.2.2.jar:1.2.2]
	at io.micrometer.context.ContextSnapshot.lambda$wrap$1(ContextSnapshot.java:106) ~[context-propagation-1.0.4.jar:1.0.4]
	at org.springframework.graphql.execution.ContextDataFetcherDecorator.get(ContextDataFetcherDecorator.java:87) ~[spring-graphql-1.2.2.jar:1.2.2]
	at graphql.execution.ExecutionStrategy.invokeDataFetcher(ExecutionStrategy.java:309) ~[graphql-java-20.4.jar:na]
	at graphql.execution.ExecutionStrategy.fetchField(ExecutionStrategy.java:286) ~[graphql-java-20.4.jar:na]
	at graphql.execution.ExecutionStrategy.resolveFieldWithInfo(ExecutionStrategy.java:212) ~[graphql-java-20.4.jar:na]
	at graphql.execution.AsyncExecutionStrategy.execute(AsyncExecutionStrategy.java:55) ~[graphql-java-20.4.jar:na]
	at graphql.execution.Execution.executeOperation(Execution.java:161) ~[graphql-java-20.4.jar:na]
	at graphql.execution.Execution.execute(Execution.java:104) ~[graphql-java-20.4.jar:na]
	at graphql.GraphQL.execute(GraphQL.java:557) ~[graphql-java-20.4.jar:na]
	at graphql.GraphQL.lambda$parseValidateAndExecute$11(GraphQL.java:476) ~[graphql-java-20.4.jar:na]
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187) ~[na:na]
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2341) ~[na:na]
	at graphql.GraphQL.parseValidateAndExecute(GraphQL.java:471) ~[graphql-java-20.4.jar:na]
	at graphql.GraphQL.executeAsync(GraphQL.java:439) ~[graphql-java-20.4.jar:na]
	at org.springframework.graphql.execution.DefaultExecutionGraphQlService.lambda$execute$2(DefaultExecutionGraphQlService.java:83) ~[spring-graphql-1.2.2.jar:1.2.2]
	at reactor.core.publisher.MonoDeferContextual.subscribe(MonoDeferContextual.java:47) ~[reactor-core-3.6.0-M2.jar:3.6.0-M2]
	at reactor.core.publisher.Mono.subscribe(Mono.java:4495) ~[reactor-core-3.6.0-M2.jar:3.6.0-M2]
	at reactor.core.publisher.Mono.subscribeWith(Mono.java:4561) ~[reactor-core-3.6.0-M2.jar:3.6.0-M2]
	at reactor.core.publisher.Mono.toFuture(Mono.java:5073) ~[reactor-core-3.6.0-M2.jar:3.6.0-M2]
	at org.springframework.core.ReactiveAdapterRegistry$ReactorRegistrar.lambda$registerAdapters$5(ReactiveAdapterRegistry.java:290) ~[spring-core-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.core.ReactiveAdapter.fromPublisher(ReactiveAdapter.java:121) ~[spring-core-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.servlet.function.DefaultAsyncServerResponse.create(DefaultAsyncServerResponse.java:186) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.servlet.function.ServerResponse.async(ServerResponse.java:249) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.graphql.server.webmvc.GraphQlHttpHandler.handleRequest(GraphQlHttpHandler.java:111) ~[spring-graphql-1.2.2.jar:1.2.2]
	at org.springframework.web.servlet.function.support.HandlerFunctionAdapter.handle(HandlerFunctionAdapter.java:107) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1086) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1011) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:914) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:590) ~[tomcat-embed-core-10.1.12.jar:6.0]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885) ~[spring-webmvc-6.1.0-M4.jar:6.1.0-M4]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658) ~[tomcat-embed-core-10.1.12.jar:6.0]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:205) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51) ~[tomcat-embed-websocket-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.0-M4.jar:6.1.0-M4]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.0-M4.jar:6.1.0-M4]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-6.1.0-M4.jar:6.1.0-M4]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.0-M4.jar:6.1.0-M4]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:174) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:149) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:166) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:482) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:341) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:391) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:894) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1740) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-10.1.12.jar:10.1.12]
	at java.base/java.lang.Thread.run(Thread.java:1623) ~[na:na]





```