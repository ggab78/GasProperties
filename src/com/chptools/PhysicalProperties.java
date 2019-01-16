package com.chptools;

public class PhysicalProperties {

    public static final double
            MOLARMASS_C = 12.011, //g/mol
            MOLARMASS_H = 1.00794,
            MMOLARMASS_S = 32.066,
            MOLARMASS_O = 15.9994,
            MOLARMASS_N = 14.00674,
            MOLARMASS_Ar = 39.948,
            MOLAR_VOLUME = 22.413968; //22.414 L/mol at 0 °C and 1 atm


    public enum GasComponents {
        METHANE (1,4,0,0,0,50.043,55.662),
        ETHANE (2,6,0,0,0,47.53,52.02),
        PROPANE(3,8,0,0,0,46.35,50.44),
        ISOBUTANE(4,10,0,0,0,45.57,49.45),
        NBUTANE(4,10,0,0,0,45.74,49.62),
        ISOPENTANE (5,12,0,0,0, 45.26, 49.01),
        NPENTANE (5,12,0,0,0,45.36,49.10),
        HEXANE (6,14,0,0,0,45.11,48.77),
        HEPTANE (7,16, 0,0,0,44.93,48.53),
        ETHENE (2,4,0,0,0,47.17,50.39),
        PROPENE (3,6,0,0,0,45.78,48.99),
        NITROGEN(0,0,0,0,2,0.0,0.0),
        CO_2 (1,0,2,0,0,0.0,0.0),
        H_2_S(0,2,0,1,0,15.201, 16.524),
        H_2(0,2,0,0,0,119.494, 141.88),
        CO(1,0,1,0,0,10.11,10.11);

        GasComponents(int carbon, int hydrogen, int oxygen, int sulfur, int nitrogen, double lhv, double hhv) {
        this.Carbon = carbon;
        this.Hydrogen = hydrogen;
        this.Oxygen=oxygen;
        this.Nitrogen=nitrogen;
        this.Sulfur=sulfur;
        this.LHV=lhv;
        this.HHV=hhv;
        }

        private final int Carbon;
        private final int Hydrogen;
        private final int Oxygen;
        private final int Sulfur;
        private final int Nitrogen;
        private final double LHV; //LHV [kj/kg] PN-ISO 6976:2003 0stC
        private final double HHV; //HHV[kj/kg] PN-ISO 6976:2003 0stC

        public int getCarbon() {
            return Carbon;
        }

        public int getHydrogen() {
            return Hydrogen;
        }

        public int getOxygen() {
            return Oxygen;
        }

        public int getSulfur() {
            return Sulfur;
        }

        public int getNitrogen() {
            return Nitrogen;
        }

        public double getLHV() {
            return LHV;
        }

        public double getHHV() {
            return HHV;
        }
    }

}
