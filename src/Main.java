//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int maxBigBags = goal / 5;
        int BigBagsToUse = Math.min(bigCount, maxBigBags);
        int remainingKg = goal - (BigBagsToUse * 5);

        if (remainingKg <= smallCount)
            return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of big bags: ");
        int bigCount = sc.nextInt();
        System.out.println("Enter the number of small bags: ");
        int smallCount = sc.nextInt();
        System.out.println("Enter the goal: ");
        int goal = sc.nextInt();
        System.out.println(canPack(bigCount, smallCount, goal));

    }
}