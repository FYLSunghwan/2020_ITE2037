class Animal {
}

class Person extends Animal {
}

class Student extends Person {
}

public class InstanceOfTest {
    public static void main(String[] args) {
        Animal t = new Student();
        if(t instanceof Student) System.out.println("Student");
        else if(t instanceof Person) System.out.println("Person");
        else if(t instanceof Animal) System.out.println("Animal");

        if(t instanceof Animal) System.out.println("Animal");
        else if(t instanceof Person) System.out.println("Person");
        else if(t instanceof Student) System.out.println("Student");
    }
}