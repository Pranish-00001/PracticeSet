//PRANISH KHANAL

// Practice 9: Log File Reader


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LogFileReader {
    public static void main(String[] args) {
        String fileName = "server.log";
        createSampleLogIfMissing(fileName);     //creating

        String[] errorLines = new String[100];  //array
        int errorCount = 0;

        try (Scanner scanner = new Scanner(new File(fileName))) { //error handling
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("ERROR")) {
                    errorLines[errorCount] = line;
                    errorCount++;
                }
            }
        } catch (IOException e) {           //error handling
            System.out.println("Error reading log file: " + e.getMessage());
        }

        System.out.println("Lines containing ERROR:");
        for (int i = 0; i < errorCount; i++) {
            System.out.println(errorLines[i]);
        }
    }

    private static void createSampleLogIfMissing(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            return; // do not overwrite an existing log file
        }

        try (FileWriter writer = new FileWriter(file)) {        //File writing
            writer.write("INFO Server started\n");
            writer.write("ERROR Database connection failed\n");
            writer.write("INFO Retrying connection\n");
            writer.write("ERROR Timeout while connecting\n");
        } catch (IOException e) {
            System.out.println("Could not create sample log: " + e.getMessage());
        }
    }
}