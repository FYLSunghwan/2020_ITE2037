package bookStore;

public class BookExceedException extends Exception {
    public BookExceedException(String name) {
        super(name + "책을 넣기엔 남는공간이 없습니다.");
    }
}
