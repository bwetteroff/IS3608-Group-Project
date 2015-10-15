/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

import java.util.Scanner;

public class MenuPrograms
{
public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      // print menu
      for (int i = 1; i <= 5; i++)
            System.out.println(i + ". Menu item #" + i);
      System.out.println("0. Quit");
      // handle user commands
      boolean quit = false;
      int menuItem;
      do 
      {
        System.out.print("Choose menu item: ");
        menuItem = in.nextInt();
        switch (menuItem) {
        case 1:
              System.out.println("You've chosen item #1");
              // do something...
              break;
        case 2:
              System.out.println("You've chosen item #2");
              // do something...
              break;
        case 3:
              System.out.println("You've chosen item #3");
              // do something...
              break;
        case 4:
              System.out.println("You've chosen item #4");
              // do something...
              break;
        case 5:
              System.out.println("You've chosen item #5");
              // do something...
              break;
        case 0:
              quit = true;
              break;
        default:
              System.out.println("Invalid menu choice, please select again.");
        }
      } 
      while (!quit);
      System.out.println("Exit");
    }
}
