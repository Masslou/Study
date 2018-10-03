package homework.hw3;

public class CapitalLetter {

    public static void main(String[] args) {

        String s = "Истина — это то, что выдерживает проверку опытом. Эйнштейн а.";

        String[] splitedArray = s.split(" ");
        int ARRAY_SIZE = splitedArray.length;
        String[] newArray = new String[ARRAY_SIZE];

        for (int i = 0; i < splitedArray.length; i++) {

            String firstChar = splitedArray[i].substring(0, 1);
            String template = firstChar.toUpperCase().concat(splitedArray[i].substring(1));

            newArray[i] = template;

        }

        String joinedArray = String.join(" ", newArray);

        System.out.println(joinedArray);

    }
}

