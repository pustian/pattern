public class SingleTon04 {
    // 自身实例化为一个属性,并用static修饰
    private static SingleTon04 instance =  null;
    
    private SingleTon04(){}
    // 静态方法返回实例.加关键字 synchronized
    public static SingleTon04 getInstance() {
        // 第一次检查instance是否被实例化出来，如果没有进入if块
        if(null == instance) {
            synchronized (SingleTon04.class) {
                // 某个线程取得了类锁，实例化对象前第二次检查instance是否已经被实例化出来，如果没有，才最终实例出对象
                if(null == instance) {
                    instance = new SingleTon04();
                }
            }
        }
        return instance;
    }
}
/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 实现简单,被夹在时静态变量instance不创建,分配空间
 *     getInstance 调用时初始化instance变量. 
 * 缺点:
 *     多线程下, 这种实现方法是完全错误的,无法保证单例的状态
 *
 *
 */
