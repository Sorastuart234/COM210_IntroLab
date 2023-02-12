package javaapplication3;
import javax.swing.*;

public class JavaApplication3 {

    public static void main(String[] args) {
    String item;
    int numItems;
    item = JOptionPane.showInputDialog("How many items do you want?");
    numItems = Integer.parseInt(item);
    String items[] = new String[numItems];
    String price;
    double prices[] = new double[numItems];
    double total = 0;
    double average = 0;
    String peas = "peas";
    
    
    for(int i = 0; i <= numItems - 1 ; i++)
    {
       item = JOptionPane.showInputDialog("What item do you want?");
       items[i] = item;
       price = JOptionPane.showInputDialog("How much was it?");
       prices[i] = Double.parseDouble(price);
       total = total + prices[i];
       average = total / items.length;
       
    }
    
    System.out.print("You're listed items were " );
   for(int p = numItems - 1; p >= 0; p--)
   {
       System.out.print( items[p] + " ");
   }
   System.out.println("");
   
   System.out.print("The prices for these items were $");
   for(int q = numItems- 1; q >= 0; q--)
   {
       System.out.print(prices[q] + " " + "$");
   }
   System.out.println("");
   
   for (int j = 0; j <= items.length - 1; j++)
       {
           if(items[j].equalsIgnoreCase(peas) == true)
           {
            System.out.println("The average price was $" + average);
            j += 10;
           }
           else if(items[j].equalsIgnoreCase(peas) == false && j == items.length - 1)
           {
           System.out.println("no average output");
           }
       }
    }
}

