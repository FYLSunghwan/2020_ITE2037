public class MultiExceptionHandling1 {
    public static void main( String[] args ) {
        int value = 20;
        int div = 0;
        int[] intArray = {1, 2, 3};

        try {
            int result = value / div;
            System.out.println(result);
            int arrayValue = intArray[4];
            System.out.println( arrayValue );
        } catch (ArithmeticException ae ) {
            System.out.println( ae.toString() );
        } catch (ArrayIndexOutOfBoundsException ai ) {
            ai.printStackTrace();
        } finally {
            System.out.println("무조건 실행됨!");
        }
    }
}
