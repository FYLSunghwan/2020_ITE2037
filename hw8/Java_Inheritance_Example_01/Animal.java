class Animal {
    private int age;
    public Animal(int age) {
        this.age = age;
    }
    public void eat() {
        System.out.println("음식을 날것으로 먹습니다.");
    }
    public void eat(String food) {
        System.out.println(food + "를 날것으로 먹습니다.");
    }
    public void breathe() {
        System.out.println("숨쉽니다.");
    }
    public void sleep() {
        System.out.println("잠을 잡니다.");
    }
}
