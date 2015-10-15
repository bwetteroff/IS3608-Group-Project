/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;
/**
 *
 * @author wetteb
 */
public class NoGoodSwap
{
    public static void main(String args[])
    {
        int x = 100;
        int y = 200;
       
        NoGoodSwap ngs = new NoGoodSwap();

        System.out.println("before call to swap X is " + x);
        System.out.println("before call to swap Y is " + y);
        x = ngs.swap(x, y);
        System.out.println("X is now " + x);
        System.out.println("Y is now " + y);
        
        Student s1 = new Student();
        s1.ex1 = 55;
        s1.ex2 = 50;
        System.out.println("S1 ex1 is now " + s1.ex1);
        System.out.println("S1 ex2 is now " + s1.ex2);
        ngs.swap(s1);
        System.out.println("S1 ex1 is now " + s1.ex1);
        System.out.println("S1 ex2 is now " + s1.ex2);
        
        int[] myArray = {100, 200};
        System.out.println("index 0 is now " + myArray[0]);
        System.out.println("index 1 is now " + myArray[1]);
        ngs.swap(myArray);
        System.out.println("index 0 is now " + myArray[0]);
        System.out.println("index 1 is now " + myArray[1]);
       
        String st1 = new String("hello");
        String st2 = "world";
        ngs.StringSwap(st1, st2);
    }
    public int swap(int argx, int argy)
    {
        int temp = argx;
        argx = argy;
        argy = temp;
        return argx;
    }
    
        public void swap(Student argStu)
    {
        argStu.ex1 = 85;
        argStu.ex2 = 93;
    }
    public void swap(int[] SwapArray) 
    {
        int temp = SwapArray[0];
        SwapArray[0] = SwapArray[1];
        SwapArray[1] = temp;
    }
    public void StringSwap (String s1, String s2)
    {
        System.out.println(s1);
        System.out.println(s2); 
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1);
        System.out.println(s2);    
    }
}
