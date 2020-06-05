package bookStore;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String name) {
        super(name + "책을 찾을 수 없습니다.");
    }
}
