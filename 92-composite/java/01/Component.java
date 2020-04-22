public abstract class Component{
    //这个是容器类的抽象类，定义好行为，定义创建移除子容器的方法抽象的。
    public abstract void addComposite(Component c); //添加成员
    public abstract void removeComposite(Component c);//移除成员
    public abstract Component getComposite(int i);//获取子容器
   
    public abstract void operation();//业务方法
}
        
