package exception;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            if (true) throw new RuntimeException("我是异常");
            System.out.println("可能执行不聊了我执行");
        } catch (Exception e) {
            System.out.println("异常出现了!");
        }
        System.out.println("我执行");
    }
}
