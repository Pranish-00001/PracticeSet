//PRANISH Khanal
// Practice 3: Invalid Age Protector

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeProtector {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to register for voting.");
        }
        System.out.println("Eligible for voting registration.");
    }

    public static void main(String[] args) {
        int[] agesToTest = {16, 18, 25};

        for (int age : agesToTest) {
            try {
                System.out.print("Checking age " + age + ": ");
                checkEligibility(age);
            } catch (InvalidAgeException e) {
                System.out.println("Not eligible - " + e.getMessage());
            }
        }
    }
}