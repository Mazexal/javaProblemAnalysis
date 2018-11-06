package outOfMemory;

/**
 * xxx
 *
 * @author <a href="donglingcao@2dfire.com">donglingcao</a>
 * @date 2018/11/6
 */
public class UnableCreateNativeThread {

    public static int count = 1;

    public void noStop() {
        while (true) {

        }
    }


    public void newThread() {

        while (true) {

            Thread t = new Thread(new Runnable() {

                public void run() {

                    System.out.println("已创建第" + count++ + "个线程");

                    noStop();

                }

            });

            t.start();

        }


    }

    public static void main(String[] args) {
        new UnableCreateNativeThread().newThread();
    }


}
