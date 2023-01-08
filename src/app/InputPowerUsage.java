package app;

import java.util.Scanner;

public class InputPowerUsage {
    Scanner scanner = new Scanner(System.in);
    public int power;

    public int powerUsage() {
        power = Integer.parseInt(scanner.nextLine());
        return power;
    }
}
