public class SingleTon05 {
    private static class SingletonHolder {  
        private static final SingleTon05 INSTANCE = new SingleTon05();  
    }  
    private SingleTon05(){
        System.out.println("SingleTon05 Created");
    }
    public static final SingleTon05 getInstance() {  
        return SingletonHolder.INSTANCE;  
    }  
}
/**
 * 利用了 classloader 机制来保证初始化 instance 时只有一个线程
 * 这种方式是 Singleton 类被装载了，instance 不一定被初始化。
 *   因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，
 *   才会显式装载 SingletonHolder 类，从而实例化 instance。
 * 
 */
