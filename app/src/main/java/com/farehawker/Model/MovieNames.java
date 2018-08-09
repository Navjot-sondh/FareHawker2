package com.farehawker.Model;

import java.util.ArrayList;

/**
 * Created by FareHawker.com on 05-03-2018.
 */

public class MovieNames {
    private String name,full,country;
    private ArrayList<String> genre;
    public MovieNames() {
        super();
    }
    public MovieNames(String name, String full,String country) {
        this.name = name;
        this.full = full;
        this.country=country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFull() {
        return full;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFull(String full) {
        this.full = full;
    }
    @Override
    public String toString() {
        return this.name + ". " + this.full+ "";
    }
}
