package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PurchaseService {

    public boolean buy(User user, String item, LocalDateTime date);

}
