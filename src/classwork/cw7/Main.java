package classwork.cw7;

public class Main {
    public static void main(String[] args) {


        doOperation((double a, double b) -> {
            return a * b;
        });

    }

    public static void doOperation(Operation oper) {

        System.out.println("Start doOperation");

        double result = oper.execute(10, 5);
        System.out.println("result: " + result);
        System.out.println("End doOpetarion");
    }

}
