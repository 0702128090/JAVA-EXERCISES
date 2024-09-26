
//A JAVA PROGRAM FOR GRADING USING SWITCH STATEMENTS
import java.util.Scanner;

public class SWITCHEXERCISE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER MARKS:");
        int marks = scanner.nextInt();
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 4:
                System.out.println("PASS");
                break;
            default:
                System.out.println("FAIL");
        }
        scanner.close();
    }
}