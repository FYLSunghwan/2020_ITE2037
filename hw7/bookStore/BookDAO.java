package bookStore;
import java.util.ArrayList;

public class BookDAO {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addNewBook(String name) {
        Book book = findBook(name);
        if(book==null) {
            book = new Book(name);
            books.add(book);
        }
        else {
            book.incAmt();
        }
    }

    public Boolean incBook(String name, int amount) {
        Book book = findBook(name);
        if(book==null) {
            System.out.println("DAO>ERR: No book named " + name + " in books.");
            return false;
        }
        book.incAmt(amount);
        return true;
    }

    public Boolean descBook(String name) {
        Book book = findBook(name);
        if(book==null) {
            System.out.println("DAO>ERR: No book named " + name + " in books.");
            return false;
        }
        book.descAmt();
        if(book.getAmt()==0) {
            books.remove(book);
            System.out.println("DAO>Book "+book.getName()+" deleted.");
        }
        return true;
    }

    public Book findBook(String name) {
        for(Book book:books) {
            if(book.getName().equals(name)) return book;
        }
        return null;
    }

    public ArrayList<String> listBook() {
        ArrayList<String> bookList = new ArrayList<String>();
        for(Book book:books) {
            bookList.add(book.getName());
        }
        return bookList;
    }
}