package interfacestrategy.api;

import interfacestrategy.entity.ProductCraw;
import interfacestrategy.entity.ProductCrawSpec;

public class WalmartApi implements IProductCrawlApi{
    @Override
    public ProductCraw crawlingSPU(String link) {
        return null;
    }

    @Override
    public ProductCrawSpec crawlingSKU(String link) {
        return null;
    }
}
