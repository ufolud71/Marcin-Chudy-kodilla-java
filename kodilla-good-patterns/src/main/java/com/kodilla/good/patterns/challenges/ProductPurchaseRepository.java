package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductPurchaseRepository implements PurchaseRepository {

    public ProductPurchaseRepository() {

    }

    @Override
    public boolean createPurchase(User user, String item, LocalDateTime date) {
        return false;
    }
}
