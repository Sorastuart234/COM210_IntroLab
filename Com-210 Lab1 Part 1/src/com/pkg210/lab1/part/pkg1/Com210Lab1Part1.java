/*

 */
package com.pkg210.lab1.part.pkg1;
import javax.swing.*;
        

public class Com210Lab1Part1 {

   
    public static void main(String[] args) {
       String item;
       String items[] = new String[3];
       String price;
       double prices[] = new double[3];
       double average = 0;
       double total = 0;
       for (int i = 0; i <= 2; i++)
       {
           item = JOptionPane.showInputDialog("What item did you have selected?");
           items[i] = item;
           System.out.println("You selected " + items[i]);
           price = JOptionPane.showInputDialog("How much was the " + items[i] + "?");
           prices[i] = Double.parseDouble(price);
           System.out.println("You said the price was " + prices[i]);
           total = total + prices[i];
           average = total / 3;
           
       }
       System.out.println("The average price for all 3 items will be $" + average);
    }
    
}
