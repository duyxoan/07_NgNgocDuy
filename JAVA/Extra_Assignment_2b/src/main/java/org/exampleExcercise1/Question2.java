package org.exampleExcercise1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giây (0 - 68399): ");
        int totalSeconds = scanner.nextInt();

        if (totalSeconds < 0 || totalSeconds > 68399) {
            System.out.println("Số giây không hợp lệ.");
        } else {
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            System.out.println("Thời gian định dạng [giờ:phút:giây]: " + formattedTime);
        }

        scanner.close();
    }
}
