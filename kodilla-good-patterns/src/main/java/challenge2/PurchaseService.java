package challenge2;

public class PurchaseService {

    public void processOrder(Shop shop, PurchaseRequestRetriever purchaseRequestRetriever) {
        System.out.println("Starting your order...");
        shop.process(purchaseRequestRetriever);
        System.out.println("User: [" + purchaseRequestRetriever.getUser().getUsername() +
                "] Your order: [" + purchaseRequestRetriever.getItem() + "], in quantity of: [" + purchaseRequestRetriever.getQuantity() + "]");
        System.out.println("Purchase completed");
    }
}
