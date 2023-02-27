/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4labq1;

/**
 *
 * @author ramlifting
 */
public class Module4LabQ1 {
    
    public static void main(String[] args) {
        int[] myCounts = new int[10];
        int[] myBonus = new int[15];
        int[] myBestScores = {5, 10, 15, 20, 25, 30, 35, 40};

        for (int i = 0; i < myCounts.length; i++) {
            myCounts[i] = 0;
        }
        
        for (int i = 0; i < myBonus.length; i++) {
            myBonus[i] = myBonus[i] + 1;
        }
        
        for (int i = 0; i < myBestScores.length; i++) {
            System.out.println(myBestScores[i]);
        }
    }
}

