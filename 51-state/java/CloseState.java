public class CloseState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.openState);
        super.context.getLifeState().open();
    }
    @Override
    public void close() {
        System.out.println("Close the door of the life");
    }
    @Override
    public void run() {
        super.context.setLifeState(Context.runState);
        super.context.getLifeState().run();
    }
    @Override 
    public void stop() {
        // do nothing
    }
}
