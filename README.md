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
##### 命令模式(Command)
> 命令模式（Command Pattern）: 一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
>     将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
##### 解释器模式(Interpreter)
> 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式
>     编译器、运算表达式计算 java可以用 expression4J 代替
##### 责任链模式(Chain of Responsibility)
> 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链
>     日志按级别处理
##### 模板方法模式(Template Method)
> 模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板
+  与策略模式相比较,使不同的算法可以被相互替换，而不影响客户端的使用。 模板方法定义一个算法流程，将一些特定步骤的具体实现、延迟到子类。
##### 观察者模式(Observer)
> 对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象
 备忘录模式(Memento)
 迭代器模式(Iterator)
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

