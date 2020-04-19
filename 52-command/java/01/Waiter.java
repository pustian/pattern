import java.util.*;
// Invoker 服务员
public class Waiter {
    // AutoIncreate
    private static int i = 0;
    //聚集的体现，建立一个集合用来存放客户的订单
    private List<Command> orders = new ArrayList<Command>();

    //服务员设置订单，即增加删除订单
    public void setOrder(Command command) {
        // 将命令添加到总订单中
        orders.add(command);
        // 并记录具体的时间，内容
        System.out.println("增加订单："+command +" i="+(++i));
    }
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单:" + command + "i=" +(--i));
    }
    
    //通知执行
    public void submit()  {   
        //遍历整个订单，并通知接受者
        for(Command cmd : orders) {
            cmd.execute();  
        }
    }

}
