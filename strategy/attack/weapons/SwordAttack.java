package strategy.attack.weapons;

import strategy.attack.AttackStrategy;

public class SwordAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking with sword");
    }
}
