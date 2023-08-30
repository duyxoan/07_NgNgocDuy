package org.example.EX2;

interface IStudent {
    void diemDanh();
    void hocBai();
    void diDonVeSinh();
    void diNgu();
}

class Student implements IStudent {
    public int id;
    public String name;
    public int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    @Override
    public void diemDanh() {
        System.out.println(name + " điểm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(name + " đang học bài");
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(name + " đi dọn vệ sinh");
    }
    public void diNgu() {
        System.out.println(name + " đi ngủ");
    }
}


