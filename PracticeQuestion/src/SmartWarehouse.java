// Practice 1: Smart Warehouse
//Pranish Khanal

abstract class StorageUnit {
    protected int id;
    protected double capacity;

    public StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public abstract void showDetails();
}

interface Refrigerated {
    void adjustTemp(int temperature);
}

class ColdBox extends StorageUnit implements Refrigerated {
    private int currentTemperature;

    public ColdBox(int id, double capacity, int currentTemperature) {
        super(id, capacity); // send common data to the parent class
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void adjustTemp(int temperature) {
        currentTemperature = temperature;
        System.out.println("ColdBox temperature adjusted to " + currentTemperature + "°C");
    }

    @Override
    public void showDetails() {
        System.out.println("ColdBox ID: " + id);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Current Temperature: " + currentTemperature + "°C");
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        ColdBox box = new ColdBox(1, 22.5, 8);
        box.showDetails();
        box.adjustTemp(-2);
    }
}