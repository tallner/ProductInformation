package com.cte.productinformation;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductinformationTest {
    
    @Test
    void calculateCustomerPrice_checkValue(){
        Integer addPercentageToPrice = 20;
        Productinformation productinformation = new Productinformation();
        productinformation.setName("X20CP0292");
        productinformation.setWebSite("https://www.br-automation.com/en/products/x20cp0292/");
        productinformation.setPrice(600);

        assertThat(productinformation.calculateCustomerPrice(addPercentageToPrice).equals(120));
    }
    
}
