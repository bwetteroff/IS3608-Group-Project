//listing 1
// A minimal AWT-based applet. 
import java.awt.*; 
import java.applet.*; 
 
public class SimpleApplet extends Applet { 
  public void paint(Graphics g) { 
    g.drawString("Java makes applets easy.", 20, 20); 
  } 
}

//listing 2
import java.awt.*; 
import java.applet.*; 
/* 
<applet code="SimpleApplet" width=200 height=60> 
</applet> 
*/ 
 
public class SimpleApplet extends Applet { 
  public void paint(Graphics g) { 
    g.drawString("Java makes applets easy.", 20, 20); 
  } 
}

//listing 3
// An AWT-based Applet skeleton. 
import java.awt.*; 
import java.applet.*; 
/* 
<applet code="AppletSkel" width=300 height=100> 
</applet> 
*/ 
 
public class AppletSkel extends Applet { 
  // Called first. 
  public void init() { 
    // initialization 
  } 
 
  /* Called second, after init().  Also called whenever 
     the applet is restarted. */ 
  public void start() { 
    // start or resume execution 
  } 
 
  // Called when the applet is stopped. 
  public void stop() { 
    // suspends execution 
  } 
 
  /* Called when applet is terminated.  This is the last 
     method executed. */ 
  public void destroy() { 
    // perform shutdown activities 
  } 
 
  // Called when an AWT-based applet's window must be restored. 
  public void paint(Graphics g) { 
    // redisplay contents of window 
  } 
}

//listing 4
/*  
   Try This 14-1 
 
   A simple banner applet. 
 
   This applet creates a thread that scrolls 
   the message contained in msg right to left 
   across the applet's window. 
*/ 
import java.awt.*; 
import java.applet.*; 
/* 
<applet code="Banner" width=300 height=50> 
</applet> 
*/ 
 
public class Banner extends Applet implements Runnable { 
  String msg = " Java Rules the Web "; 
  Thread t; 
  boolean stopFlag; 
 
  // Initialize t to null.  
  public void init() { 
    t = null; 
  } 
 
  // Start thread 
  public void start() { 
    t = new Thread(this); 
    stopFlag = false; 
    t.start(); 
  } 
 
  // Entry point for the thread that runs the banner. 
  public void run() { 
 
    // Display banner  
    for( ; ; ) { 
      try { 
        repaint(); 
        Thread.sleep(250); 
        if(stopFlag)
          break; 
      } catch(InterruptedException exc) {} 
    } 
  } 
 
  // Pause the banner. 
  public void stop() { 
    stopFlag = true; 
    t = null; 
  } 
 
  // Display the banner. 
  public void paint(Graphics g) { 
    char ch; 

    ch = msg.charAt(0); 
    msg = msg.substring(1, msg.length()); 
    msg += ch; 
    g.drawString(msg, 50, 30); 
  } 
}

//listing 5
// Using the Status Window. 
import java.awt.*; 
import java.applet.*; 
/* 
<applet code="StatusWindow" width=300 height=50> 
</applet> 
*/ 
 
public class StatusWindow extends Applet{ 
  // Display msg in applet window. 
  public void paint(Graphics g) { 
    g.drawString("This is in the applet window.", 10, 20); 
    showStatus("This is shown in the status window."); 
  } 
}

//listing 6
// Pass a parameter to an applet. 
import java.awt.*; 
import java.applet.*; 
 
/* 
<applet code="Param" width=300 height=80> 
<param name=author value="Herb Schildt"> 
<param name=purpose value="Demonstrate Parameters"> 
<param name=version value=2> 
</applet> 
*/ 
 
public class Param extends Applet { 
  String author; 
  String purpose; 
  int ver; 
 
  public void start() { 
    String temp; 
 
    author = getParameter("author"); 
    if(author == null) author = "not found"; 
 
    purpose = getParameter("purpose"); 
    if(purpose == null) purpose = "not found"; 
 
    temp = getParameter("version"); 
    try { 
      if(temp != null) 
        ver = Integer.parseInt(temp); 
      else 
        ver = 0; 
    } catch(NumberFormatException exc) { 
        ver = -1; // error code 
    } 
  } 
 
  public void paint(Graphics g) { 
    g.drawString("Purpose: " + purpose, 10, 20); 
    g.drawString("By: " + author, 10, 40); 
    g.drawString("Version: " + ver, 10, 60); 
  } 
}

//listing 7
// Demonstrate the mouse event handlers. 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
/* 
  <applet code="MouseEvents" width=300 height=100> 
  </applet> 
*/ 
 
public class MouseEvents extends Applet 
  implements MouseListener, MouseMotionListener { 
 
  String msg = ""; 
  int mouseX = 0, mouseY = 0; // coordinates of mouse 
 
  public void init() { 
     addMouseListener(this); 
     addMouseMotionListener(this); 
  } 
 
  // Handle mouse clicked. 
  public void mouseClicked(MouseEvent me) { 
    mouseX = 0; 
    mouseY = 10; 
    msg = "Mouse clicked."; 
    repaint(); 
  } 
 
  // Handle mouse entered. 
  public void mouseEntered(MouseEvent me) { 
    mouseX = 0; 
    mouseY = 10; 
    msg = "Mouse entered."; 
    repaint(); 
  } 
 
  // Handle mouse exited. 
  public void mouseExited(MouseEvent me) { 
    mouseX = 0; 
    mouseY = 10; 
    msg = "Mouse exited."; 
    repaint(); 
  } 
 
  // Handle button pressed. 
  public void mousePressed(MouseEvent me) { 
    // save coordinates 
    mouseX = me.getX(); 
    mouseY = me.getY(); 
    msg = "Down"; 
    repaint(); 
  } 
 
  // Handle button released. 
  public void mouseReleased(MouseEvent me) { 
    // save coordinates 
    mouseX = me.getX(); 
    mouseY = me.getY(); 
    msg = "Up"; 
    repaint(); 
  } 
 
  // Handle mouse dragged. 
  public void mouseDragged(MouseEvent me) { 
    // save coordinates 
    mouseX = me.getX(); 
    mouseY = me.getY(); 
    msg = "*"; 
    showStatus("Dragging mouse at " + mouseX + ", " + mouseY); 
    repaint(); 
  } 
 
  // Handle mouse moved. 
  public void mouseMoved(MouseEvent me) { 
    // show status 
    showStatus("Moving mouse at " + me.getX() + ", " + me.getY()); 
  } 
 
  // Display msg in applet window at current X,Y location. 
  public void paint(Graphics g) { 
    g.drawString(msg, mouseX, mouseY); 
  } 
}

