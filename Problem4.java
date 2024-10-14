import java.util.Scanner;
public class Problem4
{
    public static void main(String[] args)
    {
        System.out.println("Enter a letter: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        switch (letter) {
            case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
                System.out.println("This letter is a Vowel");
                break;
            case 'B', 'b', 'C', 'c', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z':
                System.out.println("This letter is a consonant");
                break;
        }

        // Must be an easier way to do this.// This way seems very inefficient
    }
}
