package homework.hw6;

import homework.hw6.heroes.DarkElf;
import homework.hw6.heroes.Elf;
import homework.hw6.heroes.HeroCharacteristics;

/**
 * Created by OS on 22.10.2018.
 */
public class Application {
    public static void main(String[] args) {


        HeroCharacteristics darkElf = new DarkElf("Haru6aTop");

        System.out.println(String.format("-----------Показатели %s------------------------\n", darkElf.getHeroNickname()));

        darkElf.shootingCharacter(100);
        darkElf.stunningShotCharacteristics();
        darkElf.ultimateCharacteristics();

        HeroCharacteristics elf = new Elf("xxxCTPEJlOKxxx");

        System.out.println(String.format("-----------Показатели %s------------------------\n", elf.getHeroNickname()));


        elf.shootingCharacter(100);
        elf.stunningShotCharacteristics();
        elf.ultimateCharacteristics();
    }
}