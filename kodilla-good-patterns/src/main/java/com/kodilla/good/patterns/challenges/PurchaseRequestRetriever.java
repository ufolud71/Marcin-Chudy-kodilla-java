package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {

        User user = new User("kovalski01", "Janusz", "Kowalski");

        String item = "Toothbrush";
        LocalDateTime date = LocalDateTime.of(2019, 8, 10, 18, 15);

        return new PurchaseRequest(user, item, date);
    }
}