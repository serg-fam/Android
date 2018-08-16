package com.sergi.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("dark")) {
            brands.add("Dark Beer");
            brands.add("HalfDark Beer");
        } else if (color.equals("brow")) {
            brands.add("Brow Beer");
        } else {
            brands.add("Light Beer");
            brands.add("Beer Beer");
        }
        return brands;
    }
}
