package org.exampleExcercise1;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cm: ");
        double cm = scanner.nextDouble();

        double inch = cm / 2.54;
        double feet = inch / 12;
        double remainingInches = inch % 12;

        System.out.printf("%.2f cm tương đương %.2f feet và %.2f inch", cm, feet, remainingInches);

        scanner.close();
    }
}

