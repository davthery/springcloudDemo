package com.theryble.example.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductRestService {

    @Value("${me}")
    private String me;


    @Autowired
    private Forme forme;

    @RequestMapping("/messages")
    public String tellMe(){
        String lsMessage = me + forme.getForme();
        System.out.println("####   c'est moi qui ai répondu! " + lsMessage);
        return lsMessage;
    }
}