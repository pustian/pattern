public class RemoteInvoker {
    // commoand group
    //
    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;

    public RemoteInvoker(int length) {
        // 有几组开关，就设置多少数组
        onCommands = new Command[length];
        offCommands = new Command[length];

        // 把每个命令初始化成空命令，避免空指针异常
        Command noCommand = new  NoCommand();
        undoCommand = noCommand;
        for(int i=0; i <length; ++i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
       onCommands[slot] =  onCommand;
       offCommands[slot] =  offCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButton() {
        undoCommand.undo();
    }
}
