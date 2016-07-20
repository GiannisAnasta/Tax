package com.mycompany.bigapp;

public enum Type {

    FLAT("flat"),
    CAR("car"),
    WATER("water"),
    ELECTRICITY("electricity");

    private String label;

    private Type(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
