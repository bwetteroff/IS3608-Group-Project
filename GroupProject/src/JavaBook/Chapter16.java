//listing 1
// A simple Swing program. 
 
import JavaBookAnswers.SwingFC;
import JavaBookAnswers.ListDemo;
import javax.swing.*; 
  
class SwingDemo { 
 
  SwingDemo() { 
 
    // Create a new JFrame container. 
    JFrame jfrm = new JFrame("A Simple Swing Application"); 
 
    // Give the frame an initial size. 
    jfrm.setSize(275, 100); 
 
    // Terminate the program when the user closes the application. 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
    // Create a text-based label. 
    JLabel jlab = new JLabel(" Swing defines the modern Java GUI."); 
 
    // Add the label to the content pane. 
    jfrm.add(jlab); 
 
    // Display the frame. 
    jfrm.setVisible(true); 
  } 
 
  public static void main(String args[]) { 
    // Create the frame on the event dispatching thread. 
    SwingUtilities.invokeLater(new Runnable() { 
      public void run() { 
        new SwingDemo(); 
      } 
    }); 
  } 
}
    
//listing 2
// Demonstrate a push button and handle action events. 
 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class ButtonDemo implements ActionListener { 
 
  JLabel jlab;  
 
  ButtonDemo() { 
 
    // Create a new JFrame container. 
    JFrame jfrm = new JFrame("A Button Example"); 
 
    // Specify FlowLayout for the layout manager. 
    jfrm.setLayout(new FlowLayout()); 
 
    // Give the frame an initial size. 
    jfrm.setSize(220, 90); 
 
    // Terminate the program when the user closes the application. 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
    // Make two buttons. 
    JButton jbtnUp = new JButton("Up"); 
    JButton jbtnDown = new JButton("Down"); 
 
    // Add action listeners. 
    jbtnUp.addActionListener(this); 
    jbtnDown.addActionListener(this); 
 
    // Add the buttons to the content pane. 
    jfrm.add(jbtnUp);  
    jfrm.add(jbtnDown);  
 
    // Create a label. 
    jlab = new JLabel("Press a button."); 
 
    // Add the label to the frame. 
    jfrm.add(jlab); 
 
    // Display the frame. 
    jfrm.setVisible(true); 
  } 
 
  // Handle button events. 
  public void actionPerformed(ActionEvent ae) { 
    if(ae.getActionCommand().equals("Up"))  
      jlab.setText("You pressed Up."); 
    else 
      jlab.setText("You pressed down. "); 
  } 
 
  public static void main(String args[]) { 
    // Create the frame on the event dispatching thread. 
    SwingUtilities.invokeLater(new Runnable() { 
      public void run() { 
        new ButtonDemo(); 
      } 
    }); 
  } 
}

//listing 3
// Use a text field. 
 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class TFDemo implements ActionListener { 
 
  JTextField jtf; 
  JButton jbtnRev; 
  JLabel jlabPrompt, jlabContents;  
 
  TFDemo() { 
 
    // Create a new JFrame container. 
    JFrame jfrm = new JFrame("Use a Text Field"); 
 
    // Specify FlowLayout for the layout manager. 
    jfrm.setLayout(new FlowLayout()); 
 
    // Give the frame an initial size. 
    jfrm.setSize(240, 120); 
 
    // Terminate the program when the user closes the application. 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
    // Create a text field. 
    jtf = new JTextField(10); 
 
    // Set the action commands for the text field. 
    jtf.setActionCommand("myTF"); 
 
    // Create the Reverse button. 
    JButton jbtnRev = new JButton("Reverse"); 
 
    // Add action listeners. 
    jtf.addActionListener(this); 
    jbtnRev.addActionListener(this); 
 
    // Create the labels. 
    jlabPrompt = new JLabel("Enter text: "); 
    jlabContents = new JLabel(""); 
 
    // Add the components to the content pane. 
    jfrm.add(jlabPrompt); 
    jfrm.add(jtf);  
    jfrm.add(jbtnRev);  
    jfrm.add(jlabContents); 
 
    // Display the frame. 
    jfrm.setVisible(true); 
  } 
 
  // Handle action events. 
  public void actionPerformed(ActionEvent ae) { 
   
    if(ae.getActionCommand().equals("Reverse")) { 
      // The Reverse button was pressed.  
      String orgStr = jtf.getText(); 
      String resStr = ""; 
 
      // Reverse the string in the text field. 
      for(int i=orgStr.length()-1; i >=0; i--) 
        resStr += orgStr.charAt(i); 
 
      // Store the reversed string in the text field. 
      jtf.setText(resStr);  
    } else 
      // Enter was pressed while focus was in the  
      // text field. 
      jlabContents.setText("You pressed ENTER. Text is: " + 
                           jtf.getText()); 
  } 
 
  public static void main(String args[]) { 
    // Create the frame on the event dispatching thread. 
    SwingUtilities.invokeLater(new Runnable() { 
      public void run() { 
        new TFDemo(); 
      } 
    }); 
  } 
}

//listing 4
// Demonstrate check boxes. 
  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
   
class CBDemo implements ItemListener {  
  
  JLabel jlabSelected; 
  JLabel jlabChanged; 
  JCheckBox jcbAlpha; 
  JCheckBox jcbBeta; 
  JCheckBox jcbGamma; 
  
  CBDemo() {  
    // Create a new JFrame container.  
    JFrame jfrm = new JFrame("Demonstrate Check Boxes");  
  
    // Specify FlowLayout for the layout manager. 
    jfrm.setLayout(new FlowLayout()); 
  
    // Give the frame an initial size.  
    jfrm.setSize(280, 120);  
  
    // Terminate the program when the user closes the application.  
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
    // Create empty labels. 
    jlabSelected = new JLabel(""); 
    jlabChanged = new JLabel("");  
  
    // Make check boxes. 
    jcbAlpha = new JCheckBox("Alpha");  
    jcbBeta = new JCheckBox("Beta");  
    jcbGamma = new JCheckBox("Gamma");  
 
    // Events generated by the check boxes 
    // are handled in common by the itemStateChanged() 
    // method implemented by CBDemo. 
    jcbAlpha.addItemListener(this); 
    jcbBeta.addItemListener(this); 
    jcbGamma.addItemListener(this); 
  
    // Add checkboxes and labels to the content pane.  
    jfrm.add(jcbAlpha);   
    jfrm.add(jcbBeta);   
    jfrm.add(jcbGamma);   
    jfrm.add(jlabChanged);  
    jfrm.add(jlabSelected);  
  
    // Display the frame.  
    jfrm.setVisible(true);  
  }  
 
  // This is the handler for the check boxes.   
  public void itemStateChanged(ItemEvent ie) { 
    String str = ""; 
 
    // Obtain a reference to the check box that 
    // caused the event. 
    JCheckBox cb = (JCheckBox) ie.getItem(); 
 
    // Report what check box changed. 
    if(cb.isSelected())  
      jlabChanged.setText(cb.getText() + " was just selected."); 
    else 
      jlabChanged.setText(cb.getText() + " was just cleared."); 
 
    // Report all selected boxes. 
    if(jcbAlpha.isSelected()) { 
      str += "Alpha "; 
    }  
    if(jcbBeta.isSelected()) { 
      str += "Beta "; 
    } 
    if(jcbGamma.isSelected()) { 
      str += "Gamma"; 
    } 
 
    jlabSelected.setText("Selected check boxes: " + str); 
  } 
 
  public static void main(String args[]) {  
    // Create the frame on the event dispatching thread.  
    SwingUtilities.invokeLater(new Runnable() {  
      public void run() {  
        new CBDemo();  
      }  
    });  
  }  
}

//listing 5
// Demonstrate a simple JList. 
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
 
    // Set the list selection mode to single-selection. 
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
 
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
    // Get the index of the changed item. 
    int idx = jlst.getSelectedIndex(); 
 
    // Display selection, if item was selected. 
    if(idx != -1) 
      jlab.setText("Current selection: " + names[idx]); 
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

//listing 6
/*
     Try This 16-1

     A Swing-based file comparison utility.

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

  SwingFC() {

    // Create a new JFrame container.
    JFrame jfrm = new JFrame("Compare Files");

    // Specify FlowLayout for the layout manager.
    jfrm.setLayout(new FlowLayout());

    // Give the frame an initial size.
    jfrm.setSize(200, 190);

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

    // Add the components to the content pane.
    jfrm.add(jlabFirst);
    jfrm.add(jtfFirst);
    jfrm.add(jlabSecond);
    jfrm.add(jtfSecond);
    jfrm.add(jbtnComp);
    jfrm.add(jlabResult);

    // Display the frame.
    jfrm.setVisible(true);
  }

  // Compare the files when the Compare button is pressed.
  public void actionPerformed(ActionEvent ae) {
    int i=0, j=0;

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
      } while(i != -1 && j != -1);

      if(i != j)
        jlabResult.setText("Files are not the same.");
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

//listing 7
// A simple Swing-based applet

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
This HTML can be used to launch the applet:

<applet code="MySwingApplet" width=200 height=80>
</applet>
*/

public class MySwingApplet extends JApplet {
  JButton jbtnUp;
  JButton jbtnDown;

  JLabel jlab;

  // Initialize the applet.
  public void init() {
    try {
      SwingUtilities.invokeAndWait(new Runnable () {
        public void run() {
          makeGUI(); // initialize the GUI
        }
      });
    } catch(Exception exc) {
      System.out.println("Can't create because of "+ exc);
    }
  }

  // This applet does not need to override start(), stop(),
  // or destroy(). 

  // Setup and initialize the GUI. 
  private void makeGUI() {
    // Set the applet to use flow layout.
    setLayout(new FlowLayout());

    // Make two buttons.
    jbtnUp = new JButton("Up");
    jbtnDown = new JButton("Down");

    // Add action listener for Up button..
    jbtnUp.addActionListener(new ActionListener() {     
      public void actionPerformed(ActionEvent ae) { 
        jlab.setText("You pressed Up."); 
      }
    });

    // Add action listener for Down button.
    jbtnDown.addActionListener(new ActionListener() {     
      public void actionPerformed(ActionEvent ae) { 
        jlab.setText("You pressed down."); 
      }     
    });     

    // Add the buttons to the content pane.
    add(jbtnUp);
    add(jbtnDown);

    // Create a text-based label.
    jlab = new JLabel("Press a button.");

    // Add the label to the content pane.
    add(jlab);    
  }
}
