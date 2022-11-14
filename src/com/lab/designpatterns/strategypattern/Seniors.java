package com.lab.designpatterns.strategypattern;

import java.math.BigDecimal;

public class Seniors implements TicketOffice{

    @Override
    public int computeTicketPrice() {
        // TODO Auto-generated method stub
        return 12;
    }

    @Override
    public int computeTicketPriceWithTax(int tax) {
        // TODO Auto-generated method stub
        return 12 + tax;
    }

}
