package strategy.attack;

public class GameCharacter {
    public AttackStrategy attackStrategy;

    public void changeStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    void performAttack() {
        if (attackStrategy != null) {
            attackStrategy.attack();
        } else {
            System.out.println("No weapon strategy set");
        }
    }

}
