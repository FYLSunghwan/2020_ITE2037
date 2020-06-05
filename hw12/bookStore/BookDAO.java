package bookStore;
import java.util.ArrayList;

public class BookDAO {
    private ArrayList<Book> books = new ArrayList<Book>();
    private static final int maxBook = 2;

    public void addNewBook(String name, double price) throws BookExceedException {
        Book book = findBook(name);
        if(book==null) {
            if(books.size() == maxBook) throw new BookExceedException(name);
            book = new Book(name, price);
            books.add(book);
        }
        else {
            book.incAmt();
        }
    }

    public void addNewBook(String name, double price, int disRate ) throws BookExceedException {
        Book book = findBook(name);
        if(book==null) {
            if(books.size() == maxBook) throw new BookExceedException(name);
            book = new OldBook(name, price, 1, disRate);
            books.add(book);
        }
        else {
            book.incAmt();
        }
    }

    public Boolean incBook(String name, int amount) throws BookNotFoundException {
        Book book = findBook(name);
        if(book==null) {
            throw new BookNotFoundException(name);
        }
        book.incAmt(amount);
        return true;
    }

    public Boolean descBook(String name) throws BookEmptyException {
        Book book = findBook(name);
        if(book==null) {
            throw new BookEmptyException(name);
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