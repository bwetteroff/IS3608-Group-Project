/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HomeAndLearnUK;

/**
 *
 * @author bpwc0b
 */
public class ArraysTest1 
{
    public static void main(String[] args)
    {
        int[] lottery_numbers = new int[49];
        int i;
        for (i=0; i < lottery_numbers.length; i++)
        {
            lottery_numbers[i] = i + 1;
            System.out.println( lottery_numbers[i]);
        }
    }
}
