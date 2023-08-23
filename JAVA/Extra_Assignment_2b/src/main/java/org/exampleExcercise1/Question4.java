package org.exampleExcercise1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (a): ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai (b): ");
        int b = scanner.nextInt();

        int difference = a - b;

        if (difference > 0) {
            System.out.println("Số thứ nhất lớn hơn số thứ hai.");
        } else if (difference < 0) {
            System.out.println("Số thứ nhất nhỏ hơn số thứ hai.");
        } else {
            System.out.println("Hai số bằng nhau.");
        }

        scanner.close();
    }
}
