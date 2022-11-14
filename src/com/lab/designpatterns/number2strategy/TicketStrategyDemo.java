package com.lab.designpatterns.number2strategy;

public class TicketStrategyDemo {
    
    public static void main(String[] args) {
        TicketContext ticketContextAdults = new TicketContext(new Adults());
        TicketContext ticketContextChildren = new TicketContext(new Children());
        TicketContext ticketContextSeniors = new TicketContext(new Seniors());
        
        System.out.print("One adult: " );
        System.out.println("No tax: " + ticketContextAdults.calculateTicketPrice());
        System.out.println("With tax: " + ticketContextAdults.calculatTicketPriceWithTax(12));
        System.out.print("One child: " );
        System.out.println("No tax: " + ticketContextChildren.calculateTicketPrice());
        System.out.println("With tax: " + ticketContextAdults.calculatTicketPriceWithTax(0));
        System.out.print("One senior: " );
        System.out.println("No tax: " + ticketContextSeniors.calculateTicketPrice());
        System.out.println("tax: " + ticketContextAdults.calculatTicketPriceWithTax(0));
        
        
        
        System.out.print("Two children, one adult: " );
        System.out.println(ticketContextChildren.calculateTicketPrice() + ticketContextChildren.calculateTicketPrice() + ticketContextAdults.calculateTicketPrice());
        
        System.out.print("One adult, one child, one senior: ");
        System.out.println(ticketContextAdults.calculateTicketPrice() + ticketContextChildren.calculateTicketPrice() + ticketContextSeniors.calculateTicketPrice());
        
        System.out.print("Three seniors: ");
        System.out.println(ticketContextSeniors.calculateTicketPrice() + ticketContextSeniors.calculateTicketPrice() + ticketContextSeniors.calculateTicketPrice());
        
    }

}
