package interfacestrategy.use;

import interfacestrategy.api.IProductCrawlApi;
import interfacestrategy.entity.ProductCraw;
import interfacestrategy.entity.ProductCrawSpec;
import interfacestrategy.helper.ProductCrawlApiHelper;

public class WalmartUse {

    public ProductCrawlApiHelper productCrawlApiHelper = new ProductCrawlApiHelper();

    public ProductCraw crawlWalmartProductCraw(String link) {
        IProductCrawlApi api = productCrawlApiHelper.getApi("Walmart");
        ProductCraw productCraw = api.crawlingSPU(link);
        return productCraw;
    }

    public ProductCrawSpec crawlWalmartProductCrawSpec(String link) {
        IProductCrawlApi api = productCrawlApiHelper.getApi("Walmart");
        ProductCrawSpec productCrawSpec = api.crawlingSKU(link);
        return productCrawSpec;
    }
}
