/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;


/**
 *
 * @author SPC
 */
public class Bai4_Tinhtoancoban {
    public static void main(String[] args) {
        System.out.println("chương trinh tinh hieu 2 so");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        System.out.println(a + " - " + b + "=" + tinhtong(a,b));
        System.out.println(a + " - " + b + "=" + tinhhieu(a,b));
        System.out.println(a + " - " + b + "=" + tinhtich(a,b));
        System.out.println(a + " - " + b + "=" + tinhthuong(a,b));
            
        }
    public static int tinhtong(int a, int b)
    {
        return a + b;
    }
      public static int tinhhieu(int a, int b)
    {
        return a - b;
    }
        public static int tinhtich(int a, int b)
    {
        return a * b;
    }
          public static String tinhthuong(int a, int b){
         if (b !=0){
             return"" + (double)a/b;
         }
         else
             return a + "Khong the chia cho 0";
     }
     public static double Tinhthuong1(int a, int b){
         if(b == 0)
             return 0;
         return (double) a/b;
     }
         
}
         

