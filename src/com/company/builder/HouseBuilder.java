package com.company.builder;

/**
 * Created by admin on 03.05.2017.
 */
public interface HouseBuilder {

    void fillBasement(); //залить фундамент
    void drillWall(); //сверлить стены
    void createRoof(); //сделать крышу
    String getResult();
}
