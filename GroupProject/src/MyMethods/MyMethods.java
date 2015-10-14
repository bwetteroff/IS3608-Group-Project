/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMethods;


import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wetteb
 */
public class MyMethods
{
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    StringTokenizer st = new StringTokenizer(line);
    public void ProductNoNegatives()
    {
        System.out.println("Please enter a series of numbers to be multiplied:");
        System.out.println("No negative values will be accepted:");
        System.out.println("A zero (0) will close the program.");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int variable, answer, prod = 1;
        variable =  1;
        System.out.println("Number Entered \t" + "Product of input:");
        boolean quit = false;
        do
        {
            while ( st.hasMoreTokens() )
            {
                prod = Integer.parseInt(st.nextToken());
                if (prod != 0)
                    {
                        if (prod > 0)
                            {
                            answer = variable * prod;
                            variable = answer;
                            System.out.println(prod + "\t \t" + answer);
                            }
                        else 
                            {
                                System.out.println(prod + " will be disregarded: ");
                            }
                    }
                if (prod == 0) 
                {
                    System.out.println("You have entered a Zero value, the program will terminate:");
                    quit = true;
                }
            }
            int token = st.countTokens();
            if (token == 0)
            {
                ProductNoNegatives();
            }
        }  
        while (!quit);
        System.out.println("Return to Menu");
    }
    
    public void FindTwelve()
    {
    System.out.println("Please enter your data set:");
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    StringTokenizer st = new StringTokenizer(line);
    int count, index, first = 0, last = 0;
    index =  0;
    count = 0;
    while ( st.hasMoreTokens() )
        {
            int v = Integer.parseInt(st.nextToken());
            if (v == 12)
            {
                index = ++index;
                count = ++count;
                last = index;
                if (count <= 1)
                {
                    first = index;
                }   
            }
            else
            {
                index = ++index;
            }
        }
    System.out.println("The first occurance of 12 is at index " + first);
    if (count>=1) System.out.println("The last occurance of 12 is at index " + last);
    }
    
    public void MinMaxAvg ()
    {
        System.out.println("Please enter your data set:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int num = 0;
        double min = 0, max = 0, avg = 0, sum = 0;
        while (st.hasMoreTokens())
        {
            int input = Integer.parseInt(st.nextToken());
                if (num == 0)
                {
                    min = input;
                    max = input;
                }
                num++;
                if (min > input)
                    {
                        min = input;
                    }
                if (max < input)
                    {
                        max = input;
                    }
            sum += input;
            avg = (sum/num);   
        }
            System.out.println("min \t" + min);
            System.out.println("max \t" + max);
            System.out.println("avg \t" + avg);   
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
            System.out.println("Please enter another grade [-99 to quit]: ");
            input = sc.nextInt();
        }
        System.out.println("A's are from 90 - 100 \t" + "Total \t" + (sumA));
        System.out.println("B's are from 70 - 89 \t" + "Total \t" + (sumB ));
        System.out.println("C's are from 50 - 69 \t" + "Total \t" + (sumC ));
        System.out.println("D's are from 35 - 49 \t" + "Total \t" + (sumD ));
        System.out.println("F's are from 0 - 34 \t" + "Total \t" + (sumF ));
    }
} 
