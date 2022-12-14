package com.lab.designpatterns.number2strategy;

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
