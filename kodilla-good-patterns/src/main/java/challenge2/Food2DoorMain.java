package challenge2;

public class Food2DoorMain {
    public static void main(String[] args) {
        PurchaseRequestRetriever order = new PurchaseRequestRetriever(new User("Marcin", "Olender", "olendrix"),"Salmon", 3);
        PurchaseService purchaseService = new PurchaseService();
        ExtraFoodShop shop = new ExtraFoodShop();
        purchaseService.processOrder(shop, order);
    }
}