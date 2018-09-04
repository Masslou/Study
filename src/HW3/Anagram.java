package HW3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String firstString = "Вечность";
        String secondString = "Свет - ночь1";

        String pattern = "[^а-яА-Яa-zA-Z]";

        char[] lettersFirst = firstString.replaceAll(pattern, "").toLowerCase().toCharArray();
        char[] lettersSecond = secondString.replaceAll(pattern, "").toLowerCase().toCharArray();


        if (lettersFirst.length == lettersSecond.length) {

            Arrays.sort(lettersFirst);
            Arrays.sort(lettersSecond);

            if (Arrays.equals(lettersFirst, lettersSecond)) {
                System.out.println("Это анаграмма!");
            } else {
                System.out.println("Это не анаграмма!");
            }

        } else {
            System.out.println("Это не анаграмма!");
        }
    }

}

