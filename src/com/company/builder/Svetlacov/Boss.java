package com.company.builder.Svetlacov;

import com.company.builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class Boss {
    private HouseBuilder houseBuilder;

    public Boss(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void build() {
        houseBuilder.createRoof();
        houseBuilder.drillWall();
        houseBuilder.fillBasement();

        System.out.println("Result="+houseBuilder.getResult());
    }
}
