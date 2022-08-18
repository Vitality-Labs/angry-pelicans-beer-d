package com.example.beerd.utils;

import java.util.ArrayList;

public class Brewery {

    private String name;
    private String address;
    private ArrayList<Beer> brewlist;

    public Brewery() {
        this.name = "";
        this.address = "";
        this.brewlist = new ArrayList<Beer>();
    }

    public Brewery(String _name, String _address) {
        this.name = _name;
        this.address = _address;
        this.brewlist = new ArrayList<Beer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Beer> getBrewlist() {
        return brewlist;
    }

    @Override
    public String toString() {
        return "Brewery{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", brewlist=" + brewlist +
                '}';
    }
}
