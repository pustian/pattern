public class GManagerLeaveHandler extends AbstractLeaveHandler {
    public GManagerLeaveHandler(String name) {
        handlerName = name;
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(MIDDLE <request.getDays() ){
            System.out.println("总经理:" + handlerName + ",已经处理;流程结束。");
        } else {
            if(null != this.nextHandler){
                this.nextHandler.handlerRequest(request);
            } else {
                System.out.println("审批拒绝！");
            }
        }
    }
}
