package thread;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourcC {


    private ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    @Override
    public String toString() {
        return "ResourcC{" +
                "concurrentLinkedQueue=" + concurrentLinkedQueue +
                ", lock=" + lock +
                ", condition=" + condition +
                ", condition2=" + condition2 +
                '}';
    }

    public ConcurrentLinkedQueue<String> getConcurrentLinkedQueue() {
        return concurrentLinkedQueue;
    }

    public void setConcurrentLinkedQueue(ConcurrentLinkedQueue<String> concurrentLinkedQueue) {
        this.concurrentLinkedQueue = concurrentLinkedQueue;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition2() {
        return condition2;
    }

    public void setCondition2(Condition condition2) {
        this.condition2 = condition2;
    }

    public void test1() {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        String poll = concurrentLinkedQueue.poll();
                        //Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + ": get " + poll);
                        while (poll == null) {
                            lock.lock();
                            condition.await();
                            return;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    System.out.println(Thread.currentThread().getName() + ":unlock");
                    lock.unlock();
                }
            }, "thread----" + i).start();

        }

        for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        for (int j = 0; j < 100; j++) {
                            if (j / 3 == 0) {
                                lock.lock();
                                concurrentLinkedQueue.add(j + "");
                                condition2.signal();
                            }
                        }

                    }
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    System.out.println(Thread.currentThread().getName() + ":unlock");
                    lock.unlock();
                }
            }, "DDD----" + i).start();
        }
    }

    public void test2() {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {

                try {
                    lock.lock();
                    while (true) {
                        String poll = concurrentLinkedQueue.poll();
                        System.out.println(Thread.currentThread().getName() + ": get " + poll);
                        while (poll == null) {
                            System.out.println(Thread.currentThread().getName() + ":sleep");
                            condition.await();
                            return;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    System.out.println(Thread.currentThread().getName() + ":unlock");
                    lock.unlock();
                }
            }, "thread----" + i).start();

        }
    }
}
