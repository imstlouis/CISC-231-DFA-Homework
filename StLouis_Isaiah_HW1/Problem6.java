import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Hello, enter three numbers: ");
        System.out.println("Hello, enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Hello, enter a number: ");
        int num2 = scanner.nextInt();
        System.out.println("Hello, enter a number: ");
        int num3 = scanner.nextInt();
        if ((num1 > num2) && (num1 > num3)) {  // if num 1 is greater than both num 2 and num 3
            if (num3 > num2) {  // if num 3 is greater than num 2 it will be placed before num 2
                System.out.println("Here is the order from largest to smallest: " + num1 + " " + num3 + " " + num2);

            } else {
                System.out.println("Here is the order from largest to smallest: " + num1 + " " + num2 + " " + num3);
            }
        } else if ((num2 > num3) && (num2 > num1)) {  // if num 2 is greater than both num 1 and num 3
            if (num3 > num1) {
                System.out.println("Here is the order from largest to smallest: " + num2 + " " + num3 + " " + num1);

            } else {
                System.out.println("Here is the order from largest to smallest: " + num2 + " " + num1 + " " + num3);
            }
        } else if ((num3 > num1) && (num3 > num2)) {   // if num 3 is greater than both num 1 and num 2
            if (num2 > num1) {
                System.out.println("Here is the order from largest to smallest: " + num3 + " " + num2 + " " + num1);

            } else {
                System.out.println("Here is the order from largest to smallest: " + num3 + " " + num1 + " " + num2);
            }
        }

    }
}
