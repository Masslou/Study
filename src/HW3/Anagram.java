package HW3;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Я в мире — сирота.";
        String str2 = "Я в риме — Ариост.";

        String[] words1 = str1.replaceAll("[^а-яА-Я ]", "").toLowerCase().split("\\s+");
        String[] words2 = str2.replaceAll("[^а-яА-Я ]", "").toLowerCase().split("\\s+");

        if (words1.length == words2.length) {
            boolean flag = false;
            for (int i = 0; i < words1.length; i++) {
                if (!words1[i].equals(words2[i])) {
                    String[] templateArray1 = words1[i].split("");
                    String[] templateArray2 = words2[i].split("");

                    if (templateArray1.length != templateArray2.length) {

                        flag = true;
                        break;
                    }

                    for (int j = 0; j < templateArray1.length; j++) {
                        if (words2[i].indexOf(templateArray1[j]) == -1) {
                            System.out.println("Слова не являются аннаграммой");
                            flag = true;
                            break;
                        }

                    }

                }
            }
            if (flag) {
                System.out.println("Слова не являются анаграммой");
            } else {
                System.out.println("Слова являются анаграммой");
            }
        } else {
            System.out.println("Слова не являются анаграммой");
        }
    }
}

