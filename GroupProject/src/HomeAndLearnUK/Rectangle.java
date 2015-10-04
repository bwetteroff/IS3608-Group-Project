/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeAndLearnUK;

import javax.swing.JOptionPane;

/**
 *
 * @author wetteb
 */
public class Rectangle
{
    public static void main(String args[])
    {
        String length;
        String width;
        length = JOptionPane.showInputDialog("Enter the length of your rectangle.");
        width = JOptionPane.showInputDialog("Enter the width of your rectangle.");
                
        int area = (Integer.parseInt(length) * Integer.parseInt(width));
        JOptionPane.showMessageDialog(null,"answer = " + area);   
    }
}
