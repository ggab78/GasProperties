package com.chptools;

public class Main {

    public static void main(String[] args) {

        GasComposition gas = new GasComposition();
        gas.createGasComposition();

        for(Component c : gas.getComponents()){
            System.out.println(c);
        }

        GasProperties gasProp = new GasProperties(gas);
        System.out.println(gasProp.lhv());
        System.out.println(gasProp.molarMass());

    }
}
