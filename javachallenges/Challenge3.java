package javachallenges;
import java.util.Scanner;

public class Challenge3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces and punctuation
        String cleanInput = input.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        // Check palindrome
        if (cleanInput.equals(reversed)) {
            System.out.println("Is Palindrome? True");
        } else {
            System.out.println("Is Palindrome? False");
        }

        scanner.close();
    }
}

