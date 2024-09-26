
//EVALUATION OF MARKS
import java.util.Scanner;

public class RANGEEXERCISE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n > 90) {
            System.out.println("EXCELLENT. ");
        } else if (n > 80) {
            System.out.println("VERY GOOD.");
        } else if (n > 70) {
            System.out.println("GOOD.");
        } else if (n > 60) {
            System.out.println("MEDIUM.");
        } else if (n > 50) {
            System.out.println("PASS.");
        } else {
            System.out.println("FAIL.");
        }
        sc.close();
    }
}