package interfacestrategy.api;

import interfacestrategy.entity.ProductCraw;
import interfacestrategy.entity.ProductCrawSpec;

public interface IProductCrawlApi {

    ProductCraw crawlingSPU(String link);

    ProductCrawSpec crawlingSKU(String link);

}
