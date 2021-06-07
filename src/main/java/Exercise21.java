import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise21 {
    public static void main(String[] args) {

        System.out.println("Please enter the number of the month: ");
        Scanner input = new Scanner(in);
        String month = input.nextLine();
        int x = Integer.parseInt(month);

        switch(x)
        {
            case 1:
                System.out.println("The name of the month is January.");
                break;
            case 2:
                System.out.println("The name of the month is February .");
                break;
            case 3:
                System.out.println("The name of the month is March .");
                break;
            case 4:
                System.out.println("The name of the month is April .");
                break;
            case 5:
                System.out.println("The name of the month is May.");
                break;
            case 6:
                System.out.println("The name of the month is June.");
                break;
            case 7:
                System.out.println("The name of the month is July.");
                break;
            case 8:
                System.out.println("The name of the month is August.");
                break;
            case 9:
                System.out.println("The name of the month is September.");
                break;
            case 10:
                System.out.println("The name of the month is October.");
                break;
            case 11:
                System.out.println("The name of the month is November.");
                break;
            case 12:
                System.out.println("The name of the month is December.");
                break;
            default:
                System.out.println("That is not a month.");
        }
        }
    }