package strategy.attack;

import strategy.attack.weapons.BowAttack;
import strategy.attack.weapons.SwordAttack;

public class Main {


    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.performAttack();

        AttackStrategy strategy = new BowAttack();
        gameCharacter.changeStrategy(strategy);
        gameCharacter.performAttack();

        strategy = new SwordAttack();
        gameCharacter.changeStrategy(strategy);
        gameCharacter.performAttack();

    }


}
