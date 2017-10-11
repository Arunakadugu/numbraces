package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();

        int n = 6;
        int sum = 0;
        int counter = 0;
        while (counter <= n) {
            sum = sum + counter;
            System.out.print("(" + counter + ")");
            counter++;
        }
    }
}