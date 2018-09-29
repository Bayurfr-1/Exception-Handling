/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author win 7
 */
public class TugasPraktikum {
       public static void main(String[] args)
 {
    int a = 20;
    System.out.println("Eksekusi Pembagian Suatu Bilangan");


    for (int i=7; i>=0; i--)
  {
      System.out.print("\nUntuk i = "+i+" >>>>> ");
   try
   {
    System.out.println(+a+"/"+i+" = "+a/i);
   }
   catch(RuntimeException r)
   {
    System.out.print("Tidak dapat dieksekusi, karena");
    System.out.println("\n"+a+" Tidak dapat dibagi dengan "+i);
   }
   }
  }
};

        
    

