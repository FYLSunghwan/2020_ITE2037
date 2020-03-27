import java.util.Scanner;

public class hw2_loop_4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("국어 = ");
        int korean = key.nextInt();
        System.out.print("영어 = ");
        int english = key.nextInt();
        System.out.print("수학 = ");
        int math = key.nextInt();

        int tot = korean + english + math;
        double avg = tot/3.;
        System.out.println("총점 = "+tot);
        System.out.printf("평균 = %.2f\n", avg);
        System.out.print("학점 = ");
        if(avg >= 90) System.out.println("A");
        else if(avg >= 80) System.out.println("B");
        else if(avg >= 80) System.out.println("C");
        else if(avg >= 80) System.out.println("D");
        else System.out.println("F");        

        key.close();
    }
}
