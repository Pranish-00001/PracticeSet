// Practice 11: Vehicle Fleet

//PRANISH KAHNAL
abstract class Vehicle {
    protected String name;
    protected int rentalDays;

    public Vehicle(String name, int rentalDays) {   //constructor
        this.name = name;
        this.rentalDays = rentalDays;
    }

    // abstract method for bike and bus
    public abstract double calculateFee();

    public void printFee() {
        System.out.printf(name+"fee for "+rentalDays+" days: Rs."+ calculateFee());
    }
}

class Bike extends Vehicle {    //bike class
    public Bike(String name, int rentalDays) {
        super(name, rentalDays);
    }

    @Override
    public double calculateFee() {
        return rentalDays * 500;
    }
}

class Bus extends Vehicle {
    public Bus(String name, int rentalDays) {
        super(name, rentalDays);
    }

    @Override
    public double calculateFee() {      //overriding
        return rentalDays * 3000;
    }
}

public class VehicleFleet {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Bike("Mountain Bike", 3),
                new Bus("Tourist Bus", 2),
                new Bike("City Bike", 5)};

        for (Vehicle vehicle : fleet) {     //for each for output
            vehicle.printFee();
        }
    }
}