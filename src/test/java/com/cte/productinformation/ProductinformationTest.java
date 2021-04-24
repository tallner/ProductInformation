package com.cte.productinformation;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductinformationTest {
    
    @Test
    void calculateCustomerPrice_checkValueInteger(){
        int addPercentageToPrice = 20;
        Productinformation productinformation = new Productinformation();
        productinformation.setName("X20CP0292");
        productinformation.setlink("https://www.br-automation.com/en/products/x20cp0292/");
        productinformation.setPrice(600);

        assertThat(productinformation.calculateCustomerPrice((float) addPercentageToPrice)).isEqualTo(720);
    }
    
    @Test
    void calculateCustomerPrice_checkValueFloat(){
        float addPercentageToPrice = 20;
        Productinformation productinformation = new Productinformation();
        productinformation.setName("X20CP0292");
        productinformation.setlink("https://www.br-automation.com/en/products/x20cp0292/");
        productinformation.setPrice(93);

        assertThat(productinformation.calculateCustomerPrice(addPercentageToPrice)).isEqualTo(111.6f);
    }

    
    
}
