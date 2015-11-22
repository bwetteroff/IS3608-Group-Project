/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Benjamin;

import java.io.*;
import java.util.*;
import java.lang.*; 
import java.text.*;



/**
 *
 * @author bpwc0b
 */
public class Account //implements Serializable //only if printing out file
{
    protected double balance;
    protected int firstdate;
    protected int seconddate;
    protected Calendar cal1 = new GregorianCalendar();
    protected Calendar cal2 = new GregorianCalendar();
    protected boolean dateflag = false;
    protected double rate;

    public void currentMember()
    {
        Scanner sc = new Scanner(System.in);
        ATM A1 = new ATM();
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
            A1.Deposit();
        break;
        case 2:
            System.out.println("You have choosen to withdraw:");
            A1.Withdraw();
        break;
        case 3:
            System.out.println("You have choosen to check your balance:");
            A1.CheckBalance();
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


public void getInterest()
        {
            int datediff = seconddate - firstdate;
            rate = .05/365;
            double ratetime = Math.pow(1+rate,datediff);
            balance = balance * ratetime;
            firstdate = seconddate;

        }

public void getDate1() throws IOException {

        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date mydate = formatter.parse(inputText, pos);
        cal1.setTime(mydate);
        firstdate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;
        }
}