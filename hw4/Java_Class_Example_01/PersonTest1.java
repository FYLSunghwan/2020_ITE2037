class Person {
    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age >= 100 || age < 0) {
            System.out.println("0-100세까지만 입력하세요.");
            return;
        }
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void set(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void set(int age, String name) {
        this.name = name;
        this.age = age;
    }
}

class PersonTest1 {
    public static void main(String[] args) {
        Person kim = new Person("김기자", 30);
        kim.setAge(-20);
    }
}
