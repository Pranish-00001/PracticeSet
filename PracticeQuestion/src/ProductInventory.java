// Practice 8: Product Inventory

//PRANISH KHANAL

interface Discountable {
    void applyDiscount(double percentage);
}

class Electronics implements Discountable {     //private instance faviables
    private String name;
    private double price;

    public Electronics(String name, double price) {     //constructor
        this.name = name;
        this.price = price;
    }

    @Override               //overriding
    public void applyDiscount(double percentage) {
        // Simple validation so discount values stay realistic.
        if (percentage > 0 && percentage <= 100) {
            price -= price * percentage / 100;
        }
    }

    public void showProduct() {
        System.out.printf("%s : Rs. %.2f%n", name, price);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Electronics[] inventory = {
                new Electronics("Laptop", 85000),   //objects
                new Electronics("Phone", 45000),
                new Electronics("Headphones", 5000)};

        // Discount 0.10
        for (Electronics item : inventory) {
            item.applyDiscount(10.0);
        }

        System.out.println("Inventory after 10% discount:");
        for (Electronics item : inventory) {    //For each to print output
            item.showProduct();
        }
    }
}