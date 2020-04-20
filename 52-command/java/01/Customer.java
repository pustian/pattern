// Client
public class Customer{
    public static void main(String[] args) {
        //开店前准备：烤肉厨师，烤肉菜单，服务员
        //通过Barbecuer类实例化一个boy对象，即烧烤者
        Barbecuer boy = new Barbecuer();
	// 可以有多个厨师

        // 多态的体现：实例化烤羊肉串对
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);     
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);     
        //通过command 类，实例化一个烤翅命令1对象
        Command bakeChickenWingCommand3 = new BakeChickenWingCommand(boy);  
        Command bakeChickenWingCommand4 = new BakeChickenWingCommand(boy);  
        //实例化一个服务员
        Waiter girl = new Waiter();      
 
        //开门营业
        //  设置订单；服务员接收命令
        //  记录所点菜品
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand3);
        girl.setOrder(bakeChickenWingCommand4);
        girl.cancelOrder(bakeMuttonCommand2);

        //服务员一次性通知烤肉厨师执行
        girl.submit();  

    }
}
