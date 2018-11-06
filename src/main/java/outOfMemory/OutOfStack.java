package outOfMemory;

/**
 * xxx
 *
 * @author <a href="donglingcao@2dfire.com">donglingcao</a>
 * @date 2018/11/6
 */
public class OutOfStack {

    public static void main(String[] args) {
        fun();
    }

    public static void fun() {
        fun();
    }
}
