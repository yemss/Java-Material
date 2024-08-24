public class Example13 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter == 20) {
            System.out.println("Hi");
            counter++;
        }
        /* while (true) {...} prints indefinitely, causing a stacktrace error!*/
    }
}
