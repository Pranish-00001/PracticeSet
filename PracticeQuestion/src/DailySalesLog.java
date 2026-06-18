// Practice 4: Daily Sales Log
// Pranish Khanal
// Writes seven days of sales values into a text file.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DailySalesLog {
    public static void main(String[] args) {
        double[] sales = {1200.50, 985.75, 1340.00, 1125.25, 1560.90, 1780.40, 1499.99};    //array
        String fileName = "weekly_sales.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {    //Error handling
            for (double sale : sales) { //for each loop
                writer.write(String.valueOf(sale));
                writer.newLine();
            }
            System.out.println("Weekly sales saved to " + fileName);
        } catch (IOException e) {       //Error handling
            System.out.println("Error writing sales file: " + e.getMessage());
        }
    }
}