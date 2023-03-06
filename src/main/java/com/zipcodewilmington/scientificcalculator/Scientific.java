package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    public static int units = 1;
    public Scientific() {
    }

    public static void setUnits(int unit) {
        units = unit;
    }

    public static int getUnits() {
        return units;
    }
    /**
    * returns sine of @param entry
     */
    public static double sine(double entry){
        if (units == 0) {
            return Math.sin(Math.toRadians(entry));
        } else {
            return Math.sin(entry);
        }
    }
    /**
     * returns cosine of @param entry
     */
    public static double cosine(double entry) {
        if (units == 0) {
            return Math.cos(Math.toRadians(entry));
        } else {
            return Math.cos(entry);
        }
    }
    /**
     * returns tangent of @param entry
     */
    public static double tangent(double entry) {
        if (units == 0) {
            return Math.tan(Math.toRadians(entry));
        } else {
            return Math.tan(entry);
        }
    }
    /**
     * returns inverse sine of @param entry
     */
    public static double inverseSine(double entry) {
        if (units == 0) {
            return Math.asin(Math.toRadians(entry));
        } else {
            return Math.asin(entry);
        }
    }
    /**
     * returns inverse cosine of @param entry
     */
    public static double inverseCosine(double entry) {
        if (units == 0) {
            return Math.acos(Math.toRadians(entry));
        } else {
            return Math.acos(entry);
        }
    }

    /**
     * returns inverse tangent of @param entry
     */
    public static double inverseTangent(double entry) {
        if (units == 0) {
            return Math.atan(Math.toRadians(entry));
        } else {
            return Math.atan(entry);
        }
    }

    /**
     * returns log of @param entry
     */
    public static double log(double entry) {
        return Math.log10(entry);
    }

    /**
     * returns inverse log of @param entry
     */
    public static double inverseLog(double entry) {
        return Math.pow(10, entry);
    }

    /**
     * returns sine of @param entry
     */
    public static double naturalLog(double entry) {
        return Math.log(entry);
    }

    /**
     * returns inverse natural log of @param entry
     */
    public static double inverseNatLog(double entry) {
        return Math.exp(entry);
    }

    /**
     * returns factorial of @param entry
     */
    public static double factorial(double entry) {
        double factResult = 1;
        if (entry < 0) {
            for (int i = 1; i <= Math.abs(entry); i++) {
                factResult *= i;
            }
            factResult *= -1;
            return factResult;
        } else {
            for (int i = 1; i <= entry; i++) {
                factResult *= i;
            }
        } return factResult;
    }


}
