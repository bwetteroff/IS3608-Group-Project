package DevTestEnvironment;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wetteb
 */
public class MyGrader 
{
    public static void main(String args[])
    {
        int  input, sumA, sumB, sumC, sumD, sumF;
    sumA=sumB=sumC=sumD=sumF=0;
              
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Please enter a grade [-99 to quit]: ");
        input = sc.nextInt();
        System.out.println(input);
    //KbdInput kbd = new KbdInput();
    //input = kbd.readInt();

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
        System.out.println("The total number of B's is " + new Integer(sumB ));
        System.out.println("The total number of C's is " + new Integer(sumC ));
        System.out.println("The total number of D's is " + new Integer(sumD ));
        System.out.println("The total number of F's is " + new Integer(sumF ));
  
        }

}


