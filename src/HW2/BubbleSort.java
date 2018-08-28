package HW2;

import java.util.Scanner;

public class BubbleSort {

    final static int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        printArray(sorter(userAnswer()));

    }


    static int[] userAnswer() {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[ARRAY_SIZE];
        int arrayElement;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println("Укажите элемент массива # " + (i + 1));
            arrayElement = scanner.nextInt();

            array[i] = arrayElement;

        }


        return array;
    }

    static int[] sorter(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int template = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = template;
                }
            }
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int v : array) {
            System.out.print(v + " ");
        }
    }

}
