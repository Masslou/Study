package homework.hw6.heroes;

public class Elf extends HeroCharacteristics {
    public Elf(String nameCharacter) {
        super(nameCharacter);

        super.run = () -> 45;
        super.shooting = damage -> damage * 1.3;
        super.stunningShot = () -> 30;
        super.ultimate = () -> System.out.println("Ultimate skill is super rush");
    }


}