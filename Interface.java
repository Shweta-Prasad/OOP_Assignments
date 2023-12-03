interface Vehicle {
    void gearChange(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    void printStates();
}
class Bicycle implements Vehicle {
    int speed;
    int gear;
    public void gearChange(int newGear) {
        gear=newGear;
    }
    public void speedUp(int increment) {
        speed=speed+increment;
    }
    public void applyBrakes(int decrement) {
        speed=speed-decrement;
    }
    public void printStates() {
        System.out.println("Speed:"+speed+" gear:"+gear);
    }
}
class Bike implements Vehicle {
    int speed;
    int gear;
    public void gearChange(int newGear) {
        gear=newGear;
    }
    public void speedUp(int increment) {
        speed=speed+increment;
    }
    public void applyBrakes(int decrement) {
        speed=speed-decrement;
    }
    public void printStates() {
        System.out.println("Speed:"+speed+" gear:"+gear);
    }
}     
class Car implements Vehicle {
    int speed;
    int gear;
    public void gearChange(int newGear) {
        gear=newGear;
    }
    public void speedUp(int increment) {
        speed=speed+increment;
    }
    public void applyBrakes(int decrement) {
        speed=speed-decrement;
    }
    public void printStates() {
        System.out.println("Speed:"+speed+" gear:"+gear);
    }
}               
class Interface {
    public static void main(String[] args) {
        Bicycle b1=new Bicycle();
        b1.gearChange(2);
        b1.speedUp(5);
        b1.applyBrakes(1);
        System.out.println("Bicycle present state: ");
        b1.printStates();
        
        Bike b2=new Bike();
        b2.gearChange(4);
        b2.speedUp(10);
        b2.applyBrakes(5);
        System.out.println("Bike present state: ");
        b2.printStates();
        
        Car c1=new Car();
        c1.gearChange(8);
        c1.speedUp(20);
        c1.applyBrakes(10);
        System.out.println("Car present state: ");
        c1.printStates();
    }
}
              

