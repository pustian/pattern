public class RunState extends LifeState {
    @Override
    public void open(){
        // do nothing
    }
    @Override
    public void close(){}
    @Override
    public void run(){
        System.out.println("the life is running");
    }
    @Override
    public void stop() {
        super.context.setLifeState(Context.stopState);
        super.context.getLifeState().stop();
    }

}
