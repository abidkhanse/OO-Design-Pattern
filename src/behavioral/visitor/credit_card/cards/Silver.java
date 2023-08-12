package src.behavioral.visitor.credit_card.cards;
import src.behavioral.visitor.credit_card.offers.OfferVisitor;

public class Silver implements CreditCard {

    @Override
    public void accept(OfferVisitor offerVisitor) {
        offerVisitor.visit(this);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
