import java.util.Scanner;

public class hw2_loop_2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("첫번째 수 = ");
        int num1 = key.nextInt();
        System.out.print("두번째 수 = ");
        int num2 = key.nextInt();
        if(num1>num2) {int t = num1; num1=num2; num2=t;}
        System.out.print("배수 = ");
        int num3 = key.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++) if(i%num3==0) sum+=i;

        System.out.printf("%d에서 %d사이의 %d의 배수의 합은 %d입니다.",num1,num2,num3,sum);

        key.close();
    }
}
