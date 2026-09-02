package OOPS;

abstract class Bird {
    abstract void fly();

    abstract void eat();

    public void sleep() {
        System.out.println("bird sleeping");
    }
}

class Sparow extends Bird {
    void fly() {
        System.out.println("Sparrow is flying..");
    }

    void eat() {
        System.out.println("Sparrow is eating..");
    }
}

public class AbstractDesign {
    public static void birdStuff(Bird b) {
        b.eat();
        b.fly();
        b.sleep();
    }

    public static void main(String[] args) {
        Bird b = new Sparow();
        birdStuff(b);
        // b.eat();
        // b.fly();
    }
}
