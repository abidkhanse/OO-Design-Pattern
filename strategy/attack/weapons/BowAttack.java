package strategy.attack.weapons;

import strategy.attack.AttackStrategy;

public class BowAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking with bow");
    }
}
