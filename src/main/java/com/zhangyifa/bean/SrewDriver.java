package com.zhangyifa.bean;

/**
 * Created by zhangyifa on 6/7/17.
 */
public class SrewDriver {

    private String color = "red";

    public void use() {
        System.out.println("Use " + color + " screwdriver");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void init() {
        System.out.println("init screwdriver");
    }

    public void cleanup() {
        System.out.println("cleanup screwdriver");
    }

}
