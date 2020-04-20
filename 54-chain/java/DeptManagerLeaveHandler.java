public class DeptManagerLeaveHandler extends AbstractLeaveHandler {
    public DeptManagerLeaveHandler(String name) {
        handlerName = name;
    }
    
    @Override
    public void handlerRequest(LeaveRequest request) {
        if(MIN < request.getDays() && request.getDays() <= MIDDLE ) {
            System.out.println("部门经理:" + handlerName + ",已经处理;流程结束。");
        } else {
            if(null != this.nextHandler){
                this.nextHandler.handlerRequest(request);
            } else {
                System.out.println("审批拒绝！");
            }
        }
    }
}
