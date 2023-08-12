package src.behavioral.visitor.credit_card.offers;

import src.behavioral.visitor.credit_card.cards.Brown;
import src.behavioral.visitor.credit_card.cards.Gold;
import src.behavioral.visitor.credit_card.cards.Silver;

public interface OfferVisitor {

    void visit(Brown brown);
    void visit(Silver silver);
    void visit(Gold gold);

}
