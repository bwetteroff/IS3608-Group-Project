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
public class MyMethods 
{
    Scanner sc = new Scanner(System.in);
    
    public void NoNegatives()
    {
        
    }
    
    public void FindTwelve()
    {
       // do something 
    }
    
    public void MaxMinAvg()
    {
        // do something
    }
    
    public void Grader()
    {
         int  input, sumA, sumB, sumC, sumD, sumF;
                     sumA=sumB=sumC=sumD=sumF=0;
        
        System.out.print("Please enter a grade [-99 to quit]: ");
        input = sc.nextInt();
        System.out.println(input);

    if(input==-99) 
        {
            System.exit(1);
        }

    while(input != -99)
        {

            if(input>=90)
            {
                sumA++;
                System.out.println(input + "      A");
        }
            else if(input >= 70)
            {
                sumB++;
                System.out.println(input + "      B");
            }
            else if(input >= 50)
            {
                sumC++;
                System.out.println(input + "      C");
            }
            else if(input >= 35)
            {
                sumD++;
                System.out.println(input + "      D");
            }
            else
            {
                sumF++;
                System.out.println(input + "      F");
            }
                
            System.out.print("Please enter another grade [-99 to quit]: ");
            input = sc.nextInt();
        }  
        System.out.println("The total number of A's is " + sumA );
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
        } 

    public void ExitMenu()
    {
        // exit menu option
    }
}
