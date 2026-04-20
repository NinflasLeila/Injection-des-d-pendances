package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metierannotation")
public class metieranno implements IMetier {

    @Autowired
    private IDao dao;

    public double calcul() {
        return dao.getData() * 3;
    }
}
