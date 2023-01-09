package app;

import java.util.Scanner;

public class InputPowerUsage {
    private static int power;

    public static int powerUsage() {
        System.out.print("전력 사용량을 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        power = Integer.parseInt(scanner.nextLine());
        return power;
    }
}
