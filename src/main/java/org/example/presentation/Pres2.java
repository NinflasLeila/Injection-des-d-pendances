package org.example.presentation;

import org.example.dao.IDao;
import org.example.metier.IMetier;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Class cDao = Class.forName("DaoImpl");
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        Class cMetier = Class.forName("MetierImpl");
        IMetier metier = (IMetier) cMetier
                .getConstructor(IDao.class)
                .newInstance(dao);

        System.out.println(metier.calcul());
    }
}