角色：
 1、命令(Command)：为所有命令声明了一个接口。调用命令对象的 execute()方法，就可以让接收者进行相关的操作。这个接口也具备一个 undo() 方法。
 2、具体命令(ConcreteCommand)：实现命令接口，定义了动作和接收者之间的绑定关系。调用者只要调用 execute() 就可以发出请求，然后由 ConcreteCommand 调用接收者的一个或多个动作。
 3、请求者(Invoker)：持有一个命令对象，有一个行动方法，在某个时间点调用命令对象的 execute() 方法，将请求付诸实行。
 4、接收者(Receiver)：接收者知道如何进行必要的动作，实现这个请求。任何类都可以当接收者。
 5、客户端(Client)：创建一个具体命令(ConcreteCommand)对象并确定其接收者，包括把其他角色串连在一起。