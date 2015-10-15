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
public class Find12
{
    
    public static void main(String[] args)       
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
            //System.out.println("Current number is " + v);
            if (v == 12)
            {
                index = ++index;
                count = ++count;
                //System.out.println("index \t" + index + "\t" + "count \t" + count);
                last = index;
                if (count <= 1)
                {
                    first = index;
                }
            }
            else
            {
                index = ++index;
                count = count;
            }
        last = index;
        }
    System.out.println("The first occurance of 12 is at index " + first);
    if (count>=1) System.out.println("The last occurance of 12 is at index " + last);
    }
}


