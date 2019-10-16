package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private User user;
    private String item;
    private LocalDateTime date;

    public PurchaseRequest(User user, String item, LocalDateTime date) {
        this.user = user;
        this.item = item;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
