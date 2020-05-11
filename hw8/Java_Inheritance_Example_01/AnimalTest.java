public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal(2);
        a.eat();
        a.eat("고기");
        a.breathe();
        a.sleep();
        Person p = new Person(10, "홍길동");
        p.eat();
        p.eat("고기");
        p.breathe();
        p.sleep();
        p.walk();
        Animal b = new Person(20, "사오정");
        b.eat();
        b.eat("고기");
        b.breathe();
        b.sleep();
        ((Person)b).walk();
        
        if(b instanceof Person)
            ((Person)b).walk();
    }
}
