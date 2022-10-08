package fakecode;

import java.util.concurrent.ConcurrentLinkedQueue;

public class WhileTask {


    private ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

    private ConcurrentLinkedQueue<String> resultQueue = new ConcurrentLinkedQueue<>();


    public void execute() {

        // 添加初始任务
        //假定添加100个新任务
        new Thread(() -> {
            while (true) {
                for (int i = 0; i < 100; i++) {
                    taskQueue.add(i + "个任务");
                }
            }
        }, "定时抓取任务").start();

        //
        int threadSize = 20;
        for (int i = 0; i < threadSize; i++) {
            new Thread(() -> {
                while (true) {
                    String task = taskQueue.poll();
                    if (task == null) {
                        //todo 如何去做 去让线程休眠
                    }
                    //do do do
                    String result = task + "do do do";
                    resultQueue.add(result);
                    //todo 让结果任务线程执行
                }
            }, "处理任务线程").start();
        }

        //
        new Thread(() -> {
            while (true) {
                String taskResult = resultQueue.poll();

                if (taskResult == null) {
                    //todo 休息
                }

                if ("满足某种条件".equals(taskResult)) {
                    taskQueue.add("新任务");
                    //todo 去告知任务队列
                }

                String dbResult = taskResult + "do do do";
                //END
            }

        }, "处理任务结果").start();


    }
}
