package com.ar.dev.deeneislam.Model;

public class AllahNamesModel {
    private String name;
    private String desc;
    private int img;

    public AllahNamesModel(){}

    public AllahNamesModel(String name, String desc, int img) {
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}
