import java.util.Scanner;

public class hw2_loop_3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("=== 1부터 입력하신 숫자사이의 홀수의 개수를 알려드립니다.===");
        System.out.print("숫자를 입력하세요.(종료시 0을 입력하세요.) =>");
        for(int num1=key.nextInt();num1!=0;num1=key.nextInt()) {
            int cnt=0;
            for(int i=1;i<=num1;i++) {
                if(i%2==1) cnt++;
            }
            System.out.printf("1에서 %d사이의 홀수의 개수는 %d개입니다.\n", num1, cnt);
            System.out.print("숫자를 입력하세요.(종료시 0을 입력하세요.) =>");
        }

        key.close();
    }
}
