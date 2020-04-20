public abstract class AbstractLeaveHandler {
    /**直接主管审批处理的请假天数*/
    protected final static int MIN = 1;
    /**部门经理处理的请假天数*/
    protected final static int MIDDLE = 5;
    /**总经理处理的请假天数*/
    protected final static int MAX = 30;

    /**领导名称*/
    protected String handlerName;
    /**下一个处理节点（即更高级别的领导）*/
    protected AbstractLeaveHandler nextHandler;
    
    /**设置下一节点*/
    protected void setNextHandler(AbstractLeaveHandler handler){
        this.nextHandler = handler;
    }

    /**处理请假的请求，子类实现*/
    protected abstract void handlerRequest(LeaveRequest request);
}
