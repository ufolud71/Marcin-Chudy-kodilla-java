package challenge2;

public class Food2DoorMain {
    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        ExtraFoodShop order1 = new ExtraFoodShop(new ProductPurchase());
        order1.process(purchaseRequestRetriever);
    }
}
