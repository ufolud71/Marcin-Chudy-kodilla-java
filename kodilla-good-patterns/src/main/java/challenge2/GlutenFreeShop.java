package challenge2;

public class GlutenFreeShop implements Shop {
    private PurchaseService purchaseService;

    public GlutenFreeShop (PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @Override
    public void process(PurchaseRequestRetriever purchaseRequestRetriever) {
        System.out.println("Starting your order at GlutenFreeShop");
        purchaseRequestRetriever.retrieve();
        boolean purchaseCompleted = purchaseService.buy(purchaseRequestRetriever.getUser(), purchaseRequestRetriever.getItem(), purchaseRequestRetriever.getQuantity());
        System.out.println("User: " + purchaseRequestRetriever.getUser() + "." + " Your order consist of: " +
                purchaseRequestRetriever.getItem() + " in quantity of: " + purchaseRequestRetriever.getQuantity());

        if (purchaseCompleted) {
            System.out.println("Your order at GlutenFreeShop was created successfully");

        } else {
            System.out.println("There was an error!");
        }
    }
}

