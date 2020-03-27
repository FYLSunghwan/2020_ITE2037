import java.util.Scanner;

public class hw2_loop_6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("알파벳 한 문자를 입력하시오 >> ");
        char inp = key.next().charAt(0);
        for(char c = inp;c>='a';c--) {
            for(char ct = 'a'; ct<=c;ct++)
                System.out.print(ct);
            System.out.println();
        }

        key.close();
    }
}
