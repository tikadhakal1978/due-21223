/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.main13;
import java.util.Scanner;
/**
 *
 * @author tikad
 */
public class Main13 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int product =0 ;
        double amount = 0;
        int Quantity;
        String check = "y";
        double total = 0;
        while (check.equals ("y"))
        {
            
        System.out.println ("Enter product number:");
        product = input.nextInt();
        System.out.println("Enter Quantity Sold:");
        Quantity = input.nextInt();
        switch (product)
        {
            case 1 -> amount = 2.98;
            case 2 -> amount = 4.50;
            case 3 -> amount = 9.98;
            case 4 -> amount = 4.49;
            case 5 -> amount = 6.87;
             }
            System.out.println ("Want to enter another sale?(y/n):");
                check = input.next();
        total = amount * Quantity;
        System.out.printf("Total Retail Value of product sold is: $%.2f",total);
        System.out.println('\n');
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
}