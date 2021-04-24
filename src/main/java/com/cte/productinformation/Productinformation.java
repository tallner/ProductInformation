package com.cte.productinformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productinformation {

    private String name;
    private String link;
    private int price;

    public float calculateCustomerPrice(Float customerAddPercentage)
    {
        return price + (price * customerAddPercentage) / 100;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlink() {
        return this.link;
    }

    public void setlink(String link) {
        this.link = link;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}
