package challenge2;

public class Food2DoorMain {
    public static void main(String[] args) {
        PurchaseService purchaseService = new PurchaseService();

        PurchaseRequestRetriever order1 = new PurchaseRequestRetriever(new User("Marcin", "Olender", "HotMarta69"),"Salmon", 3);
        ExtraFoodShop shop1 = new ExtraFoodShop();
        purchaseService.processOrder(shop1, order1);

        PurchaseRequestRetriever order2 = new PurchaseRequestRetriever(new User("Tomasz", "Pietkun", "NoobMaster69"),"Tofu", 2);
        GlutenFreeShop shop2 = new GlutenFreeShop();
        purchaseService.processOrder(shop2, order2);

        PurchaseRequestRetriever order3 = new PurchaseRequestRetriever(new User("Maciej", "Romanowski", "Gruby111222"),"Everything", 100);
        HealthyShop shop3 = new HealthyShop();
        purchaseService.processOrder(shop3, order3);
    }
}