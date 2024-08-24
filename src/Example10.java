

public class Example10 {
    public static void main(String[] args) {
        String color = "red";

        if (color.equals("red") || color.equals("blue")) {
            System.out.println("Yay! I love red and blue");
        } else {
            System.out.println("That's not one of my favorite colors!");
        }

        int score = 10;

        if (score <= 25) {
            System.out.println(color + " isn't my favorite");
        } else if (score <= 50) {
            System.out.println(color + " is a good color");
        } else {
            System.out.println(color + " is my favorite!");
        }
    }
}
