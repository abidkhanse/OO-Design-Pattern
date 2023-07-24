package src.behavioral.strategy.attack.weapons;

import src.behavioral.strategy.attack.AttackStrategy;

public class BowAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking with bow");
    }
}
