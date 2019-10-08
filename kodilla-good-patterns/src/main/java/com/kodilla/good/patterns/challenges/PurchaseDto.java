package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    public User user;
    public boolean purchaseCompleted;

    public PurchaseDto(User user, boolean purchaseCompleted) {
        this.user = user;
        this.purchaseCompleted = purchaseCompleted;
    }

    public User getUser() {
        return user;
    }

    public boolean isCompleted() {
        return purchaseCompleted;
    }
}


