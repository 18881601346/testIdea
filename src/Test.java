import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void  main(String[] args) throws Throwable {
        ThreadTest target = new ThreadTest();
        Thread thread = new Thread(target);
        thread.start();
        thread.join();
        System.out.println("main执行完毕");

        int[] ha = new int[]{1,2};
        ha.finalize();
        System.arraycopy();
    }
}
