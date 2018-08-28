package HW1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        calculateMethod(questionMethod());
    }

    public static ArrayList questionMethod() {

        Scanner scan = new Scanner(System.in);
        int firstValue;
        int secondValue;
        String operationType;

        System.out.println("Please input first value");
        firstValue = scan.nextInt();

        System.out.println("Please input second value");
        secondValue = scan.nextInt();

        System.out.println("Please choose the operation type ( + - * / )");
        operationType = scan.next();

        ArrayList list = new ArrayList() {{
            add(0, firstValue);
            add(1, secondValue);
            add(2, operationType);
        }};

        return list;
    }

    public static void calculateMethod(ArrayList list) {
        long calculateResult = 0;

        if (list != null) {

            int operand1 = (int) list.get(0);
            int operand2 = (int) list.get(1);
            String sign = (String) list.get(2);

            switch (sign) {

                case "+":
                    print(operand1 + operand2);
                    break;

                case "-":
                    print(operand1 - operand2);
                    break;

                case "*":
                    print(operand1 * operand2);
                    break;

                case "/":
                    if (operand1 == 0 || operand2 == 0) {
                        System.out.println("ERROR: division by zero!");
                        break;

                    } else {
                        print(operand1 / operand2);
                        break;
                    }
            }
        } else {
            System.out.println("NULL");
        }
    }

    public static void print(long args) {
        System.out.println(args);
    }
}