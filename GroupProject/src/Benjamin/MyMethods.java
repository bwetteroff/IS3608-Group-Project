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
public class MyMethods
{
    Scanner sc = new Scanner(System.in);
    
       
        
    public void ProductNoNegatives()
    {
        
    }
    
    public void FindTwelve()
    {
        
    }
    
    public void MinMaxAvg ()
    {
        
    }
          
    public void LetterGrade()
    {
        int input, sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	System.out.println("Enter all grades, press -99 to stop:");
        //input = sc.nextInt();
        
        RunMyMethods run = new RunMyMethods();
        int s1 = 63; 
        int s2 = 75;
        int s3 = 72;
        int s4 = 72;
        int s5 = 78;
        int s6 = 67; 
        int s7 = 80;
        int s8 = 63;
        int s9 = 0;
        int s10 = 90;
        int s11 = 89;
        int s12 = 43;
        int s13 = 59;
        int s14 = 99;
        int s15 = 82;
        int s16 = 12;
        int s17 = 100;
        int s18 = 75;
        input = sc.nextInt();
        
        
// May need to change loop structure to a do-while or a for loop, this is 
//terminating after any input is recieved, or figure out how to 
//point the code back to the top of the loop
            if(input>=90)
            {
                sumA++;
                System.out.println(input + "      A");
	    }
            if(input >= 70){
                sumB++;
                System.out.println(input + "      B");
            }
            if(input >= 50){
                sumC++;
                System.out.println(input + "      C");
            }
            if(input >= 35){
                sumD++;
                System.out.println(input + "      D");
            }
            if(input >= 0) 
            {
                sumF++;
                System.out.println(input + "      F");
            }
            if(input == -99)
            {
                System.out.println("You have entered all grade values.");
            }
        
        System.out.println("The total number of A's is " + (sumA));
        System.out.println("A's are from 90 - 100");
        System.out.println("The total number of B's is " + (sumB ));
        System.out.println("B's are from 70 - 89");
        System.out.println("The total number of C's is " + (sumC ));
        System.out.println("C's are from 50 - 69");
        System.out.println("The total number of D's is " + (sumD ));
        System.out.println("D's are from 35 - 49");
        System.out.println("The total number of F's is " + (sumF ));
        System.out.println("F's are from 0 - 34");
    }
} 
