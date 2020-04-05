import java.util.Scanner;

class PassController {
    public void pass(int s1, int s2, int s3) {
        int sum = s1 + s2 + s3;
        double avg = (double)sum / 3.;
        if(avg>=60) System.out.println("합격입니다.");
        else System.out.println("불합격입니다.");
    }

    public boolean pass1(int s1, int s2, int s3) {
        int sum = s1 + s2 + s3;
        double avg = (double)sum / 3.;
        if(avg>=60) return true;
        else return false;
    }

    public String pass2(int s1, int s2, int s3) {
        int sum = s1 + s2 + s3;
        double avg = (double)sum / 3.;
        if(avg>=60) return "합격";
        else return "불합격";
    }
}

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세 정수를 입력해주세요.");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        PassController p = new PassController();
        System.out.print("pass("+s1+", "+s2+", "+s3+"): ");
        p.pass(s1, s2, s3);
        System.out.println("pass("+s1+", "+s2+", "+s3+"): " + p.pass1(s1, s2, s3));
        System.out.println("pass("+s1+", "+s2+", "+s3+"): " + p.pass2(s1, s2, s3));
    }
}
