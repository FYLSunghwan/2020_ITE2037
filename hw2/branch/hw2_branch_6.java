import java.util.Scanner;

public class hw2_branch_6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오 : ");
        int num = key.nextInt();

        int up = num/10;
        int down = num%10;
        int cnt = 0;

        if(up>0 && up%3==0) ++cnt;
        if(down>0 && down%3==0) ++cnt;

        switch(cnt) {
            case 2: System.out.println("박수짝짝"); break;
            case 1: System.out.println("박수짝"); break;
            case 0: System.out.println("-"); break;
            default: System.out.println("Invalid"); break;
        }

        key.close();
    }
}
