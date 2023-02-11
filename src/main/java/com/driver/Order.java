package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        int hour=Integer.valueOf(deliveryTime.substring(0,2));
        int minute=Integer.valueOf(deliveryTime.substring(3,5));
        this.deliveryTime=hour*60+minute;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }

    public int getDeliveryTime() {return deliveryTime;}
    public void setDeliveryTime() {
        this.deliveryTime=deliveryTime;
    }
}
