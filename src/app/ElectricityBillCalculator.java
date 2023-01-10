package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricityBillCalculator {
    private int powerUsage = InputPowerUsage.powerUsage();
    private double electricityBill = 0;
    // 주택용 전기요금(저압)
    private List<Double> houseElectricityBills = new ArrayList<>(Arrays.asList(60.7, 125.9, 187.9, 280.6, 417.7, 670.6));

    public double billCalculator() {
        double remainder = powerUsage % 100;
        int value = powerUsage / 100;

        for(int i = 0; i < value; i++) {
            electricityBill += houseElectricityBills.get(i) * 100;
        }
        electricityBill = electricityBill + remainder * houseElectricityBills.get(value);
        return electricityBill;
    }
}

