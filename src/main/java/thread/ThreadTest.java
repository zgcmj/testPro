package thread;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        new ThreadTest().test();
    }

    public void test() throws InterruptedException {
        AtomicInteger threadSize = new AtomicInteger(10);
        AtomicInteger i = new AtomicInteger();

        for (i.get(); i.get() < threadSize.get(); i.incrementAndGet()) {
            new Thread(() -> {
                Thread.currentThread().setName(String.valueOf(i.get()));
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "ZS").start();
            Thread.sleep(1000);
        }
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            threadSize.set(20);
        }).start();

        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test3() {
        Thread thread = new Thread(() -> {

        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
