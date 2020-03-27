import java.util.Scanner;

public class hw2_branch_2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num;
    
        System.out.print("주민번호 7번째 자리를 입력하세요 : ");
        num = key.nextInt();

        System.out.print("당신은 ");
        switch(num){
            case 9:
                System.out.println("1800년대생 남성입니다.");
                break;
            case 0:
                System.out.println("1800년대생 여성입니다.");
                break;
            case 1:
                System.out.println("1900년대생 남성입니다.");
                break;
            case 2:
                System.out.println("1900년대생 여성입니다.");
                break;
            case 3:
                System.out.println("2000년대생 남성입니다.");
                break;
            case 4:
                System.out.println("2000년대생 여성입니다.");
                break;                
            default:
                System.out.println("Operator Error");
                break;
        }
    }
}
