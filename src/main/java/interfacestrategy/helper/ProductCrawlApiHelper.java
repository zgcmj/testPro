package interfacestrategy.helper;

import interfacestrategy.api.AmazonApi;
import interfacestrategy.api.IProductCrawlApi;
import interfacestrategy.api.WalmartApi;

public class ProductCrawlApiHelper {

    public IProductCrawlApi getApi(String name) {
        switch (name) {
            case "amazon":
                return new AmazonApi();
            case "walmart":
                return new WalmartApi();
            default:
                throw new UnsupportedOperationException("不支持的采集平台: ");
        }
    }
}
