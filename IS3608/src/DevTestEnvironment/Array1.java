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
/*****************************************************************
   File: Array1.java
   An example of an array being passed to a function
   This program stores integers in an array
   and computes their average
*****************************************************************/
public class Array1 {
    public static void main(String[] args) 
    {
        Array1 a1 = new Array1();
        int[] scores = {5, 5, 12, 17, 11};
        float avg = a1.averData(scores, scores.length);
        System.out.println("Average score: " + avg ); 
    }

    float averData(int[]  numbers, int size) 
    {
        int i, sum;
        for(i=0, sum=0; i<size; i++) 
        {
        System.out.println( "score " + i+1 + " = " + numbers[i] );
        sum += numbers[i];
        }

        return ( (float) sum / i );
    }
}

