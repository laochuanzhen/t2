package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:40
 * @version: ${VERSION}
 * @modified By:
 */
public class Motorcycle {
    private String id;
    private String t_name;
    private String price;

    public void driveMethod() {
        System.out.println("welcome to drive motorcycle");
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Motorcycle() {
    }

    public Motorcycle(String id, String t_name) {
        this.id = id;
        this.t_name = t_name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getT_name() {
        return this.t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}

