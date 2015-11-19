/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HomeAndLearnUK;

import java.util.Arrays;

/**
 *
 * @author bpwc0b
 */
public class ArraysTest 
{
    public static void main(String[] args)
    {
        int[] aryNums;
        aryNums = new int[6];
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;
        
        Arrays.sort(aryNums);
        
        int i;
        for (i=0; i < aryNums.length; i++)
        {
            System.out.println("num:" + aryNums[i]);
        }
    System.out.println(aryNums[5] );
    }
}
