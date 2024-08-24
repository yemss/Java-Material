import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        // Scanner class

        // scanner is an object
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your username? ");

        // next() is a function, just like println()
        String username = scanner.next();
        System.out.println("Hello there, " + username);
        System.out.println("Do you like cupcakes or ice cream? ");
        String snack = scanner.next();
        System.out.println("Mhm... that snack is amazing!");
    }
}
