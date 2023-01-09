package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("주택 전기요금(저압) 계산기");
        System.out.println("=".repeat(50));

        ElectricityBillCalculator electricityBillCalculator = new ElectricityBillCalculator();
        double resultBill = electricityBillCalculator.billCalculator();
        System.out.printf("전기 사용 요금은 %.1f원 입니다.", resultBill);
    }
}
