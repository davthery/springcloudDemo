package com.theryble.example.productservice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="deploy.forme",havingValue = "Cercle")
//@Primary
public class Cercle implements Forme {


public String  getForme () {
        return " Forme Cercle";
    }
}
