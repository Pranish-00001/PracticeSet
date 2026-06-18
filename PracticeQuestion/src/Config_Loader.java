// Practice 14: Config Loader
//PRANISH khanal

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Config_Loader {
    public static void main(String[] args) {
        try {
            readConfig();
        } catch (FileNotFoundException e) { //error handling
            System.out.println("config.txt not found. so creating:");
            createDefaultConfig();
        }
    }

    private static void readConfig() throws FileNotFoundException {
        File file = new File("config.txt");     //object

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Config loaded:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    private static void createDefaultConfig() {     //writing on file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("config.txt"))) {
            writer.write("theme=light");
            writer.newLine();
            writer.write("language=en");
            writer.newLine();
            writer.write("autosave=true");
            writer.newLine();
            System.out.println("Default config.txt created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating config file: " + e.getMessage());
        }
    }
}