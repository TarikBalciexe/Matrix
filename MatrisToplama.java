/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matristoplama;

/**
 *
 * @author Tarık BALCI
 */
import java.util.Scanner;
public class MatrisToplama {
 public static void main(String arg[]) {
     try 
         (Scanner input = new Scanner(System.in)) {
         int x, y, z, v;
         System.out.print("Satır sayısı girin (x)=");
         x = input.nextInt();
         System.out.print("Sütun sayısını girin (y)=");
         y = input.nextInt();
         int A[][] = new int[x][y];
         int B[][] = new int[x][y];
         int C[][] = new int[x][y];
         System.out.println("A matrisini girin:");
         for (z = 0; z < x; z++)
             for (v = 0; v < y; v++) {
                 System.out.printf("A[%d][%d]=", z + 1, v + 1);
                 A[z][v] = input.nextInt();
             }     System.out.println("B matrisini girin:");
             for (z = 0; z < x; z++)
                 for (v = 0; v < y; v++) {
                     System.out.printf("B[%d][%d]=", z + 1, v + 1);
                     B[z][v] = input.nextInt();
                 }  
             for (z = 0; z < x; z++)
                 for (v = 0; v < y; v++) {
                     C[z][v] = A[z][v] + B[z][v];
                 }     System.out.printf("A+B=\n");
               
                 for (z = 0; z < x; z++) {
                     for (v = 0; v < y; v++)
                         System.out.printf("%d ", C[z][v]);
                     System.out.printf("\n");
                 }  }
 }
}
