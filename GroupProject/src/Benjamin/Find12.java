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
    Scanner sc = new Scanner(System.in);
    String line = sc.next();
    StringTokenizer st = new StringTokenizer(line);
 //       public FindTwelve()
        {
        int sum = 1, count, index = 0;
        while (st.hasMoreTokens())
            {
                count = 1;
                index = index++;
                int v = Integer.parseInt(line);
                
                if (v != 12)
                {
                    System.out.println("You are in !12");
                    count = count++;
                    System.out.println("count is " + count);
                    System.out.println("sum is " + sum);
                    System.out.println("index is " + index);
                }
                else
                    System.out.println("You are in == 12");
                    count += count++;
                    sum = sum++;
                    System.out.println("count is " + count);
                    System.out.println("sum is " + sum);
                    System.out.println("index is " + index);
                    
            }
        }
    }

}


