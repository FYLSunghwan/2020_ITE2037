import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int[] array;
        array = getData();
        printData(array);
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
    
    private static int[] getData() {
        int[] testData = {10, 20, 30, 40, 50};
        return testData;
    }
    
    private static void printData(int[] array) {
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
}
