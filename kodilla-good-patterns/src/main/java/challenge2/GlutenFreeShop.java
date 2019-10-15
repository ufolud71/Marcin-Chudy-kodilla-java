package challenge2;

public class GlutenFreeShop implements Shop{

    @Override
    public void process(PurchaseRequestRetriever purchaseRequestRetriever) {
        System.out.println("Starting your order at GlutenFreeShop");
    }
}
