package basic.thread.designMode;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
public class SingleObject {

    private static SingleObject instance;

    private SingleObject() {
    }

    //线程不安全，当有多个线程并发调用时，会创建多个实例，因此在多线程下不安全。
    public static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    /*
    虽然做到了线程安全，并且解决了多实例的问题，但是它并不高效。
    因为在任何时候只能有一个线程调用 getInstance() 方法。但是同步操作只需要在第一次调用时才被需要，
    即第一次创建单例实例对象时。这就引出了双重检验锁。
     */
    public static synchronized SingleObject getInstance2() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    /*
    静态内部类，这种方法是《Effective Java》上推荐的,懒汉式，线程安全，不依赖JDK版本
     */
    private static class SingletonHolder {
        private static final SingleObject INSTANCE = new SingleObject();
    }

    public static final SingleObject getInstance3() {
        return SingletonHolder.INSTANCE;
    }
}

