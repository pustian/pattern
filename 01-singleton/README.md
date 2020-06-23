1. 立即加载/饿汉模式

2. 延迟加载/懒汉模式

3. **双检锁/双重校验锁 延迟加载/懒汉模式**

   双检锁---是防止第一次，在加锁位置同时进入导致竞争。

   ### java特性

4. synchronized 延迟加载/懒汉模式

5. 利用了 classloader 机制来保证初始化 instance 时只有一个线程

6. enum 自动支持序列化机制



# 测试

1, 正确性. 多线程
2, 内存消耗, 加载时间
https://www.cnblogs.com/itiande/p/9037471.html
https://blog.csdn.net/bigcabbagefy/article/details/79778960

