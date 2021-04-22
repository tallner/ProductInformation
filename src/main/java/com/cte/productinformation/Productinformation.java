package com.cte.productinformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productinformation {

    private String name;
    private String webSite;
    private int price;

    public Integer calculateCustomerPrice(int customerAddPercentage)
    {
        return (price * customerAddPercentage) / 100;
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

    public String getWebSite() {
        return this.webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
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
