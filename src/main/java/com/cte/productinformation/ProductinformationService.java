package com.cte.productinformation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductinformationService {
    
    private final ProductinformationRepository productinformationRepository;



    ProductinformationService(ProductinformationRepository productinformationRepository) {
        super();
        this.productinformationRepository = productinformationRepository;
    }
/**/
    List<Productinformation> getAll(){
        var l = new ArrayList<Productinformation>();
        for(Productinformation r : productinformationRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    Productinformation get(Integer id){
        return productinformationRepository.findById(id).get();
    }
    
}
