package OOPS;

class shape {
    void show() {
        System.out.println("Shape is drawing");
    }
}

class circle extends shape {
    @Override
    void show() {
        System.out.println("circle is drawing");
    }

}

class square extends shape {
    @Override
    void show() {
        System.out.println("square is drawing");
    }
}

public class FunctionOverriding {
    public static void doDrawingStuff(shape s) {
        s.show();
        circle c = (circle) s;
        c.show();

    }

    public static void main(String[] args) {
        // upcasting
        // shape c = new circle();
        // doDrawingStuff(new shape());
        // downcasting
        circle c = new circle();
        doDrawingStuff(c);
        // shape obj;
        // obj = new circle();
        // obj = new square();
        // obj.show();
    }
}
