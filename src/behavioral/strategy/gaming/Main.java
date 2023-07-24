package src.behavioral.strategy.gaming;

import src.behavioral.strategy.gaming.heros.IHero;
import src.behavioral.strategy.gaming.heros.SpiderMan;
import src.behavioral.strategy.gaming.heros.SuperMan;
import src.behavioral.strategy.gaming.powers.Fight;
import src.behavioral.strategy.gaming.powers.Fly;
import src.behavioral.strategy.gaming.powers.ISuperPower;
import src.behavioral.strategy.gaming.powers.Run;

public class Main {

    public static void main(String[] args) {

        IHero spiderMan = new SpiderMan();
        System.out.println(spiderMan.DoHeroStuff());
        ISuperPower run = new Run();
        spiderMan.changeSuperPower(run);
        System.out.println(spiderMan.DoHeroStuff());
        ISuperPower fly = new Fly();
        spiderMan.changeSuperPower(fly);
        System.out.println(spiderMan.DoHeroStuff());

        IHero superMan = new SuperMan();
        System.out.println(superMan.DoHeroStuff());
        ISuperPower fight = new Fight();
        superMan.changeSuperPower(fight);
        System.out.println(superMan.DoHeroStuff());

    }
}
