package org.example;
import java.util.Random;
import java.util.Scanner;
public class Ex1 {

        public static void question1(){
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Nhập họ và tên đầy đủ: ");
                    String fullName = scanner.nextLine();

                    String[] names = splitFullName(fullName);

                    if (names.length == 3) {
                        String ho = names[0];
                        String tenDem = names[1];
                        String ten = names[2];

                        System.out.println("Họ là: " + ho);
                        System.out.println("Tên đệm là: " + tenDem);
                        System.out.println("Tên là: " + ten);
                    } else {
                        System.out.println("Nhập sai định dạng họ và tên.");
                    }

                    scanner.close();
                }

                public static String[] splitFullName(String fullName) {
                    return fullName.split("\\s+");
                }

    public static void Question2and3() {
        Random random = new Random();

        int randomNumber = random.nextInt(100000);

        String randomString = String.format("%05d", randomNumber);

        System.out.println("Chuỗi ngẫu nhiên có 5 chữ số: " + randomString);

        String haisocuoi = randomString.substring(3);
        System.out.println("Hai số cuối: " + haisocuoi);
    }
    public static void Question4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        double thuong = a/b;

        System.out.println("Thương của " + a + " và " + b + " là: " + thuong);

        scanner.close();
    }

}





