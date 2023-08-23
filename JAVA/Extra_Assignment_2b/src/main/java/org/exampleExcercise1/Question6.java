package org.exampleExcercise1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: ");
        double physicsScore = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hóa: ");
        double chemistryScore = scanner.nextDouble();

        double averageScore = (mathScore * 2 + physicsScore + chemistryScore) / 4;

        System.out.println("Điểm trung bình: " + averageScore);

        if (averageScore >= 9.0) {
            System.out.println("Học lực: Loại xuất sắc");
        } else if (averageScore >= 8.0) {
            System.out.println("Học lực: Loại giỏi");
        } else if (averageScore >= 7.0) {
            System.out.println("Học lực: Loại khá");
        } else if (averageScore >= 6.0) {
            System.out.println("Học lực: Loại trung bình khá");
        } else if (averageScore >= 5.0) {
            System.out.println("Học lực: Loại trung bình");
        } else {
            System.out.println("Học lực: Loại kém");
        }

        scanner.close();
    }
}
