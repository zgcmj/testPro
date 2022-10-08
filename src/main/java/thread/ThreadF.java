package thread;

import com.sun.deploy.util.DeployLock;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadF {


    public static void main(String[] args) throws InterruptedException {
        ResourcC resourcC = new ResourcC();

        for (int i = 0; i < 1000; i++) {
            resourcC.getConcurrentLinkedQueue().add(i+"");
        }
        resourcC.test1();
    }


}
