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
    public static void ProductNoNegatives()
    {
        
    }
    
    public static void LetterGrade()
    {
        int input, sumA, sumB, sumC, sumD, sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	
        Scanner sc = new Scanner(System.in)
        input = sc.nextInt();

            if(input>=90)
            {
                sumA++;
                System.out.println(new Integer(input) + "      A");
	    }
            else if(input >= 70){
                sumB++;
                System.out.println(new Integer(input) + "      B");
            }
            else if(input >= 50){
                sumC++;
                System.out.println(new Integer(input) + "      C");
            }
            else if(input >= 35){
                sumD++;
                System.out.println(new Integer(input) + "      D");
            }
            else{
                sumF++;
                System.out.println(new Integer(input) + "      F");
            }

            input = kbd.readInt();
        }
        
        System.out.println("The total number of A's is " + new Integer(sumA ));
        System.out.println("The total number of B's is " + new Integer(sumB ));
        System.out.println("The total number of C's is " + new Integer(sumC ));
        System.out.println("The total number of D's is " + new Integer(sumD ));
        System.out.println("The total number of F's is " + new Integer(sumF ));
   } 
}

    }
}
