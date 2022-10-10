package concurrent;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.apache.poi.ss.formula.functions.T;

import java.util.concurrent.*;

public class CountDownLatchFuture<V> implements Future<V> {


    private CountDownLatch countDownLatch;

    private boolean mayInterruptIfRunning = false;

    private V value;

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public boolean isMayInterruptIfRunning() {
        return mayInterruptIfRunning;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public CountDownLatchFuture(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        this.mayInterruptIfRunning = mayInterruptIfRunning;
        return false;
    }

    @Override
    public boolean isCancelled() {
        return isDone();
    }

    @Override
    public boolean isDone() {
        return countDownLatch.getCount() == 0;
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        countDownLatch.await();
        return value;
    }

    @Override
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        countDownLatch.await(timeout, unit);
        return value;
    }

}
