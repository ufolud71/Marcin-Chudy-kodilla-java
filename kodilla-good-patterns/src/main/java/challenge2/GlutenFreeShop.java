package challenge2;

public class GlutenFreeShop {
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;
    private InformationService informationService;

    public GlutenFreeShop(PurchaseService purchaseService, PurchaseRepository purchaseRepository, InformationService informationService) {
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
        this.informationService = informationService;
    }

    public PurchaseDto process(final PurchaseRequest purchaseRequest) {
        System.out.println("Your order at GlutenFreeShop has started");

        boolean purchaseCompleted = purchaseService.buy(purchaseRequest);

        if(purchaseCompleted) {
            informationService.inform(purchaseRequest.getUser());
            purchaseRepository.createPurchase(purchaseRequest);
            return new PurchaseDto(purchaseRequest.getUser(), true);
        } else {
            return new PurchaseDto(purchaseRequest.getUser(), false);
        }
    }
}


