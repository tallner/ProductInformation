package com.cte.productinformation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ProductinformationServiceTest {
    ProductinformationRepository productinformationRepository;
    ArrayList<Productinformation> testlist;
    @BeforeEach
    void init()
    {
        testlist = new ArrayList<Productinformation>();
        testlist.add(new Productinformation());
        testlist.add(new Productinformation());
        testlist.add(new Productinformation());
        productinformationRepository = Mockito.mock(ProductinformationRepository.class);
        when(productinformationRepository.findAll()).thenReturn(testlist);
    
    }

    @Test
    void getAllShouldReturnAllRecords()
    {
        var sut = new ProductinformationService(productinformationRepository);
        assertArrayEquals( testlist.toArray() ,sut.getAll().toArray());            
    }

/** /
    @Test
    void getOneShouldReturnOneRecord()
    {
        var sut = new ProductinformationService(productinformationRepository);
      //  assertArrayEquals( testlist.toArray() ,sut.get(0));
        assertEquals(testlist.get(0), sut.get(0));    
    }
/**/    
}
