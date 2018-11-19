package homework.hw6.heroes;


import homework.hw6.heroes.skillsinterfaces.IRun;
import homework.hw6.heroes.skillsinterfaces.IShooting;
import homework.hw6.heroes.skillsinterfaces.IStunningShot;
import homework.hw6.heroes.skillsinterfaces.IUltimate;

public abstract class HeroCharacteristics {

    IRun run;
    IShooting shooting;
    IStunningShot stunningShot;
    IUltimate ultimate;


    private String heroNickname;

    public HeroCharacteristics(String nameCharacter) {
        this.heroNickname = nameCharacter;
    }

    public String getHeroNickname() {
        return heroNickname;
    }


    public void stunningShotCharacteristics() {
        System.out.println(String.format("Stunning shot by %s acts for %s seconds", heroNickname, stunningShot.stun()));
    }


    public void runCharacter() {
        System.out.println(String.format("%s running with speed %s ", heroNickname, run.run()));
    }

    public void shootingCharacter(int defaultDamage) {
        System.out.println(String.format("%s makes damage on %s points", heroNickname, shooting.shootingDamage(defaultDamage)));
    }

    public void ultimateCharacteristics() {
        ultimate.ultimate();
    }

}