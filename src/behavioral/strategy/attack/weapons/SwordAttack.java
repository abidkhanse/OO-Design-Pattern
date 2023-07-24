package src.behavioral.strategy.attack.weapons;
import src.behavioral.strategy.attack.AttackStrategy;

public class SwordAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking with sword");
    }
}
