package com.lab.designpatterns.strategypattern;

public class TicketContext {
    private TicketOffice ticketOffice;

    public TicketContext(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public int calculateTicketPrice() {
        return ticketOffice.computeTicketPrice();
    }

    public int calculatTicketPriceWithTax(int tax) {
       return ticketOffice.computeTicketPriceWithTax(tax); 
    }

}
