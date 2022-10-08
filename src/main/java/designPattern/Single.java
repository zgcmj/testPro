package designPattern;

public class Single {

    private static volatile Single single;

    private Single() {
    }

    public static Single getInstance() {
        if (single == null) {
            synchronized (Single.class) {
                if (single == null) {
                    return new Single();
                }
            }
        }
        return single;
    }
}
