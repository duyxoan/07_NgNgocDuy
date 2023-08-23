package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> hoList = new ArrayList<>();
        hoList.add("Nguyen");
        hoList.add("Tran");
        hoList.add("Le");
        hoList.add("Pham");
        hoList.add("Hoang");
        hoList.add("Do");
        hoList.add("Vo");

        List<String> tenDemList = new ArrayList<>();
        tenDemList.add("Van");
        tenDemList.add("Thi");
        tenDemList.add("Minh");
        tenDemList.add("Quang");
        tenDemList.add("Thu");
        tenDemList.add("Huu");
        tenDemList.add("Thao");

        List<String> tenList = new ArrayList<>();
        tenList.add("Anh");
        tenList.add("Huong");
        tenList.add("Dung");
        tenList.add("Hoa");
        tenList.add("Tuan");
        tenList.add("Linh");
        tenList.add("Nam");

        List<String> tenDayDuList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String ho = hoList.get(random.nextInt(hoList.size()));
            String tenDem = tenDemList.get(random.nextInt(tenDemList.size()));
            String ten = tenList.get(random.nextInt(tenList.size()));

            String tenDayDu = ho + " " + tenDem + " " + ten;
            tenDayDuList.add(tenDayDu);
        }

        for (int i = 0; i < tenDayDuList.size(); i++) {
            String studentID = "MSSV " + (random.nextInt(2020000) + 1000);
            System.out.println("Sinh viên " + (i + 1) + ": " + tenDayDuList.get(i) + ", ID: " + studentID);
        }
    }
}
