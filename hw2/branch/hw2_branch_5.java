import java.util.Scanner;

public class hw2_branch_5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("연도를 입력하시오 : ");
        int year = key.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0) System.out.println("윤년입니다.");
        else System.out.println("평년입니다.");

        key.close();
    }
}
