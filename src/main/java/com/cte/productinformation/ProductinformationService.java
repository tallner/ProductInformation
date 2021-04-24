package com.cte.productinformation;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    ResponseEntity<Object> add(Productinformation p) {
        productinformationRepository.save(p);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(p.getId())
        .toUri();
        return ResponseEntity.created(location).build();
    }
      
}
