public class TVOffCommand implements Command {
    public TV tv;
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
