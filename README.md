# pattern
https://www.runoob.com/design-pattern/design-pattern-tutorial.html
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
##### 备忘录模式(Memento)
> 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。 
> 典型的例子就是游戏存档和读档的这个行为。
##### 迭代器模式(Iterator)
> 用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
##### 访问者模式(Visitor)
> 访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。
 中介者模式(Mediator)

### 结构型设计模式：
##### 装饰者模式(Decorator)
> 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
##### 代理模式(Proxy)
> 代理模式（Proxy Pattern）中，一个类代表另一个类的功能。
##### 组合模式(Composite)
> 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次
##### 适配器模式(Adapter)
> 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁. 例，读卡器是作为内存卡和笔记本之间的适配器
##### 桥连接模式(Bridge)
> 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
##### 享元/蝇量模式(Flyweight)
> 享元模式（Flyweight Pattern） 主要用于减少创建对象的数量，以减少内存占用和提高性能。 
##### 外观模式(Facade)
> 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
