package outOfMemory;

import java.util.ArrayList;

/**
 * xxx
 *
 * @author <a href="donglingcao@2dfire.com">donglingcao</a>
 * @date 2018/11/6
 */
public class OutOfMemoryHeapSpace {

    /**
     *  设定JVM参数-Xmn5M -Xms10M -Xmx10M,
     *
     * @param
     *
     * @return
     *
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        while (true) {
            list.add(new OutOfMemoryHeapSpace.method());
        }
    }

    static class method {

    }
}
