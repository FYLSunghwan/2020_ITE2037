public class DivideZeroExceptionHandling1 {
    public static void main( String[] args ) {
        int b = 20;
        int a = 0;
        int c = 0;

        try {
            c = b/a;
            int total = a + b;
            int sub = b - a;
        } catch ( Exception e ) {
            a = 2;
            c = b/a;
        }
        System.out.println(c);
    }
}
