package strategy.gaming.heros;

import strategy.gaming.powers.ISuperPower;

public class Hero implements IHero {
    ISuperPower iSuperPower;

    public Hero(ISuperPower iSuperPower) {
        this.iSuperPower = iSuperPower;
    }

    @Override
    public String DoHeroStuff() {
        return iSuperPower.ExercisePower();
    }

    @Override
    public void changeSuperPower(ISuperPower iSuperPower) {
        this.iSuperPower = iSuperPower;
    }

}

