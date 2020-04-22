public class Leaf extends Component{
    //首先重写component的方法
    //叶子节点关键点在于业务
    @Override
    public void Operation(){
        System.out.print("业务方法");
    }
    
    @Override
    public void addComposite(Component c){
        //提示报错呗 。
        System.out.print("不是子容器");
    }
    @Override
    public void removeComposite(Component c){
        //提示报错呗 。
        System.out.print("不是子容器");
    }
    @Override
    public Component addComposite(int c){
        //提示报错呗 。
        System.out.print("不是子容器");
        return null;
    }
 
}
