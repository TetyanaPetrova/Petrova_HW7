import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PetrovaHW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.print("Enter first number: ");
        list.add(in.next());
        System.out.print("Enter operation: ");
        list.add(in.next());
        System.out.print("Enter second number: ");
        list.add(in.next());
        if (!list.get(1).equals("PLUS") &&
                !list.get(1).equals("MINUS") &&
                !list.get(1).equals("MULTIPLICATION") &&
                !list.get(1).equals("DIVISION") &&
                !list.get(1).equals("REMAINDER")
        ) {

            System.out.println("Result: null");
            ;

        } else {
            Integer result = calculate(list);

            System.out.println("Result: " + result);
        }
    }

    public static Integer calculate(List<String> list) {
        Integer c = 0;
        int a = Integer.valueOf(list.get(0));
        int b = Integer.valueOf(list.get(2));
        PetrovaHW4enum operation = PetrovaHW4enum.valueOf(list.get(1));

        if (b == 0 && PetrovaHW4enum.valueOf(list.get(1)).equals(PetrovaHW4enum.valueOf("DIVISION"))) {

            return null;

        } else {
            switch (operation) {
                case PLUS:
                    c = a + b;
                    break;
                case MINUS:
                    c = a - b;
                    break;
                case MULTIPLICATION:
                    c = a * b;
                    break;
                case DIVISION:
                    c = a / b;
                    break;
                case REMAINDER:
                    c = a % b;
                    break;
                default:
                    return null;
            }
            return c;
        }
    }

}
