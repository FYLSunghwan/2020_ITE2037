package bookStore;
import java.util.Scanner;

public class BookUI {
    public static void main(String[] args) {
        BookService serv = new BookService();
        Scanner scanner = new Scanner(System.in);
        Boolean sw = true;
        while(sw) {
            System.out.println("");
            System.out.println("작업할 내용을 선택하세요.");
            System.out.println("1. 새책입고");
            System.out.println("2. 책재고량 증가");
            System.out.println("3. 책구매");
            System.out.println("4. 책조회");
            System.out.println("5. 책 전체보기");
            System.out.println("6. 종료");
            System.out.print("UI>");
            int cmd = scanner.nextInt();
            scanner.nextLine();
            String name;
            switch(cmd) {
                case 1:
                    System.out.println("입고할 책 이름:");
                    name = scanner.nextLine();
                    serv.importBook(name);
                    break;
                case 2:
                    System.out.println("증가할 책 이름:");
                    name = scanner.nextLine();
                    serv.incBook(name);
                    break;
                case 3:
                    System.out.println("구매할 책 이름:");
                    name = scanner.nextLine();
                    serv.buyBook(name);
                    break;
                case 4:
                    System.out.println("조회할 책 이름:");
                    name = scanner.nextLine();
                    serv.searchBook(name);
                    break;
                case 5:
                    serv.listBook();
                    break;
                case 6:
                    sw=false;
                    break;
                default:
                    System.out.println("UI>Invalid input.");
                    break;
            }
        }
    }
}