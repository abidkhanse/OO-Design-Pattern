package src.behavioral.visitor.credit_card.cards;

import src.behavioral.visitor.credit_card.offers.OfferVisitor;

public interface CreditCard {
    void accept(OfferVisitor offerVisitor);
    String getName();
}
