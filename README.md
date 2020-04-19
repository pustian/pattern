# pattern
pattern
设计模式的分类：
设计模式可以分为三大类:
> + 分别是创建型设计模式
> + 行为型设计模式
> + 结构型设计模式。

### 创建型的设计模式：
##### 单例模式(Singleton)
> 单例模式(Singleton)：确保有且只有一个对象被创建。
##### 抽象工厂模式(Abstract Factory)
> 抽象工厂模式(Abstract Factory)：允许客户创建对象的家族，而无需指定他们的具体类。
##### 工厂方法模式(Factory Method)
> 工厂方法模式(Factory Method)：由子类决定要创建的具体类是哪一个。
##### 构建模式(Builder)
> 建造者模式（Builder Pattern）:使用多个简单的对象一步一步构建成一个复杂的对象
##### 原型模式(Prototype)
> 原型模式（Prototype Pattern）:用于创建重复的对象，同时又能保证性能。

### 行为设计模式：
##### 策略模式(Strategy)
> 策略模式（Strategy Pattern）: 一个类的行为或其算法可以在运行时更改. Context中execute方法决定了Strategy类的行为
##### 状态模式(State)
> 状态模式（State Pattern）中，类的行为是基于它的状态改变的。
> 主要应用于状态变更的模式中
+ 与策略模式相比较,状态模式是由Context中的set根据状态来加载类的

 责任链模式(Chain of Responsibility)
 解释器模式(Interpreter)
 命令模式(Command)
 观察者模式(Observer)
 备忘录模式(Memento)
 迭代器模式(Iterator)
 模板方法模式(Template Method)
 访问者模式(Visitor)
 中介者模式(Mediator)



### 结构型设计模式：

 装饰者模式(Decorator)

 代理模式(Proxy)

 组合模式(Composite)

 桥连接模式(Bridge)

 适配器模式(Adapter)

 蝇量模式(Flyweight)

 外观模式(Facade)



 各种模式的表述：

 装饰者模式(Decorator)：包装一个对象，以提供新的行为。



 状态模式(State)：封装了基于状态的行为，并使用委托在行为之间切换。



 迭代器模式(Iterator)：在对象的集合之中游走，而不暴露集合的实现。



 外观模式(Facade)：简化一群类的接口。



 策略模式(Strategy)：封装可以互换的行为，并使用委托来决定要使用哪一个。



 代理模式(Proxy)：包装对象，以控制对此对象的访问。



 适配器模式(Adapter)：封装对象，并提供不同的接口。



 观察者模式(Observer)：让对象能够在状态改变时被通知。



 模板方法模式(Template Method)：有子类决定如何实现一个算法中的步骤。



 组合模式(Composite)：客户用一致的方法处理对象集合和单个对象。



 命令模式(Command)：封装请求成为对象。 
