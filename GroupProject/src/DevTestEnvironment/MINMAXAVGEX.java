/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

/**
 *
 * @author wetteb
 */
import java.util.*;
public class MINMAXAVGEX
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maxIncome = Double.MIN_VALUE; // Maximum income.    //Note 1
        double minIncome = Double.MAX_VALUE; // Minimum income.
        int    count       = 0;              // Number of input values.
        double totalIncome = 0;              // Total of all incomes.
        System.out.println("Enter incomes.  Terminate with EOF or non-number.");
        while (input.hasNextDouble()) { 
            double income = input.nextDouble();
            
            //... Compare this value to max and min. Replace if needed.
            if (income > maxIncome) {
                maxIncome = income;
            }
            if (income < minIncome) {
                minIncome = income;
            }

            //... Keep track of these values for average calculation.
            count++;                 // Count the number of data points.
            totalIncome += income;   // Keep a running total.
        }

        //... Be sure user entered at least one data point.
        if (count > 0) {                                          //Note 2
            //... Display statistics
            double average = totalIncome / count;
            System.out.println("Number of values = " + count);
            System.out.println("Maximum = "  + maxIncome);
            System.out.println("Minimum = "  + minIncome);
            System.out.println("Average = "  + average);
        } else {
            System.out.println("Error: You entered no data!");
        }
    }
}

