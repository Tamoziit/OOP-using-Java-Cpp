interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Flyyy...");
    }

    @Override
    public void swim() {
        System.out.println("Swimmm...");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.fly();
        ob.swim();
    }
}
