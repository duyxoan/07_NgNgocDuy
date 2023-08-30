package org.example;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = new News();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm vào tin tức");
            System.out.println("2. Xem danh sách tin tức");
            System.out.println("3. Đánh giá trung bình");
            System.out.println("4. Thoát");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the newline character
                    System.out.print("Enter title: ");
                    news.setTitle(scanner.nextLine());
                    System.out.print("Enter publish date: ");
                    news.setPublishDate(scanner.nextLine());
                    System.out.print("Enter author: ");
                    news.setAuthor(scanner.nextLine());
                    System.out.print("Enter content: ");
                    news.setContent(scanner.nextLine());
                    news.inputRates(scanner);
                    break;

                case 2:
                    news.Display();
                    break;

                case 3:
                    news.Calculate();
                    news.Display();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}

