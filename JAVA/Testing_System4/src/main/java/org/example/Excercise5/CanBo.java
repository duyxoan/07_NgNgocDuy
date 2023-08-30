package org.example.Excercise5;

class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    // Getter và Setter cho các thuộc tính

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}

class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    // Getter và Setter cho thuộc tính bac

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Bậc: " + bac);
    }
}

class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    // Getter và Setter cho thuộc tính nganhDaoTao

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nghành đào tạo: " + nganhDaoTao);
    }
}

class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    // Getter và Setter cho thuộc tính congViec

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Công việc: " + congViec);
    }
}

