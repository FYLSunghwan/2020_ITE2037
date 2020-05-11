class Person extends Animal {
    private String name;
    public Person(int age, String name) {
        super(age);
        this.name = name;
    }
    public void eat() {
        System.out.println("음식을 익혀서 먹습니다.");
    }
    public void eat(String food) {
        System.out.prinln(food + "를 익혀서 먹습니다.");
    }
    public void breathe() {
        System.out.println("허파로 숨쉽니다.");
    }
    public void walk() {
        System.out.println("직립보행을 합니다.");
    }
}
