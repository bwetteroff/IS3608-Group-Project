//Enter file contents herepackage what.izthis.sheet;

package Chelsea;


import java.io.IOException;
import java.util.Scanner;
//import java.util.StringTokenizer;

/**
 *
 * @author cacb88
 */
public class FindTwelve 
{
     public static void main(String[] args) throws IOException 
     {
        Scanner sc = new Scanner(System.in);
       int input, sumx, sumy;
       sumx = sumy =  0;
       System.out.println("Enter some numbers, -1 lets you quit");
       System.out.println();
       input = sc.nextInt();
       System.out.println(input);
       if(input == -1)
       {
            System.exit(1);
            
       }
       while( input != -1)
       {
           if(input == 12)
           {
               sumx++;
               System.out.println("Theres a twelve ");
           }
           else  if( input != 12)
           {
               sumy++;
               System.out.println("0");
           }
           input = sc.nextInt();
           System.out.println("Number of twelves \t" + (sumx));
           System.out.println("Number of non-twelves \t" +(sumy));
           }
     }
}
