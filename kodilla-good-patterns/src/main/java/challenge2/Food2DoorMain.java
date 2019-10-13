package challenge2;

public class Food2DoorMain {
    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new ProductPurchase(), new ProductPurchaseRepository(), new Mail());
        extraFoodShop.process(purchaseRequest);
    }
}
