import java.util.Scanner;

public class hw2_loop_5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("임의의 정수를 입력하시오 >> ");
        int n = key.nextInt();
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println("");
        }

        key.close();
    }
}
