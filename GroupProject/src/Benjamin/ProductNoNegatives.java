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
    public static void main(String[] args)
    {
        System.out.println("Please enter the numbers to be multiplied,");
        System.out.println("No negative values accepted, zero will close the program.");
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        StringTokenizer st = new StringTokenizer(sc.next());
        int prod = Integer.parseInt(st.nextToken());
        if (st.hasMoreTokens())
            {
            System.out.println(prod);
            
            if (prod > 0)
            {
            System.out.println(prod);
            int answer;
            answer = prod * Integer.parseInt(st.nextToken());
            System.out.println("Your current product is " + prod);
                }
            }              
        else 
        {
            
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
