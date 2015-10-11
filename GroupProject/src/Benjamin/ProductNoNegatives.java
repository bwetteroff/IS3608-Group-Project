/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Benjamin;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wetteb
 */
public class ProductNoNegatives
{
    Scanner sc = new Scanner(System.in);
    
    public static void main(String args[])
    {
        
        System.out.println("Please enter the numbers to be multiplied,");
        System.out.println("No negative values accepted, zero will close the program.");
                       
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(line);
        int k = Integer.parseInt(st.nextToken());
        //float f = Float.parseFloat(st.nextToken());
        String s = st.nextToken();
        while( st.hasMoreTokens() ) 
        {
            s += " " + st.nextToken();
        }

        System.out.println( " Here's your data:" );
        System.out.println( k );
        //System.out.println( f );
        System.out.println( s );
    }
}