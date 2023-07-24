package src.behavioral.strategy.attack.weapons;


import src.behavioral.strategy.attack.AttackStrategy;

public class GunAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking with gun");
    }
}
