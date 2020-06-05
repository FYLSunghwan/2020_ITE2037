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
            int money, disRate;
            double price;
            switch(cmd) {
                case 1:
                    System.out.println("입고할 책 이름:");
                    name = scanner.nextLine();
                    System.out.println("가격");
                    price = scanner.nextInt();
                    System.out.println("중고인가요? Y=1/N=0");
                    cmd =scanner.nextInt();
                    if(cmd>0) {
                        System.out.println("할인률(%)를 입력하세요.");
                        disRate = scanner.nextInt();
                        serv.importBook(name, price, disRate);
                    }
                    else {
                        serv.importBook(name, price);
                    }
                    break;
                case 2:
                    System.out.println("증가할 책 이름:");
                    name = scanner.nextLine();
                    serv.incBook(name);
                    break;
                case 3:
                    System.out.println("구매할 책 이름:");
                    name = scanner.nextLine();
                    System.out.println("현재 돈:");
                    money = scanner.nextInt();
                    price = serv.buyBook(name);
                    System.out.printf("남은 돈: %d\n",(int)(money-price));
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