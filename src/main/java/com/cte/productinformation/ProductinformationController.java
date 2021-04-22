package com.cte.productinformation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductinformationController {

    @Autowired
    private ProductinformationService productinformationService;

    @GetMapping(path="/")
    @CrossOrigin()
    String empty()
    {
        return "Productinformation";
    }

    @GetMapping(path="/productinformation")
    @CrossOrigin()
    List<Productinformation> getAll(){
        return productinformationService.getAll();
    }

    @GetMapping(path="/productinformation/{id}")
    @CrossOrigin()
    Productinformation getSingle(@PathVariable Integer id){
        return productinformationService.get(id);
    }
    
}
