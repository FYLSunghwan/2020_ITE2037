import java.util.Scanner;

public class hw2_branch_3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a, b, c;

        System.out.print("첫 번째 수 = ");
        a = key.nextInt();
        System.out.print("두 번째 수 = ");
        b = key.nextInt();
        System.out.print("세 번째 수 = ");
        c = key.nextInt();

        if (a > b)
        {
            if (a > c)
            {
                if (b > c)
                    System.out.printf("%d %d %d\n", a, b, c);
                else
                    System.out.printf("%d %d %d\n", a, c, b);
            }
            else
                System.out.printf("%d %d %d\n", c, a, b);
        }
        else
        {
            if (b > c)
            {
                if (a > c)
                    System.out.printf("%d %d %d\n", b, a, c);
                else
                    System.out.printf("%d %d %d\n", b, c, a);
            }
            else
                System.out.printf("%d %d %d\n", c, b, a);
        }
    }
}
