
/**
 * main
 */
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Addition of numbers

        // int a = Sc.nextInt();
        // int b = Sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // If else statement's

        // int button = sc.nextInt();

        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaste");
        // } else {
        // System.out.println("Bonjour");
        // }

        // Switch statement's

        // int button = sc.nextInt();

        // switch (button) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Sunday");
        // break;
        // }

        // Homework on Switch statement's

        // int button = sc.nextInt();

        // switch (button) {
        // case 1:
        // System.out.println("January");
        // break;
        // case 2:
        // System.out.println("February");
        // break;
        // case 3:
        // System.out.println("March");
        // break;
        // case 4:
        // System.out.println("April");
        // break;
        // case 5:
        // System.out.println("May");
        // break;
        // case 6:
        // System.out.println("June");
        // break;
        // case 7:
        // System.out.println("July");
        // break;
        // case 8:
        // System.out.println("Aguest");
        // break;
        // case 9:
        // System.out.println("September");
        // break;
        // case 10:
        // System.out.println("October");
        // break;
        // case 11:
        // System.out.println("November");
        // break;
        // default:
        // System.out.println("December");
        // break;
        // }

        // Calculator

        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
        switch (button) {
            case 1:
                int sum = a + b;
                System.out.println(sum);
                break;
            case 2:
                int sum2 = a - b;
                System.out.println(sum2);
                break;
            case 3:
                int sum3 = a * b;
                System.out.println(sum3);
                break;
            case 4:
                int sum4 = a / b;
                System.out.println(sum4);
                break;
            case 5:
                int sum5 = a % b;
                System.out.println(sum5);
                break;
            default:
                System.out.println("Invalid answer");
                break;
        }
    }
}
