package com.company;

import com.company.builder.Svetlacov.Boss;
import com.company.builder.galustianBilder.JamshootBilder;
import com.company.builder.galustianBilder.RavshanBilder;

public class Main {

    public static void main(String[] args) {

        JamshootBilder jamshootBilder = new JamshootBilder();
        Boss boss = new Boss(jamshootBilder);
        boss.build();

        RavshanBilder ravshanBilder = new RavshanBilder();
        Boss boss1 = new Boss(ravshanBilder);
        boss1.build();
    }
}
