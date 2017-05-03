package com.company.builder.galustianBilder;

import com.company.builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class JamshootBilder implements HouseBuilder {
    private String basement, wall, roof;

    @Override
    public void fillBasement() {
        basement = "basement goood";
    }

    @Override
    public void drillWall() {
        wall = "wall complite";
    }

    @Override
    public void createRoof() {
        roof = "krisha shatal";
    }

    @Override
    public String getResult() {
        return basement+", "+wall+", "+roof;
    }
}
