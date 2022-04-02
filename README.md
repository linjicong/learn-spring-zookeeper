java客户端
zkClient,Curator
客户端对比

|     | 原生api                                                                                                                                                           | zkClient                                                            | curator                                                                                    |
| --- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| 优点  |                                                                                                                                                                 | 1、session会话超时重连；<br/>2、解决watcher反复注册；<br/>3、简化api开发；              | 1、解决watch注册一次就会失效的问题；<br/>2、api更加简单易用；<br/>3、提供了更多解决方案并且实现简单，比如分布式锁；<br/>4、提供了常用的zk工具类； |
| 缺点  | 1、watch注册一次后会失效；<br/>2、session超时之后没有实现重连机制；<br/>3、异常处理繁琐；<br/>4、只提供了简单的byte[]数组的接口，没有提供针对对象级别的序列化；<br/>5、创建节点时如果节点存在抛出异常，需要自行检查节点是否存在；<br/>6、删除节点无法实现级联删除； | 1、异常处理简化，抛出RuntimeException；<br/>2、重试机制比较难用；<br/>3、没有提供各种使用场景的实现； |                                                                                            |

# [Curator](https://curator.apache.org/index.html)

## Elections 选举

Leader Latch
Leader Election

## Locks(分布式锁)

Shared Reentrant Lock
Shared Lock
Shared Reentrant Read Write Lock
Shared Semaphore
Multi Shared Lock 

Redis分布式锁,适合高并发,高性能场景,可靠性由其他方案弥补.
Zookeeper分布式锁,适合高可靠,低并发场景.性能差是因为需要动态创建/删除节点,只能通过leader执行,还需要同步到follower,频繁网络通信,系统性能下降.

## Barriers 栅栏

Barrier
Double Barrier

## Counters 计数器

Shared Counter
Distributed Atomic Long

## Caches 缓存

Curator Cache
Path Cache
Node Cache
Tree Cache

## Nodes/Watches 监听器

Persistent Recursive Watcher
Persistent Watcher
Persistent TTL Watcher
Group Member

## Queques 队列

Distributed Queue
Distributed Id Queue
Distributed Priority Queue
Distributed Delay Queue
Simple Distributed Queue
