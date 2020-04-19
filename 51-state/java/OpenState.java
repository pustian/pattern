public class OpenState extends LifeState {
    @Override
    public void open() {
        System.out.println("Open the door of the life");
    }

    //虽然可以关门，但这个动作不归我执行 
    @Override
    public void close() {
        // 状态修改 
        super.context.setLifeState(Context.closeState); 
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作 
        super.context.getLifeState().close();
    }

    //电梯门不能开着就跑，这里什么也不做
    @Override
    public void run() {
        // do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}
