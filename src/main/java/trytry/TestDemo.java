package trytry;

public class TestDemo {


    public void demoError() {

        int i = 0;
        try {
            int i1 = 5 / i;
            System.out.println("我异常依旧执行");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
