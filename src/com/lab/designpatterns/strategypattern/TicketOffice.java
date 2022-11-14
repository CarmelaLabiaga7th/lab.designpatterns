package com.lab.designpatterns.strategypattern;

import java.math.BigDecimal;

public interface TicketOffice {
    int computeTicketPrice();
    int computeTicketPriceWithTax(int tax);
}
