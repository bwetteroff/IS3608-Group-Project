/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeAndLearnUK;

/**
 *
 * @author wetteb
 */
import java.util.Arrays;
import java.util.Collections;

public class SortDescending
{
	public static void main(String [] args)
	{
		int [] aryNums;
		
		aryNums = new int[6];
		
		aryNums[0] = 10;
		aryNums[1] = 14;
		aryNums[2] = 36;
		aryNums[3] = 27;
		aryNums[4] = 43;
		aryNums[5] = 18;
		
		Integer[] integerArray = new Integer[aryNums.length];
		
		for (int i = 0; i < aryNums.length; i++) 
		{
			integerArray[i] = new Integer(aryNums[i]);
		}
		
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		for (int i = 0; i < aryNums.length; i++) 
		{
			System.out.println("Num: " + integerArray[i]);
		}
	}
}