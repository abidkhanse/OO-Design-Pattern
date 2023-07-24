package src.behavioral.strategy.attack;

import src.behavioral.strategy.attack.weapons.BowAttack;
import src.behavioral.strategy.attack.weapons.SwordAttack;

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
