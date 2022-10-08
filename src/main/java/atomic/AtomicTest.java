package atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicTest {
    public static void main(String[] args) {

        AtomicLong parentCategoryId = new AtomicLong();
        parentCategoryId.set(25L);
        System.out.println(parentCategoryId.get());
    }
}
