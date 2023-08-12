package src.behavioral.visitor.credit_card.offers;

import src.behavioral.visitor.credit_card.cards.Brown;
import src.behavioral.visitor.credit_card.cards.Gold;
import src.behavioral.visitor.credit_card.cards.Silver;

public class GasStationVisitor implements OfferVisitor {
    @Override
    public void visit(Brown brown) {
        System.out.println("Computing a Gas cashback for Brown credit card");
    }

    @Override
    public void visit(Silver silver) {
        System.out.println("Computing a Gas cashback for Silver credit card");
    }

    @Override
    public void visit(Gold gold) {
        System.out.println("Computing a Gas cashback for Gold credit card");
    }

}
