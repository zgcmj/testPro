package interfacestrategy.api;

import interfacestrategy.entity.ProductCraw;
import interfacestrategy.entity.ProductCrawSpec;
import thread.NamedThreadFactory;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AmazonApi implements IProductCrawlApi {


    //线程池
    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS,
            new SynchronousQueue<>(),
            new NamedThreadFactory("productCrawl"));

    @Override
    public ProductCraw crawlingSPU(String link) {
        return crawlingSPU0(link);
    }
    private ProductCraw crawlingSPU0(String link){
        String create = "通过link 发起第一次请求 得到返回结果";
        String one = "解析一层地址";
        //存储一次结果
        for (int i = 0; i < 100; i++) {
            String two = "通过线程疯狂发送请";
        }
        //存储 需要 发送的结果

        //需要进行一次去重复

        //传递回调函数 todo  这里进行去重复  可以不做,只返回SKU列表值

        //再来一个线程进行抓取
        for (int i = 0; i < 100; i++) {
            String three = "通过线程疯狂发送请";
        }
        //最后封装数据
        link = "";
        return new ProductCraw();
    }

    @Override
    public ProductCrawSpec crawlingSKU(String link) {
        return crawlingSKU0(link);
    }

    private ProductCrawSpec crawlingSKU0(String link) {
        String create = "new CreateHttp";
        String one = "解析第一次请求";
        String two = "封装数据";
        String three = "返回结果";
        return null;
    }

}
