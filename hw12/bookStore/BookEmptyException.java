package bookStore;

public class BookEmptyException extends Exception {
    public BookEmptyException(String name) {
        super(name + "책의 재고가 없습니다.");
    }
}
