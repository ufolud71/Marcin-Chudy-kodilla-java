package challenge2;

public class HealthyShop implements Shop{

    @Override
    public void process(PurchaseRequestRetriever purchaseRequestRetriever) {
        System.out.println("Starting your order at HealthyShop");
    }
}
