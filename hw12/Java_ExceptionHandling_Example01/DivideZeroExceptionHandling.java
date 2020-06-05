public class DivideZeroExceptionHandling {
    public static void main( String[] args ) {
        int b = 20;
        int a = 0;
        int c = 0;

        try {
            c = b/a;
            System.out.println("aaa");
            int total = a + b;
            int sub = b - a;
        } catch ( ArithmeticException ae ) {
            a = 2;
            c = b/a;
        }
        System.out.println( c );
    }
}
