public class DirectLeaderLeaveHandler extends AbstractLeaveHandler {
    public DirectLeaderLeaveHandler(String name) {
        handlerName = name;
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getDays() <= MIN){
            System.out.println("直接主管:" + handlerName + ",已经处理;流程结束。");
        } else {
            if(null != this.nextHandler){
                this.nextHandler.handlerRequest(request);
            } else {
                System.out.println("审批拒绝！");
            }
        }
    }
}
