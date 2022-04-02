java客户端
zkClient,Curator
客户端对比

|     | 原生api                                                                                                                                                           | zkClient                                                            | curator                                                                                    |
| --- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| 优点  |                                                                                                                                                                 | 1、session会话超时重连；
| 缺点  | 1、watch注册一次后会失效；

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