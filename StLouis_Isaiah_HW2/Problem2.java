import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        boolean isPrime = false; //create a boolean and make it false and change it to true when it isn't a prime number
        if (num == 0 || num == 1){
            isPrime = true; // both 0 and 1 aren't prime numbers
        }
        for (int i = 2; i < num; i++) { // loop starts at two and goes through all values up until the num inputted by the user
            if (num % i == 0) { //checks to see if there is any remainder when the number inputted and the loop value are divided
                isPrime = true;
                break;
            }

        } if(!isPrime){ // had trouble figuring out a way to have it print out in the loop but figured I could use logical operators on the boolean
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }

    }
}
