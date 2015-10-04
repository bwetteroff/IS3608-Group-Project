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
    public void ProductNoNegatives()
    {
        
    }
    
    public void LetterGrade()
    {
        int input, sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

            if(input>=90)
            {
                sumA++;
                System.out.println(input + "      A");
	    }
            else if(input >= 70){
                sumB++;
                System.out.println(input + "      B");
            }
            else if(input >= 50){
                sumC++;
                System.out.println(input + "      C");
            }
            else if(input >= 35){
                sumD++;
                System.out.println(input + "      D");
            }
            else{
                sumF++;
                System.out.println(input + "      F");
            }
        
        System.out.println("The total number of A's is " + (sumA ));
        System.out.println("The total number of A's is " + (sumA));
        System.out.println("The total number of B's is " + (sumB ));
        System.out.println("The total number of C's is " + (sumC ));
        System.out.println("The total number of D's is " + (sumD ));
        System.out.println("The total number of F's is " + (sumF ));
    }
} 
