package trytry;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.lang3.ThreadUtils;

public class TestMain {

    public static void main(String[] args) {
        //
        //TestDemo testDemo = new TestDemo();
        //
        ////try {
        //testDemo.demoError();
        //System.out.println("我还是会被执行");
        //}catch (Exception e) {
        //    System.out.println("我是外部异常的问题");
        //}

        //for (int i = 0; i <10; i++) {
        //    new Thread(() -> {
        //        while (true){
        //            try{
        //                Thread.sleep(1000);
        //                int k = 0 ;
        //                int i1 = 50 / k;
        //                System.out.println("我会执行吗");
        //            }catch (Exception e) {
        //                e.printStackTrace();
        //            }
        //        }
        //    }).start();
        //}

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        int k = 0;
                        int i1 = 50 / k;
                        System.out.println("我会执行吗");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
