package com.example.mobileapplication5;

import java.util.Date;

/**
 * Created by 박남주 on 2017-03-30.
 */

public class Table {

    String tablename, membership, date;
    int spaghetti, pizza, price;

    public Table(String tablename,int spaghetti,int pizza){

        this.tablename = tablename;
        this.spaghetti = spaghetti;
        this.pizza = pizza;
        this.membership = null;
        this.price = 0;
        this.date = null;
    }
}

