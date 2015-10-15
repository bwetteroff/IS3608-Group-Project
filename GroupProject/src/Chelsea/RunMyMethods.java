//Enter file contents herepackage first.assign1;
package Chelsea;
import java.util.Scanner;

/**
 *
 * @author cacb88
 */
public class RunMyMethods 
{
    public static void main(String args[]){
        MyMethodsEdit me = new MyMethodsEdit();
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    int menulist;
    do{
    System.out.println("My Methods menu list:");
    System.out.println("1.Product no negatives:");
    System.out.println("2.Find Twelve:");
    System.out.println("3.Min, Max, and Average:");
    System.out.println("4.Letter grade:");
    System.out.println("5.Exit");
    menulist = sc.nextInt();
    switch (menulist){

    case 1:
    System.out.println("Product no negatives:");
    break ;
    case 2:
    System.out.println("Find Twelve:");
    break;
    case 3:
    System.out.println("Min, Max, and Average:");
    break;
    case 4:
    System.out.println("Letter grade:");
        me.LetterGrade();
    break;
    case 5:
     exit = true;
        break;
    default: 
        System.out.println("!!");
    }
    }
    while (!exit);
    System.out.println("Exit");
    }
}
