用于创建重复的对象，同时又能保证性能。

适用场景

（1）对象种类繁多，无法将它们整合到一个类中时
（2）难以根据类生成实例时
生成实例的过程太过复杂，很难根据类来 生成实例，通常，在想生成一个和之前用户通过操作所创建出来的实例完全一样的实例的时候，我们会事先将用户通过操作所创建出来的实例保存起来，然后在需要时通过复制来生成新的实例。
（3）想解耦框架与生成的实例时
想要让生成实例的框架不依赖于具体的类，这时，不能指定类名来生成实例，要事先”注册一个原型的“实例，然后通过复制该实例来生成新的实例。

缺点

    创建多个类，增加代码阅读复杂性（所有设计模式通病）
    clone方法只是浅拷贝，除五种基础类型之外类型都只是简单的指向引用，不会重新创建成员变量，如需实现需要自定义clone方法。
    通过clone方法不会调用类的构造函数，部分场景（在构造函数中做一些初始化操作的）需要做额外的处理



Cloneable 接口：
    这是一个标记接口，它并没有声明任何方法，实现clone方法的是Object类，这个接口的存在只是判定能不能使用clone()这个方法。
        clone()只是浅复制，只是复制了字段而已。
