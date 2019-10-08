package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductPurchase implements PurchaseService {

    public ProductPurchase() {

    }


    @Override
    public boolean buy(User user, String item, LocalDateTime date) {
        return false;
    }
}
