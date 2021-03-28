package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    @GetMapping(value="/car")
    @CrossOrigin()
    public List<Car> getall() {
        var l = new ArrayList<Car>();
        
        l.add(new Car("Volvo", "XC70", "Blå", 2008));
        l.add(new Car("Volvo", "XC60", "Svart", 2015));
        l.add(new Car("Volvo", "240", "Röd", 1985));
        l.add(new Car("Renault", "Megane", "Svart", 2018));
        return l;
        
    }
    
}
