package BackJun_Bronze;
import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int score = inputScanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score < 60) {
            System.out.println("F");
        }

    }
}
