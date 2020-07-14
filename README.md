## 介绍

### 本DEMO分为三个节点
    > node1
    > node2
    > node3

### demo调用流程
    > node1->node2->node3

### 访问路径
    > node1 : http://127.0.0.1:8080/node1
    > node2 : http://127.0.0.1:8088/node2
    > node3 : http://127.0.0.1:9090/node3

### 当node3抛出异常，分别在控制台打印的信息如下
**node3**
```text
java.lang.RuntimeException: 测试111
	at com.example.consumer.TestController.node3(TestController.java:19) ~[classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_241]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_241]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_241]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_241]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:888) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:634) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:741) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.2.0.RELEASE.jar:5.2.0.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202) ~[tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:526) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:408) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:861) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1579) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_241]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_241]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.27.jar:9.0.27]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_241]

```

node2
```text
cn.minsin.feign.exception.RemoteCallException: 测试111
	at [HAPPEN]:[`http://node3/node3`] timestamp:'2020-07-14 16:58:58.761',message:'测试111',exceptionClass:'java.lang.RuntimeException',path: '/node3'.(:0) ~[na:na]
	at [END]:[`http://node2/node2`] timestamp:'2020-07-14 16:58:58.765',message:'测试111',exceptionClass:'cn.minsin.feign.exception.RemoteCallException',path: '/node2'.(:0) ~[na:na]

```

node1
```text
cn.minsin.feign.exception.RemoteCallException: 测试111
	at [HAPPEN]:[`http://node3/node3`] timestamp:'2020-07-14 16:58:58.761',message:'测试111',exceptionClass:'java.lang.RuntimeException',path: '/node3'.(:0) ~[na:na]
	at [THROW]:[`http://node2/node2`] timestamp:'2020-07-14 16:58:58.768',message:'测试111',exceptionClass:'cn.minsin.feign.exception.RemoteCallException',path: '/node2'.(:0) ~[na:na]
	at [END]:[`http://node1/node1`] timestamp:'2020-07-14 16:58:58.772',message:'测试111',exceptionClass:'cn.minsin.feign.exception.RemoteCallException',path: '/node1'.(:0) ~[na:na]
```
    
