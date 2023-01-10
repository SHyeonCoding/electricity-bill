package app;

import java.util.Scanner;

public class InputPowerUsage {

    public static int powerUsage() {
        System.out.print("전력 사용량을 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
