/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Benjamin;

import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class RunMyMethods
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MyMethods M1 = new MyMethods();
        
        //Menu Print Out
        
        // Switch based Menu
        boolean quit = false;
        int menuItem;
        do {
            System.out.println("My Methods:");
            System.out.println("1. Product no negatives");
            System.out.println("2. Find Twelve");
            System.out.println("3. Max Min Avg");
            System.out.println("4. Letter Grade");
            System.out.println("5. Exit");
            System.out.print("Choose menu item: ");
            menuItem = sc.nextInt();
            switch (menuItem) 
            {
        case 1:
            System.out.println("You've chosen item #1: Product no negatives");
            M1.ProductNoNegatives();
        break;
        case 2:
            System.out.println("You've chosen item #2: Find Twelve");
            M1.FindTwelve();
        break;
        case 3:
            System.out.println("You've chosen item #3: Max Min Avg");
            M1.MinMaxAvg();
        break;
              
        case 4:
            System.out.println("You've chosen item #4: Letter Grade"); 
            M1.LetterGrade();
            
        break;
        case 5:
            quit = true;
        break;
        default:
            System.out.println("Invalid menu choice, please select again.");
        }
    } 
    while (!quit);
    System.out.println("Exit");
    }
}

