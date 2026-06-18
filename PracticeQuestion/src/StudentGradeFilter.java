// Practice 2: Student Grade Filter
//Pranish Khanal

import java.util.Arrays;
import java.util.ArrayList;

public class StudentGradeFilter {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(95, 82, 39, 40, 76, 90, 12, 67, 88, 100)); //Array List making

        for (int score : scores) {  //for each and conditional loop
            if (score >= 90) {
                System.out.println(score + " -> Distinction");
            } else if (score >= 40) {
                System.out.println(score + " -> Pass");
            } else {
                System.out.println(score + " -> Fail");
            }
        }
    }
}