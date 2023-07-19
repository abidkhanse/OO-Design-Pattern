package strategy.gaming;

import strategy.gaming.heros.IHero;
import strategy.gaming.heros.SpiderMan;
import strategy.gaming.heros.SuperMan;
import strategy.gaming.powers.Fight;
import strategy.gaming.powers.Fly;
import strategy.gaming.powers.ISuperPower;
import strategy.gaming.powers.Run;

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
