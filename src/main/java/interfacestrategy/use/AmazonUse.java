package interfacestrategy.use;

import interfacestrategy.api.IProductCrawlApi;
import interfacestrategy.entity.ProductCraw;
import interfacestrategy.entity.ProductCrawSpec;
import interfacestrategy.helper.ProductCrawlApiHelper;

import java.util.List;

public class AmazonUse {

    public ProductCrawlApiHelper productCrawlApiHelper = new ProductCrawlApiHelper();

    public ProductCraw crawlAmazonProductCraw(String link) {
        IProductCrawlApi api = productCrawlApiHelper.getApi("amazon");
        ProductCraw productCraw = api.crawlingSPU(link);
        return productCraw;
    }

    public ProductCrawSpec crawlAmazonProductCrawSpec(String link) {
        IProductCrawlApi api = productCrawlApiHelper.getApi("amazon");
        ProductCrawSpec productCrawSpec = api.crawlingSKU(link);
        return productCrawSpec;
    }

    public List<ProductCraw> crawl(List<String> link) {
        //处理一遍link 变成sku;

        for (int i = 0; i < 100; i++) {
            //现在是多线程区域
            String s = link.get(i);
            //在这里加个锁
            IProductCrawlApi api = productCrawlApiHelper.getApi("amazon");
            ProductCrawSpec productCrawSpec = api.crawlingSKU(s);
            //save or update 入库完成 ，结束


        }

        return null;
    }


}
