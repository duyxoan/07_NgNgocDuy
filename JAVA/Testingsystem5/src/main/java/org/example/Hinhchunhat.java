package org.example;

class HinhChuNhat {
    protected float chieuDai;
    protected float chieuRong;

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public float tinhDienTich() {
        return chieuDai * chieuRong;
    }
}

class HinhVuong extends HinhChuNhat {
    public HinhVuong(float canh) {
        super(canh, canh);
    }

    @Override
    public float tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public float tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        return super.tinhDienTich();
    }
}

