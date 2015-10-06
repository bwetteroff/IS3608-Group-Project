/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign1;

import java.util.Scanner;

/**
 *
 * @author codybeck
 */
public class RunMyMethods 
{
 
    public static void main(String args[])
    {
        MyMethods MM = new MyMethods();
        boolean quit = false;
    {
       Scanner sc = new Scanner(System.in); 
       int MenuSelection; 
       
       do {
            System.out.println("1.) Product No Negatives");
            System.out.println("2.) Find Twelve");
            System.out.println("3.) Max Min Avg");
            System.out.println("4.) Grader");
            System.out.println("5.) Exit");
            MenuSelection = sc.nextInt();
            
        if (MenuSelection == 1)
        {
         System.out.println("Menu Item 1: Product No Negatives");  
         MM.NoNegatives();
        }
        else if (MenuSelection == 2)
        {
         System.out.println("Menu Item 2: Find Twelve");
         MM.FindTwelve();
        }
        else if (MenuSelection == 3)
        {
         System.out.println("Menu Item 3: Max Min Avg");
         MM.MaxMinAvg();
        }
        else if (MenuSelection == 4)
        {
         System.out.println("Menu Item 4: Grader");
         MM.Grader();
        }
        else if (MenuSelection == 5)
        {
         System.out.println("Menu Item 5: Exit");
         MM.ExitMenu();
        }  
          } while (!quit);
        }
    }   
}

