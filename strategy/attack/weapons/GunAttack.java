package strategy.attack.weapons;

import strategy.attack.AttackStrategy;

public class GunAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking with gun");
    }
}
