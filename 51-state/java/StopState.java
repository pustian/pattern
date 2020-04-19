public class StopState extends LifeState {
    @Override
    public void open(){
        super.context.setLifeState(Context.openState);
        super.context.getLifeState().open();
    }
    @Override
    public void close(){}
    @Override
    public void run(){
        super.context.setLifeState(Context.runState);
        super.context.getLifeState().run();
    }
    @Override
    public void stop() {
        System.out.println("the life stopped");
    }

}
