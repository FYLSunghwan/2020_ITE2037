import java.util.Scanner;
public class ScoreTest1 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        getValues(scores);
        getAverage(scores);
        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
    }
    private static void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<array.length;i++) {
            System.out.print("성적을 입력하시오:");
            array[i] = scan.nextInt();
        }
    }
    private static void getAverage(int[] array) {
        int total = 0;
        for(int i=0;i<array.length;i++) total+=array[i];
        System.out.println("평균 성적은 " + total / array.length + "입니다");
    }
}