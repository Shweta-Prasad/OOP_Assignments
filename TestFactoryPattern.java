abstract class Car {
    public Car(CarType model) {
        this.model=model;
        arrageParts();
    }
    private void arrageParts() {
    }
    protected abstract void construct();
    private CarType model=null;
    public CarType getModel() {
        return model;
    }
}
class CarFactory {
    public static Car buildCar(CarType model) {
        Car car=null;
        switch(model) {
            case SMALL:
            car=new SmallCar();
            break;

            case SEDAN:
            car=new SedanCar();
            break;

            case LUXURY:
            car=new LuxaryCar();
            break;

            default:
            break;
        }
        return car;
    }
}
enum CarType {
    SMALL, SEDAN, LUXURY
}
class LuxaryCar extends Car {
    LuxaryCar() {
        super(CarType.LUXURY);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building luxary car");
    }
}
class SedanCar extends Car {
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
}
class SmallCar extends Car {
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building small car");
    }
}
public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
