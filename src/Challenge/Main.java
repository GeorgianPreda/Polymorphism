package Challenge;


class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int weels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.weels = 4;
        this.engine= true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String stratEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}


class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String stratEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "  -> accelerate()";    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "  -> brake()";    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car (8, "Base car");
        System.out.println(car.stratEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Out lander VRW 4WD");
        System.out.println(mitsubishi.stratEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.stratEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
