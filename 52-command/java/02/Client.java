public class Client {
    public static void main(String[] args) {
        // 0、创建二组开关
        RemoteInvoker invoker = new RemoteInvoker(2);

        // 1、创建接收者
        Light light =  new Light();
        // 2、创建命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

	// 3、用命令对象装载它
        invoker.setCommand(0, lightOnCommand, lightOffCommand);

	// 1
	TV tv = new TV();
	// 2
	TVOnCommand tvOnCommand = new TVOnCommand(tv);
	TVOffCommand tvOffCommand = new TVOffCommand(tv);
	// 3 
	invoker.setCommand(1, tvOnCommand, tvOffCommand);

        // 4、测试
        invoker.onButton(0);
        invoker.offButton(0);
        invoker.undoButton();

	invoker.onButton(1);
	invoker.undoButton();
	invoker.onButton(1);
    }
}
