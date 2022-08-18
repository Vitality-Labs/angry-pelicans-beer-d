package com.example.beerd.utils;

public class Beer {

    private String name;
    private BeerTypes type;
    private String abv;
    private String ibu;
    private String description;
    private Brewery brewery;

    public Beer() {
        this.name = "";
        this.type = null;
        this.abv = "";
        this.ibu = "";
        this.description = "";
    }

    public Beer(String _name, BeerTypes _type, String _abv, String _ibu, String _desc, Brewery _brewery) {
        this.name = _name;
        this.type = _type;
        this.abv = _abv;
        this.ibu = _ibu;
        this.description = _desc;
        this.brewery = _brewery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeerTypes getType() {
        return type;
    }

    public void setType(BeerTypes type) {
        this.type = type;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brewery getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", abv='" + abv + '\'' +
                ", ibu='" + ibu + '\'' +
                ", description='" + description + '\'' +
                ", brewery=" + brewery +
                '}';
    }
}
