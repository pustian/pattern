public class Context {
    public final static OpenState openState = new OpenState();
    public final static CloseState closeState = new CloseState();
    public final static RunState runState = new RunState();
    public final static StopState stopState = new StopState();
    
    // 当前电梯状态
    private LifeState curState;
    //设置电梯状态，并且把当前上下文的引用传递给具体的状态类，具体的状态类通过上下文的引用切换不同的状态。
    public void setLifeState(LifeState lifeState) {
        curState = lifeState;
        curState.setContext(this);
    }
    
    public LifeState getLifeState() {
        return curState;
    }

    public void open() {
        curState.open();
    }
    public void close() {
        curState.close();
    }
    public void run() {
        curState.run();
    }
    public void stop() {
        curState.stop();
    }
}
