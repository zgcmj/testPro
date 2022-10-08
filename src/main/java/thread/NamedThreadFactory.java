package thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {
    private final String groupName;
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    public NamedThreadFactory(String groupName) {
        this.groupName = groupName;
    }

    public Thread newThread(Runnable r) {
        String name = this.groupName + "-" + this.atomicInteger.incrementAndGet();
        return new Thread(() -> {
            String clientId = System.getProperty("client.id");
            if (clientId != null) {
            }
            try {
                r.run();
            } finally {
            }

        }, name);
    }
}
