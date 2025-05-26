package Interview_Questions;

import java.util.Scanner;

public class Percentage_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percentage value: ");
        double percentage = scanner.nextDouble();
        if (percentage >= 80.0) {
            System.out.println("TRUE: " + percentage + "% PASSED");
        } else {
            System.out.println("FALSE: " + percentage + "% FAILED");
        }
       scanner.close();
    }
}