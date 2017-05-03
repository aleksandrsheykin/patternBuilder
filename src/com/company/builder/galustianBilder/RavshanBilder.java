package com.company.builder.galustianBilder;

import com.company.builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class RavshanBilder implements HouseBuilder {
    private String basement, wall, roof;

    @Override
    public void fillBasement() {
        basement = "Ravsha basement goood";
    }

    @Override
    public void drillWall() {
        wall = "Ravsha wall complite";
    }

    @Override
    public void createRoof() {
        roof = "Ravsha krisha shatal";
    }

    @Override
    public String getResult() {
        return basement+", "+wall+", "+roof;
    }
}
