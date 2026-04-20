package org.example.dao;


import org.springframework.stereotype.Component;

@Component("daoannotation")
public class daoannotation implements IDao{
    @Override
    public double getData() {
        return 200;
    }
}
