/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

/**
 *
 * @author wetteb
 */

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wetteb
 */
public class ProdNoNeg
{
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    StringTokenizer st = new StringTokenizer(line);
    public static void main(String args[])
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
        while (quit != false)
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
                    
                }

            }
            
            {
                
                quit = true;
            }
        }
    }
}
    