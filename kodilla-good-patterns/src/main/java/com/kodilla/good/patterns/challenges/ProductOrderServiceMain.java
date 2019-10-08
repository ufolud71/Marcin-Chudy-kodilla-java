package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceMain {
    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseReQuestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseReQuestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ProductPurchase(), new ProductPurchaseRepository());
        productOrderService.process(purchaseRequest);

    }
}
