package bookStore;
import java.util.ArrayList;

public class BookService {
    private BookDAO dao = new BookDAO();

    // 1. 새 책 입고
    public void importBook(String name, double price) {
        System.out.println("Service>책 "+name+" 입고 시도중...");
        try{
            dao.addNewBook(name, price);
            System.out.println("Service>책 "+name+" 입고 완료.");
        } catch (BookExceedException e) {
            System.out.println(e.getMessage());
        }
    }
    public void importBook(String name, double price, int disRate) {
        System.out.println("Service>책 "+name+" 입고 시도중...");
        try {
            dao.addNewBook(name, price, disRate);
            System.out.println("Service>책 "+name+" 입고 완료.");
        } catch (BookExceedException e) {
            System.out.println(e.getMessage());
        }
    }

    // 2. 책 재고량 증가
    public void incBook(String name) {
        System.out.println("Service>책 "+name+" 증가 시도중...");
        try {
            dao.incBook(name,1);
            System.out.println("Service>책 "+name+" 증가 성공.");
        }catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Service>책 "+name+" 증가 실패.");
        }
    }

    // 3. 책 구매
    public double buyBook(String name) {
        System.out.println("Service>책 "+name+" 구매 시도중...");
        Book book = dao.findBook(name);
        double price = 0;
        try {
            dao.descBook(name);
            price = book.getPrice();
            System.out.println("Service>책 "+name+" 구매 성공.");
        } catch (BookEmptyException e) {
            System.out.println(e.getMessage());
        }
        return price;
    }

    // 4. 책 조회
    public void searchBook(String name) {
        System.out.println("Service>책 "+name+" 조회 시도중...");
        if(dao.findBook(name)!=null) System.out.println("Service>책 "+name+" 이(가) 있습니다.");
        else System.out.println("Service>책 "+name+"이 없습니다.");
    }

    // 5. 책 전체보기
    public void listBook() {
        System.out.println("Service>책 목록:");
        ArrayList<String> list = dao.listBook();
        if(list.isEmpty()) System.out.println("책이 없습니다.");
        for(String book:list) System.out.println(book);
        System.out.println("<완료>");
    }
}