org.springframework.security.core.userdetails.User.Builder
参考spring-security中User.Builder
Sweggerui 使用

RobustPerson类的构造方法是私有的，即客户端不能直接创建RobustPerson对象。
RobustPerson类不可变(线程安全的): 所有属性都被final修饰，在构造方法中设置参数值，并且不对外提供Setter方法(Getter方法可选)。
静态内部类Builder与RobustPerson拥有相同的成员变量，且Builder内通过构造方法处理final修饰的必要参数，通过同名方法处理可选参数。
Builder内的build()方法调用RobustPerson的私有构造函数来创建RobustPerson对象，且客户端只能通过该build()方法创建对象(从而避免Invalid状态)。
Builder对象并不具有线程安全性。如果需要对RobustPerson对象的参数强加约束条件，应对build()方法所创建的RobustPerson对象进行检验。
当创建多个对象且对象大多数属性值都相同时，通过toBuilder()可简单高效地克隆对象，仅针对不同的属性重新设置值。
Builder模式使用链式调用，可读性更佳。

但Builder模式也不可避免地存在自身的缺点。例如：
    创建对象前必须先创建它的构建器，消耗内存(若仅需要链式调用可仿照Builder类定义目标类)。
    Builder模式存在冗长的样板代码(可借助InnerBuilder或Lombok插件自动生成)。


