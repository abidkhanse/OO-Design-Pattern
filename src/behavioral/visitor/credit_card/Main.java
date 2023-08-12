package src.behavioral.visitor.credit_card;

import src.behavioral.visitor.credit_card.cards.Brown;
import src.behavioral.visitor.credit_card.cards.CreditCard;
import src.behavioral.visitor.credit_card.cards.Gold;
import src.behavioral.visitor.credit_card.cards.Silver;
import src.behavioral.visitor.credit_card.offers.GasStationVisitor;
import src.behavioral.visitor.credit_card.offers.HotelStationVisitor;
import src.behavioral.visitor.credit_card.offers.OfferVisitor;

public class Main {
    public static void main(String[] args) {

        CreditCard  silver  = new Silver();
        CreditCard  gold    = new Gold();
        CreditCard  brown   = new Brown();

        OfferVisitor gasStationVisitor = new GasStationVisitor();
        silver.accept(gasStationVisitor);
        gold.accept(gasStationVisitor);
        brown.accept(gasStationVisitor);

        System.out.println("*****************************");

        OfferVisitor hotelStationVisitor = new HotelStationVisitor();
        silver.accept(hotelStationVisitor);
        gold.accept(hotelStationVisitor);
        brown.accept(hotelStationVisitor);;

    }
}
