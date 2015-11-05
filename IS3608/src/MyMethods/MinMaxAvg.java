/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMethods;

import java.util.*;

/**
 *
 * @author wetteb
 */
public class MinMaxAvg
{
    public static void main(String args[])
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
                num = ++num;
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
            //System.out.println("sum \t " + sum);
            System.out.println("min \t" + min);
            System.out.println("max \t" + max);
            //System.out.println("count \t" + num);
            System.out.println("avg \t" + avg);
            
        
    }
}
