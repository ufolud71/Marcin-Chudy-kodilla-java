package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PurchaseRepository {

    public boolean createPurchase(User user, String item, LocalDateTime date);
}