package com.chptools;

public class Component {

    private final double ratio;
    private final PhysicalProperties.GasComponents comp;

    public Component(PhysicalProperties.GasComponents comp, double ratio) {
        this.ratio = ratio;
        this.comp = comp;
    }


    public double molarMass(){ // returns molar mass in g/mol
        double c = comp.getCarbon()* PhysicalProperties.MOLARMASS_C;
        double h = comp.getHydrogen()* PhysicalProperties.MOLARMASS_H;
        double o = comp.getOxygen()* PhysicalProperties.MOLARMASS_O;
        double s = comp.getSulfur()* PhysicalProperties.MMOLARMASS_S;
        double n = comp.getNitrogen()* PhysicalProperties.MOLARMASS_N;
        return c + h + o + s + n;
    }

    public double lhv(){ // returns lhv in MJ/nm3
        return comp.getLHV() * (molarMass()/1000) * (1000/PhysicalProperties.MOLAR_VOLUME);
    }

    public double getRatio() {
        return ratio/100;
    }

    @Override
    public String toString() {
        return "Component{" + comp +
                ", ratio=" + ratio +
                ", LHV =" + lhv() +
                '}';
    }

}