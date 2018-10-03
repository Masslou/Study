package homework.hw3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String firstString = "ВечностЬ";
        String secondString = "Свет - ночь1";

        String pattern = "[^а-яА-Яa-zA-Z]";

        char[] lettersFirst = firstString.replaceAll(pattern, "").toLowerCase().toCharArray();
        char[] lettersSecond = secondString.replaceAll(pattern, "").toLowerCase().toCharArray();


        if (lettersFirst.length == lettersSecond.length) {

            Arrays.sort(lettersFirst);
            Arrays.sort(lettersSecond);

            if (Arrays.equals(lettersFirst, lettersSecond)) {

                itsAnagram();

            } else {

                notAnagram();
            }

        } else {

            notAnagram();
        }
    }


    public static void notAnagram() {
        System.out.println("This is NOT anagram");
    }

    public static void itsAnagram() {
        System.out.println("This is anagram");
    }


}

