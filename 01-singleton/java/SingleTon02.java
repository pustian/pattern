public class SingleTon02 {
    // 自身实例化为一个属性,并用static修饰
    private static SingleTon02 instance;

    private SingleTon02(){}
    // 静态方法返回实例
    public static SingleTon02 getInstance() {
        if(instance == null) {
            instance = new SingleTon02();
        }
        return instance;
    }
} 
/**
 * 延迟加载/懒汉模式
 * 实现简单,被夹在时静态变量instance不创建,分配空间
 *     getInstance 调用时初始化instance变量. 
 * 缺点:
 *     多线程下, 这种实现方法是完全错误的,无法保证单例的状态
 *
 *
 */
