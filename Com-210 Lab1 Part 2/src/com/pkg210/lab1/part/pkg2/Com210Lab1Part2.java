
package com.pkg210.lab1.part.pkg2;
import javax.swing.*;

public class Com210Lab1Part2 {

    
    public static void main(String[] args) {
       String item;
       String items[] = new String[3];
       String price;
       String peas = "peas";
       double prices[] = new double[3];
       double average = 0;
       double total = 0;
       for (int i = 0; i <= 2; i++)
       {
           item = JOptionPane.showInputDialog("What was the selected item?");
           items[i] = item;
           System.out.println("You selected " + items[i]);
           price = JOptionPane.showInputDialog("How much was it?");
           prices[i] = Double.parseDouble(price);
           System.out.println("You said the price was $" + prices[i]);
           total = total + prices[i];
       }
       for (int j = 0; j <= 2; j++)
       {
           if(peas.equalsIgnoreCase(items[j]) == true)
           {
            average = total / items.length;
            System.out.println("The average price was $" + average);
            j +=10;
           } 
           else if(peas.equalsIgnoreCase(items[j]) == false && j == 2)
           {
            System.out.println("no average output");
       }
              
       }
    }
}
    

