// Practice 6: Duplicate Finder
//PRANISH KHANAL


public class DuplicateFinder {
    public static void main(String[] args) {

        String[] guests = {"Aarav", "Maya", "Sita", "Aarav","Ram", "Maya", "Nabin", "Sita"}; //Array definition

        System.out.println("Duplicate guest names:");

        for (int i = 0; i < guests.length; i++) {   //for
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (guests[i].equals(guests[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue; // to avoid duplicate
            }

            for (int j = i + 1; j < guests.length; j++) {   //output loop
                if (guests[i].equals(guests[j])) {
                    System.out.println(guests[i]);
                    break;
                }
            }
        }
    }
}