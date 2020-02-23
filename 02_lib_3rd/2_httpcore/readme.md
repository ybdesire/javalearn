Project create Steps:

1. create HttpCoreLearn project by eclipse(java6)
2. eclipse: property->Java Build Path->Add External JARs(add lib)
3. 






**HttpCore**

HttpCore是low level的HTTP通信组件。能用于创建客户端和server端的HTTP服务。HttpCore支持两种I/O模型：阻塞I//O模型和非阻塞IO模型。
* 阻塞I/O模型：基于传统的java I/O。适合于数据密集，低并发量的场景。
* 非阻塞IO模型：基于java NIO的事件驱动I/O模型。适于高并发场景。

HttpCore Tutorial：https://hc.apache.org/httpcomponents-core-ga/tutorial/html/

HttpCore Example：https://hc.apache.org/httpcomponents-core-ga/examples.html