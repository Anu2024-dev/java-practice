package OOPS;

interface Animal {
    void fly();

    void eat();

    default void sleep() {
        System.out.println("bird sleep");
    }
}

interface walk {
    public static final int legs = 4;

    void walking();
}

class Sparrow implements Animal, walk {
    public void fly() {
        System.out.println("Sparrow is flying..");
    }

    public void eat() {
        System.out.println("Sparrow is eating..");
    }

    public void walking() {
        int a = walk.legs;
        System.out.println("sparrow walking." + a);
    }
}

public class InterfaceDesign {
    public static void birdStuff(Animal b) {
        b.eat();
        b.fly();
        b.sleep();
    }

    public static void main(String[] args) {
        Animal b = new Sparrow();
        birdStuff(b);
        walk w = new Sparrow();
        w.walking();

    }
}
