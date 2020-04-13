public class SingleTon01 {
    // 自身实例化对象设置为一个属性
    private static final SingleTon01 instance =  new SingleTon01();
    // 构造私有化,
    private SingleTon01() {}
    // 静态方法返回实例
    public static SingleTon01 getInstance() {
        return instance;
    }
}
/**
 * 立即加载/饿汉模式
 *
 * 优点 实现简单,无多线程同步问题
 * 缺点 类被加载时 初始化 static 静态变量 instance,创建并分配空间. 
 *      类被卸载时,静态变量被销毁,释放内存
 *      有时会比较耗费内存
 *
 */
