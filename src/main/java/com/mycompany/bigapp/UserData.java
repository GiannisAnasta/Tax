package com.mycompany.bigapp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

@ManagedBean(name = "userData")
@SessionScoped

public class UserData implements Serializable {

    private String type;//car,flar ...
    private String name;
    private boolean incoutc;
    private double cost;
    private String specific;
    private String specifictype;

    //start Specific for Car fields
    private Date yearManuf;

    public Date getYearManuf() {
        return yearManuf;
    }

    public void setYearManuf(Date yearManuf) {
        this.yearManuf = yearManuf;
    }

    //end Specific for Car fields
    //start specific for Water
    private double gallons;

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    //end specific for Water
    //start specific for Flat
    private double squareMeters;

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    //end cpecific for Flat
    private static final ArrayList<Item> items
            = new ArrayList<>();

    public ArrayList<Item> getItemss() {
        return items;
    }

    public String addItem() {

        if (type.equals("Car")) {
            Date now = new Date();
            long milisec = now.getTime() - yearManuf.getTime();
            long month = milisec / 1000 / 60 / 60 / 24 / 30;
            double offer;
            offer = month / 100.;

            cost = cost * 0.20;
            cost = cost - cost * offer;
            if (cost < 0) {
                cost = 0;
            }
//            BigDecimal bd = new BigDecimal(cost);
//            System.out.println(bd.toPlainString());
        } else if (type.equals("Water")) {
            cost = (gallons * 0.80);
        } else if (type.equals("Flat")) {
            cost = (squareMeters * 2.40);
        }

        Item item = new Item(type, name, cost, incoutc, specific, specifictype);
        items.add(item);

        type = null;
        name = null;
        incoutc = false;
        cost = 0;
        specific = null;
        specifictype = null;

        return null;
    }

    public String getSpecifictype() {
        return specifictype;
    }

    public void setSpecifictype(String specifictype) {
        this.specifictype = specifictype;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public void editItem(Item item) {
        item.setCanEdit(true);
    }

    public void saveItem(Item item) {
        item.setCanEdit(false);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIncoutc() {
        return incoutc;
    }

    public void setIncoutc(boolean incoutc) {
        this.incoutc = incoutc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private final DataModel<Item> itemDataModel = new ArrayDataModel<>();

    public DataModel<Item> getItems() {

        return itemDataModel;
    }
}
