package app;

public class ElectricityBillCalculator {
    private int powerUsage = InputPowerUsage.powerUsage();
    private double electricityBill = 0;
    // 주택용 전기요금(저압)
    private double[] houseElectricityBills = {60.7, 125.9, 187.9, 280.6, 417.7, 670.6};

    public double billCalculator() {
        double remainder = powerUsage % 100;
        switch (powerUsage / 100) {
            case 0:
                electricityBill = houseElectricityBills[0] * remainder;
                return electricityBill;
            case 1:
                electricityBill = houseElectricityBills[0] * 100 + houseElectricityBills[1] * remainder;
                return electricityBill;
            case 2:
                electricityBill = houseElectricityBills[0] * 100 + houseElectricityBills[1] * 100 + houseElectricityBills[2] * remainder;
                return electricityBill;
            case 3:
                electricityBill = houseElectricityBills[0] * 100 + houseElectricityBills[1] * 100 + houseElectricityBills[2] * 100 + houseElectricityBills[3] * remainder;
                return electricityBill;
            case 4:
                electricityBill = houseElectricityBills[0] * 100 + houseElectricityBills[1] * 100 + houseElectricityBills[2] * 100 + houseElectricityBills[3] * 100 + houseElectricityBills[4] * remainder;
                return electricityBill;
            default:
                electricityBill = houseElectricityBills[0] * 100 + houseElectricityBills[1] * 100 + houseElectricityBills[2] * 100 + houseElectricityBills[3] * 100 + houseElectricityBills[4] * 100 + houseElectricityBills[5] * (powerUsage - 500);
                return electricityBill;
        }
    }
}

