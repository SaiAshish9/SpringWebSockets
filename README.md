https://www.piesocket.com/websocket-tester

https://chrome.google.com/webstore/detail/piesocket-websocket-teste/oilioclnckkoijghdniegedkbocfpnip/related

<img width="1065" alt="Screenshot 2023-02-25 at 7 11 44 PM" src="https://user-images.githubusercontent.com/43849911/221360076-f08c2a4a-df40-410a-acb7-c5355793180b.png">

```
Like http, websocket is also a communication protocol which provides bi-directional communication channel
between a server and client.

Once, a websocket connection is established between a client and a server, both can exchange information endlessly until the connection is closed by any of the parties.

This is the main reason why websocket is preferred why websocket is preferred over HTTP where the client and server need to exchange information at high frequency and low latency.
```

<img width="746" alt="Screenshot 2023-02-25 at 11 28 39 PM" src="https://user-images.githubusercontent.com/43849911/221372398-979dd39e-963f-4322-b66d-88a9b56c2726.png">

```
WebSocket is just a communication protocol. It doesn't know how to send messages to a particular user or topic. We need STOMP for these functionalities.

STOMP => Streaming Text Oriented Messaging Protocol.

It is a simple text based protocol, it allows STOMP clinets to talk with any message broker
supporting the protocol.

Spring provides default support for it but we can choose any other messaging protocol such as
RabbitMQ or ActiveMQ.

Brokers & Topics:
```
