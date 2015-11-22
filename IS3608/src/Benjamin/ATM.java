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
public class ATM 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the Enter key for menu: \n");
        accountMenu();
    }
    public void Deposit()
    {
        System.out.println("You are in Deposit");
    }
    public void Withdraw()
    {
        System.out.println("You are in Withdraw");
    }
    public void CheckBalance()
    {
        System.out.println("You are in Check Balance");
    }
    public static void accountMenu()
    {
        System.out.println("Welcome to WSSBC, /n" + "Wall Street Sucks Banking Corp.:");
        System.out.println("Do you have an account?");
        System.out.println("1 - Yes I have an account!");
        System.out.println("2 - No, please assist me in setting up my account.");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter \"1\", \"2\" or \"3\"");
        int m1 = sc.nextInt();

        while (m1 != 2) 
        {
        if (m1 < 1 || m1 > 2) 
        {
        System.out.println("Enter \"1\", \"2\"");
        m1 = sc.nextInt();
        }
        else if(m1 == 1) 
        {
            
        }
        else if(m1 == 2) 
        {
            //newAccount
        }
        
        }
    }
}
