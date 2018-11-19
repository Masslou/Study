package homework.hw6.heroes;

public class DarkElf extends HeroCharacteristics {
    public DarkElf(String nameCharacter) {
        super(nameCharacter);

        super.run = () -> 30;
        super.shooting = damage -> damage * 1.5;
        super.stunningShot = () -> 30;
        super.ultimate = () -> System.out.println("Ultimate skill is super agility");
    }
}
