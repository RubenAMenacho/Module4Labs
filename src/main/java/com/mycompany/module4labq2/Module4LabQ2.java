/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4labq2;

/**
 *
 * @author ramlifting
 */
public class Module4LabQ2 {
    
    public static void main(String[] args) {
        int product1 = getProduct(2, 3, 4);
        System.out.println("Product 1: " + product1);

        int product2 = getProduct(5, 6);
        System.out.println("Product 2: " + product2);

        int product3 = getProduct(8, 9, 10);
        System.out.println("Product 3: " + product3);
    }

    public static int getProduct(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}

