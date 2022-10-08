package thread;

public class ThreadTest0 {

    public static void main(String[] args) {


        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        int j = 5;
                        //int x = j / 0;
                        System.out.println(j);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(Thread.currentThread().getName() + "finally 执行了吗");
                    }
                    System.out.println("当前循环走完");
                }
            }).start();

        }

    }


}
