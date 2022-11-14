package com.lab.designpatterns.number2strategy;

import java.math.BigDecimal;

public interface TicketOffice {
    int computeTicketPrice();
    int computeTicketPriceWithTax(int tax);
}
