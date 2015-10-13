/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Benjamin;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wetteb
 */
public class MyMethods
{
    Scanner sc = new Scanner(System.in);
    public void ProductNoNegatives()
    {
        System.out.println("Please enter a series of numbers to be multiplied:");
        System.out.println("No negative values will be accepted:");
        System.out.println("A zero (0) will close the program.");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int variable, answer;
        variable =  1;
        while ( st.hasMoreTokens() )
        {
            int prod = Integer.parseInt(st.nextToken());
            if (prod != 0)
                {
                    if (prod > 0)
                        {
                        answer = variable * prod;
                        variable = answer;
                        System.out.println("Your number enterd is " + prod);
                        System.out.println("The current product of your input is: " + answer);
                        }
                    else 
                    {
                        System.out.println("You have entered a negative number, and that number will be disregarded: " + prod);
                    }
                }
            if (prod == 0) System.out.println("You have entered a Zero value, the program will terminate:");
        }              
    }
    
    public void FindTwelve()
    {
        System.out.println("I'm in Find Twelve");
    }
    
    public void MinMaxAvg ()
    {
        System.out.println("I'm in Min Max Avg");
    }
          
    public void LetterGrade()
    {
    int  input, sumA, sumB, sumC, sumD, sumF;
    sumA=sumB=sumC=sumD=sumF=0;
    Scanner sc = new Scanner(System.in);
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
