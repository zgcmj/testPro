package cas;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

public class CASTest {

    @Test
    public void test() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        //C
    }

    @Test
    public  void test2(){
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        atomicBoolean.set(true);
        boolean b = atomicBoolean.compareAndSet(false, true);
        System.out.println(b);
        System.out.println(atomicBoolean.get());

    }
}
