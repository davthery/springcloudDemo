package com.theryble.example.productservice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="deploy.forme",havingValue = "Carre")
public class Carre implements Forme {


public String  getForme () {
        return " Forme carre";
    }
}
