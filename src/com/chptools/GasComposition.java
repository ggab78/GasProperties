package com.chptools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GasComposition {

    private List<Component> components;

    public GasComposition() {
        this.components = new ArrayList<>();
    }

public void createGasComposition(){
    Component newComponent;
    System.out.println("Provide gas composition in vol %\n");
    double ratio;
    for (PhysicalProperties.GasComponents comp : PhysicalProperties.GasComponents.values()){

        System.out.println("\n");
        System.out.println(comp.name()+ " : ");
        Scanner s = new Scanner(System.in);
        ratio = s.nextDouble();
        s.nextLine();

        newComponent = new Component(comp, ratio);
        components.add(newComponent);
    }
}

    public List<Component> getComponents() {
        return components;
    }
}
