import java.util.Scanner;

public class hw2_branch_1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int first, second;
        String operator;
    
        System.out.print("첫 번째 수 = ");
        first = key.nextInt();
        System.out.print("연산자(+, -, *, /, %) = ");
        operator = key.next();
        System.out.print("두 번째 수 = ");
        second = key.nextInt();

        System.out.print(first + " " + operator + " " + second + " = ");
        switch(operator){
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            case "%":
                System.out.println(first % second);
                break;
            default:
                System.out.println("Operator Error");
                break;
        }
    }
}
