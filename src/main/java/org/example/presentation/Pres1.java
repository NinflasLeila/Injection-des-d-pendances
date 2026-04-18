package org.example.presentation;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
