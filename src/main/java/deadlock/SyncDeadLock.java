package deadlock;

/**
 * xxx
 *
 * @author <a href="donglingcao@2dfire.com">donglingcao</a>
 * @date 2018/11/4
 */
public class SyncDeadLock {

    Object obj1 = new Object();
    Object obj2 = new Object();

    public void fun1() {
        synchronized (obj1) {
            fun2();
        }
    }

    public void fun2() {
        synchronized (obj2) {
            while (true) { //为了演示需要，该函数永不退出
                System.out.print("");
            }
        }
    }

    public static void main(String[] args) {
        SyncDeadLock aa = new SyncDeadLock();
        aa.fun1();
    }

}
