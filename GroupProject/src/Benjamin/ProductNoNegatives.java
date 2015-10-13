///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Benjamin;
//
//import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
//
///**
// *
// * @author wetteb
// */
public class ProductNoNegatives
{
    public void Product()
    {
        System.out.println("Please enter a series of numbers to be multiplied:");
        System.out.println("No negative values will be accepted:");
        System.out.println("A zero (0) will close the program.");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int variable, answer;
        variable =  1;
        while ( st.hasMoreTokens() )
        {
            int prod = Integer.parseInt(st.nextToken());
            if (prod != 0)
                {
                    if (prod > 0)
                        {
                        answer = variable * prod;
                        variable = answer;
                        System.out.println("Your number enterd is " + prod);
                        System.out.println("The current product of your input is: " + answer);
                        }
                    else 
                    {
                        System.out.println("You have entered a negative number, and that number will be disregarded: " + prod);
                    }
                }
            if (prod == 0) System.out.println("You have entered a Zero value, the program will terminate:");
        }              
    }
}      


//{
//    Scanner sc = new Scanner(System.in);
//    ProductNoNegatives P1 = new ProductNoNegatives();
//    
//    public static void main(String args[])
//    {
//        //int answer;
//        //answer = prod * input;
//        
//        System.out.println("Please enter the numbers to be multiplied,");
//        System.out.println("No negative values accepted, zero will close the program.");
//                       
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int prod;
//        while input 
//        do
//        {
//            
//                if (input > 0)
//                {
//                    int answer;
//                    answer = prod * input;
//                    System.out.println("prod" + prod);
//                    System.out.println("input" + input);
//                    System.out.println("answer" + answer);
//                    prod = answer;
//                    //input = 0;
//                }
//                else 
//                {
//                input = 0;
//                }
//        }
//        while (input >=0);
//        }
//    
//    
//}
////        
////        StringTokenizer st = new StringTokenizer(line);
////        int k = Integer.parseInt(st.nextToken());
////        int input;
//////float f = Float.parseFloat(st.nextToken());
////        //String s = st.nextToken();
////        
////        
////        while( st.hasMoreTokens() ) 
////        {
////            System.out.println("You entered " + k + st.nextToken());
////            
////        }
////
////        System.out.println( " Here's your data:" );
////        System.out.println( k );
////        //System.out.println( f );
////       // System.out.println( s );
//        
