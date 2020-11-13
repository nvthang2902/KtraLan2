package com.example.taolistktra;

public class Loa {
    public String tenLoa;
    public String gia;
    public int image;

    public Loa(String tenLoa, String gia, int image) {
        this.tenLoa = tenLoa;
        this.gia = gia;
        this.image = image;
    }

    public String getTenLoa() {
        return tenLoa;
    }

    public void setTenLoa(String tenLoa) {
        this.tenLoa = tenLoa;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
