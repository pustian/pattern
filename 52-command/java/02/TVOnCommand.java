public class TVOnCommand implements Command {
    public TV tv;
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
