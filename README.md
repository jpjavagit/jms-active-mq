# JMS With ActiveMQ

Steps to install maven dependencies:
Open the terminal and type:

```sh
$ mvn clean install -U -DskipTests
$ mvn spring-boot:run
```
Link below for more info about ActiveMQ:
[ActiveMQ](http://activemq.apache.org/)

After starting the broker, be sure it`s working:
http://127.0.0.1:8161/admin/queues.jsp

To send some messages using HTTP POST:

```sh
{
	"name":"bigmac",
	"value":12.00
}

{
	"name":"whooper",
	"value":11.00
}


```










