//listing 1
/*
     Try This 15-1

     A Swing-based file comparison utility.

     This version has a check box that causes the
     location of the first mismatch to be shown.

     Requires JDK 7 or later.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class SwingFC implements ActionListener {

  JTextField jtfFirst;  // holds the first file name
  JTextField jtfSecond; // holds the second file name

  JButton jbtnComp; // button to compare the files

  JLabel jlabFirst, jlabSecond; // displays prompts
  JLabel jlabResult; // displays results and error messages

  JCheckBox jcbLoc; // check to display location of mismatch

  SwingFC() {

    // Create a new JFrame container.
    JFrame jfrm = new JFrame("Compare Files");

    // Specify FlowLayout for the layout manager.
    jfrm.setLayout(new FlowLayout());

    // Give the frame an initial size.
    jfrm.setSize(200, 220);

    // Terminate the program when the user closes the application.
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create the text fields for the file names..
    jtfFirst = new JTextField(14);
    jtfSecond = new JTextField(14);

    // Set the action commands for the text fields.
    jtfFirst.setActionCommand("fileA");
    jtfSecond.setActionCommand("fileB");

    // Create the Compare button.
    JButton jbtnComp = new JButton("Compare");

    // Add action listener for the Compare button.
    jbtnComp.addActionListener(this);

    // Create the labels.
    jlabFirst = new JLabel("First file: ");
    jlabSecond = new JLabel("Second file: ");
    jlabResult = new JLabel("");

    // Create check box.
    jcbLoc = new JCheckBox("Show position of mismatch");

    // Add the components to the content pane.
    jfrm.add(jlabFirst);
    jfrm.add(jtfFirst);
    jfrm.add(jlabSecond);
    jfrm.add(jtfSecond);
    jfrm.add(jcbLoc);
    jfrm.add(jbtnComp);
    jfrm.add(jlabResult);

    // Display the frame.
    jfrm.setVisible(true);
  }

  // Compare the files when the Compare button is pressed.
  public void actionPerformed(ActionEvent ae) {
    int i=0, j=0;
    int count = 0;

    // First, confirm that both file names have
    // been entered.
    if(jtfFirst.getText().equals("")) {
      jlabResult.setText("First file name missing.");
      return;
    }
    if(jtfSecond.getText().equals("")) {
      jlabResult.setText("Second file name missing.");
      return;
    }

    // Compare files. Use try-with-resources to manage the files.
    try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
         FileInputStream f2 = new FileInputStream(jtfSecond.getText()))
    {
      // Check the contents of each file.
      do {
        i = f1.read();
        j = f2.read();
        if(i != j) break;
        count++;
      } while(i != -1 && j != -1);

      if(i != j) {
        if(jcbLoc.isSelected())
          jlabResult.setText("Files differ at location " + count);
        else
          jlabResult.setText("Files are not the same.");
      }
      else
        jlabResult.setText("Files compare equal.");

    } catch(IOException exc) {
      jlabResult.setText("File Error");
    }
  }

  public static void main(String args[]) {
    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new SwingFC();
      }
    });
  }
}

//listing 2
// Demonstrate multiple selectin in a JList. 
// This program requires JDK 7 or later.
  
import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 
   
class ListDemo implements ListSelectionListener {  
  
  JList<String> jlst; 
  JLabel jlab; 
  JScrollPane jscrlp; 
 
  // Create an array of names. 
  String names[] = { "Sherry", "Jon", "Rachel",  
                     "Sasha", "Josselyn",  "Randy", 
                     "Tom", "Mary", "Ken", 
                     "Andrew", "Matt", "Todd" }; 
 
  ListDemo() {  
    // Create a new JFrame container.  
    JFrame jfrm = new JFrame("JList Demo");  
 
    // Specify a flow Layout. 
    jfrm.setLayout(new FlowLayout());  
 
    // Give the frame an initial size.  
    jfrm.setSize(200, 160);  
  
    // Terminate the program when the user closes the application.  
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
    // Create a JList. 
    jlst = new JList<String>(names); 
 
    // By removing the following line, multiple selection (which 
    // is the the default behavior of a JList) will be used. 
//    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
 
    // Add list to a scroll pane. 
    jscrlp = new JScrollPane(jlst); 
 
    // Set the preferred size of the scroll pane. 
    jscrlp.setPreferredSize(new Dimension(120, 90)); 
 
    // Make a label that displays the selection. 
    jlab = new JLabel("Please choose a name"); 
 
    // Add list selection handler. 
    jlst.addListSelectionListener(this); 
 
    // Add the list and label to the content pane. 
    jfrm.add(jscrlp); 
    jfrm.add(jlab); 
  
    // Display the frame.  
    jfrm.setVisible(true);  
  }  
 
  // Handle list selection events. 
  public void valueChanged(ListSelectionEvent le) {  
    // Get the indices of the changed item. 
    int indices[] = jlst.getSelectedIndices(); 
 
    // Display the selections, if one or more items 
    // was selected. 
    if(indices.length != 0) { 
      String who = ""; 
 
      // Construct a string of the names. 
      for(int i : indices) 
        who += names[i] + " "; 
         
      jlab.setText("Current selections: " + who); 
    } 
    else // Othewise, reprompt. 
      jlab.setText("Please choose an name"); 
  }  
 
  public static void main(String args[]) {  
    // Create the frame on the event dispatching thread.  
    SwingUtilities.invokeLater(new Runnable() {  
      public void run() {  
        new ListDemo();  
      }  
    });   
  }  
}

