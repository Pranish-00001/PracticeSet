// Practice 12: Survey Analyzer
//PRANISH KAHNAL

public class SurveyAnalyzer {
    public static void main(String[] args) {
        int[] responses = {
                1, 5, 5, 3, 3, 5, 4, 3, 5, 1, 1, 1, 4, 5, 2, 4, 2, 1, 3, 4, 5, 5, 1, 2, 1, 4, 4, 4, 3, 2, 1, 5, 4, 3, 2, 5, 1, 4, 3, 5, 2, 4, 5, 3, 1, 2, 4, 5, 3, 5};
        int[] frequency = new int[6];

        for (int rating : responses) {
            if (rating >= 1 && rating <= 5) {   //conditional
                frequency[rating]++;
            }
        }

        System.out.println("Survey rating frequency:");
        for (int rating = 1; rating <= 5; rating++) {
            System.out.println(rating + " star(s): " + frequency[rating]);
        }
    }
}