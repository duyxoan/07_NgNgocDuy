package org.example.EX2;

public class Management {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        // Tạo 10 học sinh và chia thành 3 nhóm
        for (int i = 0; i < 10; i++) {
            int group = i % 3 + 1; // 3 groups
            students[i] = new Student(i + 1, "Nguyễn Văn " + (char) ('A' + i), group);
        }

        // Gọi cả lớp điểm danh
        System.out.println("Điểm danh cả lớp:");
        for (Student student : students) {
            student.diemDanh();
        }

        // Gọi nhóm 1 đi học bài
        System.out.println("\nNhóm 1 đi học bài:");
        for (Student student : students) {
            if (student.group == 1) {
                student.hocBai();
            }
        }

        // Gọi nhóm 2 đi dọn vệ sinh
        System.out.println("\nNhóm 2 đi dọn vệ sinh:");
        for (Student student : students) {
            if (student.group == 2) {
                student.diDonVeSinh();
            }

        }
        System.out.println("\nNhóm 3 đi ngủ:");
        for (Student student : students) {
            if (student.group == 3) {
                student.diNgu();
            }
        }
    }
}