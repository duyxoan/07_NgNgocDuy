package org.example;

public class hinhchunhatmain {

        public static void main(String[] args) {
            HinhChuNhat hinhCN = new HinhChuNhat(5, 7);
            HinhVuong hinhVuong = new HinhVuong(5);

            System.out.println("Hình Chữ Nhật:");
            System.out.println("Chu vi: " + hinhCN.tinhChuVi());
            System.out.println("Diện tích: " + hinhCN.tinhDienTich());

            System.out.println("\nHình Vuông:");
            System.out.println("Chu vi: " + hinhVuong.tinhChuVi());
            System.out.println("Diện tích: " + hinhVuong.tinhDienTich());
        }
    }


