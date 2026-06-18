// Practice 5: Device Manager
//PRANISH KHANAL

abstract class ElectronicDevice {       //abstract class
    private String model;

    public ElectronicDevice(String model) {
        this.model = model;
    }

    public String getModel() {      //getter
        return model;
    }

    // Each device powers on differently so the subclass must define this.
    public abstract void powerOn();
}

class Printer extends ElectronicDevice {
    public Printer(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("Printer " + getModel() + " is warming up.");
    }
}

class Scanner extends ElectronicDevice {
    public Scanner(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("Scanner " + getModel() + " is ready to scan.");
    }
}

public class DeviceManager {        //device manager class
    public static void main(String[] args) {
        ElectronicDevice[] devices = {
                new Printer("HP-LaserJet"),
                new Scanner("Canon-ScanPro")
        };

        for (ElectronicDevice device : devices) {
            device.powerOn();
        }
    }
}