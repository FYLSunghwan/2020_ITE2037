package askTime;

public class WatchTest {
    public static void main(String[] args) {
        Person p = new Person("홍길동", null);
        System.out.println(p.whatTime());

        p.setWatch(new Watch());
        System.out.println(p.whatTime());
    }
}
