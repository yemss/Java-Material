public class Example2 {
    public static void main(String[] args) {
        int factor = 1;
        boolean isHundred = false;
        System.out.println("factor before:" + factor);
        int lastMultiple = 0;

        /* or while(isHundred == false) */
        while (!isHundred) {
            for (int i = 1; i <= 1000; i++) {
                factor *= i;
                if (factor >= 100) {
                    isHundred = true;
                    lastMultiple = i;
                    break;
                }
            }
        }
        System.out.println("factor after:" + factor);
        /* It won't execute a thousand times */
        System.out.println("Last multiple:" + lastMultiple);
    }
}