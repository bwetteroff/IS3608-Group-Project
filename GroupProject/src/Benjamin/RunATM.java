/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Benjamin;

import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class RunATM 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the Enter key for menu: \n");
        menu();
    }
    
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        MyMethods M1 = new MyMethods();
        // Switch based Menu
        boolean quit = false;
        String menuItem;
        do {
            System.out.println("Welcome to your Bank Account:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose menu item: ");
            menuItem = sc.next();
            switch (Integer.parseInt(menuItem)) 
            {
        case 1:
            System.out.println("You have choosen to deposit:");
            
        break;
        case 2:
            System.out.println("You have choosen to withdraw:");
            
        break;
        case 3:
            System.out.println("You have choosen to check your balance:");
           
        break;
              
        case 4:
            quit = true;
        break;
        default:
            System.out.println("Invalid menu choice, please make another selection.");
        }
    } 
    while (!quit);
    System.out.println("Exit");
    }
    
}
