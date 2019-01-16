package com.chptools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GasProperties {

    private GasComposition gas;

    public GasProperties(GasComposition gas) {
        this.gas = gas;
    }

    public double lhv() {
        double lhv = 0.0;
        for (Component c : gas.getComponents()) {
            lhv += c.lhv() * c.getRatio();
        }
        return lhv;
    }

    public double molarMass() {
        double mM = 0.0;
        for (Component c : gas.getComponents()) {
            mM += c.molarMass() * c.getRatio();
        }
        return mM;
    }


}

//
//    public void combustion(GasComposition composition) {
//
//        weightCarbonDioxide = weightCombC/molarMassC * (molarMassC + 2 * molarMassO);
//        weightWaterVapour = (weightH/2/molarMassH)*(2*molarMassH + molarMassO);
//        weightSulfurDioxide = weightS/molarMassS * (molarMassS + 2 * molarMassO)*0.95; //approx 95% is sulfur dioxide
//        weightSulfurTrioxide = weightS/molarMassS * (molarMassS + 3 * molarMassO)*0.05; //approx 5% is sulfur dioxide
//
//        molesO2 = combC + //weightCarbonDioxide/(molarMassC + 2 * molarMassO)+
//                combH/4 + //weightWaterVapour/(2*(molarMassH*2+molarMassO))+
//                combS * 0.95 + //approx 95% is sulfur dioxide
//                combS * 1.5 * 0.05 - //approx 5% is sulfur trioxide
//                composition.getCOCont() * 0.5;
//
//        molesN2 = molesO2*78.084/20.947;
//        molesAr = molesO2*0.934/20.947;
//        molesCO2 = molesO2*0.035/20.947;
//        molesAir = molesO2+molesN2+molesAr+molesCO2;
//    }
//
//    public double airMolarMass() {
//        double oxygen = 20.947 / 100 * 2 * molarMassO;
//        double nitrogen = 78.084 / 100 * 2 * molarMassN;
//        double argon = 0.934 / 100 * molarMassAr;
//        double carbDiox = 0.035 / 100 * (molarMassC + 2 * molarMassO);
//
//        return oxygen + nitrogen + argon + carbDiox;
//    }
//
//    public double contentH2S(GasComposition composition) {
//        return (molarMassH2S() / (molarVolume/1000) / gasLHV(composition)
//                * 1000 * 36) * composition.getH2SCont();
//    }