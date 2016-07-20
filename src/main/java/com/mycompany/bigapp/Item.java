package com.mycompany.bigapp;

public class Item {

    private static int counter;

    private int id;
    private String type;
    private String name;
    private double cost;
    private boolean incoutc;
    private String specific;
    private String specifictype;
    private boolean canEdit;

    public Item(String type, String name, double cost, boolean incoutc, String specific, String specifictype) {
        this.id = counter++;
        this.type = type;
        this.name = name;
        this.cost = cost;
        this.incoutc = incoutc;
        this.specific = specific;
        this.specifictype = specifictype;
        canEdit = false;
    }

    Item(String type, String name, double cost, boolean incoutc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

//Getters
    public String getSpecifictype() {
        return specifictype;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public boolean isIncoutc() {
        return incoutc;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public String getSpecific() {
        return specific;
    }

    //Setters
    public void setSpecifictype(String specifictype) {
        this.specifictype = specifictype;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setIncoutc(boolean incoutc) {
        this.incoutc = incoutc;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public String getSpecificType() {
        return type + specifictype;
    }

}
