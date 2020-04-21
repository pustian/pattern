public class RequestTest {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("张三", 4);

        DirectLeaderLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");

        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        directLeaderLeaveHandler.handlerRequest(request);
    }
}
