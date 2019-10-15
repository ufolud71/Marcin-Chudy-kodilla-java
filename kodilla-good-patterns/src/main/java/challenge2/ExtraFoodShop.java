package challenge2;

public class ExtraFoodShop implements Shop {
    private PurchaseService purchaseService;

    public ExtraFoodShop(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @Override
    public void process(final PurchaseRequestRetriever purchaseRequestRetriever) {
        System.out.println("Starting your order at ExtraFoodShop");
        purchaseRequestRetriever.retrieve();
        boolean purchaseCompleted = purchaseService.buy(purchaseRequestRetriever.getUser(), purchaseRequestRetriever.getItem(), purchaseRequestRetriever.getQuantity());
        System.out.println("User: " + purchaseRequestRetriever.getUser() + "." + " Your order consist of: " +
                purchaseRequestRetriever.getItem() + " in quantity of: " + purchaseRequestRetriever.getQuantity());

        if(purchaseCompleted) {
            System.out.println("Your order at ExtraFoodShop was created successfully");

        } else {
            System.out.println("There was an error!");
        }
    }
}
