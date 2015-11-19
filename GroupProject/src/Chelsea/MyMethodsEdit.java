package Chelsea;

import java.util.Scanner;

/**
 *
 * @author BrodyCoats
 */
public class MyMethodsEdit
{
    Scanner sc = new Scanner(System.in);

    public void ProductNoNeg()
    {
        System.out.println("I will find the product");
        int product =sc.nextInt();
        int x = 0;
        if(product == 0)
            {
//    System..?  tagged this out, incomplete though, just throwing more errors into the file at this point, we can visit this tomorrow.
            }
        while(product != 0);
        {
            else //( product >0)  //This else statement is broken off from it's if statement, causing the error
                 // if without an else
            {
            }
        else if( product >0) //Also not connected to it's if statement, must be if (condition) {Action}; else if (condition) {Action}; else {action}
        product++; // expecting a semi colon;
        {
        System.out.println("The total is:");
        }
//      ???
        }
    }
    public void FindcTwelve()
    {
    System.out.println("i will find instances of 12:");

    }
    public void LetterGrade()
    {
        int input, sumA, sumB, sumC, sumD, sumF;
        sumA=sumB=sumC=sumD=sumF=0;

        System.out.println("please enter a grade, hit -1 to quit");
        input = sc.nextInt();
        System.out.println(input);
//        if(input==-1);
//            {
//                System.exit(1); //semi colon
//            }
        while(input != -1)
            {
                if (input>=90)
                    {
                    sumA++;
                    System.out.println("Its an A" + input);
                    }
                else if(input >= 70)
                    {
                     sumB++; // semi colon
                     System.out.println("Its a B" +input);
                    }
                else if(input >= 50)
                    {
                    sumC++;
                    System.out.println("Its a C" +input);
                    }
                else if(input >= 35)
                    {
                    sumD++; // should be sumD++;
                    System.out.println( "Its a D ):" + input);
                    }
                else
                    {
                    sumF++;// should be sumF++;
                    System.out.println("Failure" +input);
                    }
            input =sc.nextInt();
            System.out.println("Number of A's " + (sumA));       
            System.out.println("A's are from 90 - 100"); 
            System.out.println("Number of B's " + (sumB )); 
            System.out.println("B's are from 89 - 80"); 
            System.out.println("Number of C's is " + (sumC )); 
            System.out.println("C's are from 79 - 70"); 
            System.out.println("Number of D's is " + (sumD )); 
            System.out.println("D's are from 69 - 60"); 
            System.out.println("Number of F's is " + (sumF ));      
            System.out.println("F's are from 0 - 59"); 
        }
    }
}
