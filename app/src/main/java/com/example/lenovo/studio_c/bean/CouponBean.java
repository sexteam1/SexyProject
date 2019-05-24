package com.example.lenovo.studio_c.bean;

/**
 * Created by 003 on 2019/5/23.
 */

public class CouponBean {
    private String name;
    private int img;
    private int price;
    private String time;


    public CouponBean(String name, int img, int price, String time) {
        this.name = name;
        this.img = img;
        this.price = price;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CouponBean{" +
                "name='" + name + '\'' +
                ", img=" + img +
                ", price=" + price +
                ", time='" + time + '\'' +
                '}';
    }
}
