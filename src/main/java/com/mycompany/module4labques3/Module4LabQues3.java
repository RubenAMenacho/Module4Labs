/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4labques3;
import java.util.Scanner;
/**
 *
 * @author ramlifting
 */
public class Module4LabQues3 {
    
    private static boolean[] seatChart = new boolean[10];

    private static void assignSeat(int seatType) {
        int seatNumber;
        if (seatType == 1) {
            seatNumber = assignFirstClassSeat();
        } else {
            seatNumber = assignEconomySeat();
        }

        if (seatNumber == -1) {
            System.out.println("Next flight leaves in 3 hours.");
        } else {
            System.out.println("Seat assigned: " + seatNumber);
        }
    }

    private static int assignFirstClassSeat() {
        for (int i = 0; i < 5; i++) {
            if (!seatChart[i]) {
                seatChart[i] = true;
                return i + 1;
            }
        }

        return -1;
    }

    private static int assignEconomySeat() {
        for (int i = 5; i < 10; i++) {
            if (!seatChart[i]) {
                seatChart[i] = true;
                return i + 1;
            }
        }

        System.out.println("Economy section is full. Would you like to be placed in the first-class section? (Y/N)");

        Scanner input = new Scanner(System.in);
        String response = input.next();
        if (response.equalsIgnoreCase("Y")) {
            return assignFirstClassSeat();
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class and Please type 2 for Economy:");
            int seatType = input.nextInt();

            if (seatType == 1 || seatType == 2) {
                assignSeat(seatType);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
