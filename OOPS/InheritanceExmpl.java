package OOPS;

class Vehicle {
    public String name;
    public String model;
    public int noOfTyers;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyers = -1;
    }

    Vehicle(String name, String model, int noOfTyers) {
        this.name = name;
        this.model = model;
        this.noOfTyers = noOfTyers;
    }

    void startEngine() {
        System.out.printf("engine staring %s:%s\n", name, model);
    }

    void stopEngine() {
        System.out.println("engine stopped");
    }
}

class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyers, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyers);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc() {
        System.out.println("Ac started" + name + " " + model);
    }
}

class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    Motorcycle(String name, String model, int noOfTyers, String handlebarStyle, String suspensionType) {
        super(name, model, noOfTyers);
        this.handleBarStyle = handlebarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie() {
        System.out.println("motorcycle is doing whileee");
    }
}

public class InheritanceExmpl {
    public static void main(String[] args) {
        Car c = new Car("maruti", "800", 4, 5, "Automatic");
        c.startEngine();
        c.startAc();
        c.stopEngine();
        Motorcycle m = new Motorcycle("Splender", "Xline", 2, "U", "soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
