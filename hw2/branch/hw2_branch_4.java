import java.util.Scanner;

public class hw2_branch_4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("영문자 1자를 입력하세요 : ");
        char inp = key.next().charAt(0);

        if(!(inp>='A' && inp<='z')) System.out.println("영문자가 아닙니다.");
        else {
            System.out.print(inp+" => ");
            if(inp<='Z') System.out.println((char)(inp + 'a'-'A'));
            else System.out.println((char)(inp - 'a' + 'A'));
        }

        key.close();
    }
}
