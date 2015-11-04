/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DevTestEnvironment;

/**
 *
 * @author bpwc0b
 */

//Arrays are passed by reference, not by value. 
//This means that the array defined in one function can be modified by another 

//Example:

/********************************************************** 
   File: Array2.java
   This program  demonstrates that arrays are
   passed by reference 
**********************************************************/
public class Array2 {
    public static void main( String[] args) 
    {
        Array2 a2 = new Array2();
        int[] scores = {5, 5, 12, 17, 11};

        System.out.println( "Before the function call...");
        for (int i=0; i<scores.length; i++)
        {
        System.out.println( "scores[" + i + "] = " + scores[i] );
        }
        a2.changeVals( scores );
        System.out.println( "After the function call...");
        for (int i=0; i<scores.length; i++)
        {
        System.out.println( "scores[" + i + "] = " + scores[i] );
        }
    }
    void changeVals( int[] numbers ) 
    {
        for(int i=0; i<numbers.length; i++) 
        {
        numbers[i] += 10;
        }
    }
}
