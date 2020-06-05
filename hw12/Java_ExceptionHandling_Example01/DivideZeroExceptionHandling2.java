public class DivideZeroExceptionHandling2 {
    public static void main( String[] args ) {
        int b = 20;
        int a = 0;
        int c = 0;

        try {
            c = b/a;
            int total = a + b;
            int sub = b-a;
            System.out.println( c );
        } catch ( Exception e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
