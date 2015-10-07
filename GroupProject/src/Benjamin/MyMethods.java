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
    //StringTokenizer st = new StringTokenizer;
       
        
    public void ProductNoNegatives()
    {
        System.out.println("This is a test, press 0 to exit");
        int prod = sc.nextInt();
        int nextint = 1;
        int count = prod++;
        if (prod == 0)
        {
            System.exit(1);
        }
        while (prod != 0)
        {
            if (prod < 0)
            {
                //do nothing
            }
            else if (prod > 0)
            {
                System.out.println("Total = ");
            }
            System.out.println("prod test");
            System.exit(prod);
        }
    }
    
    public void FindTwelve()
    {
        System.out.println("FindTwelve");
    }
    
    public void MinMaxAvg ()
    {
        System.out.println("MinMaxAvg");
        String line = sc.nextLine();
        int input, max, min, sum, count;
        max = 0;
        min = 0;
        count = 0;
        sum = 0;
        
        
        input = sc.nextInt();
        if (max <= input)
        {
            max = input;
        }
        if (min >= input)
        {
            min = input;
        }
        count++;
        sum += input;
        float avg = (sum / count);
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
        System.out.println("Avg is " + avg);
        
        
        
//        st = new StringTokenizer(line);
 //       while (st.hasMoreTokens())
        {
 //           input = Integer.parseInt(st.nextToken());
            
        }
         Scanner sc = new Scanner(System.in);
        //String line = sc.nextLine();
        
//        StringTokenizer st = new StringTokenizer( line );
//        int k = Integer.parseInt( st.nextToken() );
//        float f = Float.parseFloat( st.nextToken());
//        String s = st.nextToken();
//
//       while( st.hasMoreTokens() ) {
//            s += " " + st.nextToken();
 //       }   
    
    
    
    
    
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
