package abstract_interface_exam;

public class Dog extends Animal implements Swimmable, Runnable{
    public void start() {
        System.out.println("Dog 출발했다");
    }

    public void running() {
        System.out.println("Dog 달리는 중이다");
    }

    public void stop() {
        System.out.println("Dog 뼈다구를 보고 멈추다");
    }

    public void swim() {
        System.out.println("Dog이 " + pool + "을 네다리로 헤엄치고 있다");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        // Animal 클래스의 메소드 호출
        d.food = "고기";
        d.eat();
        d.bark();

        // interface Run을 재정의한 메소드 호출
        d.start();
        d.running();
        d.stop();
        // interface Swim을 재정의한 메소드 호출
        d.swim();

        Animal a = new Dog();
        a.food = "고기";
        a.eat();
        a.bark();
        ((Swimmable) a).swim();
        ((Runnable) a).start();
        ((Runnable) a).running();
        ((Runnable) a).stop();

        Runnable r = new Dog();
        ((Animal) r).food = "밥";
        ((Animal) r).eat();
        ((Animal) r).bark();
        ((Swimmable) r).swim();
        r.start();
        r.running();
        r.stop();

        Swimmable s = new Dog();
        ((Animal) s).food = "생선";
        ((Animal) s).eat();
        ((Animal) s).bark();
        s.swim();
        ((Runnable) s).start();
        ((Runnable) s).running();
        ((Runnable) s).stop();
    }
}