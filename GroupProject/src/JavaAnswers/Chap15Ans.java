//listing 1
/* A simple banner applet that uses parameters.

*/
import java.awt.*;
import java.applet.*;
/*
<applet code="ParamBanner" width=300 height=50>
<param name=message value=" I like Java! ">
<param name=delay value=500>
</applet>
*/

public class ParamBanner extends Applet implements Runnable {
  String msg;
  int delay;
  Thread t;
  boolean stopFlag;

  // Initialize t to null.
  public void init() {
    String temp;

    msg = getParameter("message");
    if(msg == null) msg = " Java Rules the Web ";

    temp = getParameter("delay");

    try {
      if(temp != null)
        delay = Integer.parseInt(temp);
      else
        delay = 250; // default if not specified
    } catch(NumberFormatException exc) {
        delay = 250 ; // default on error
    }

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
        Thread.sleep(delay);
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

//listing 2
// A simple clock applet.

import java.util.*;
import java.awt.*;
import java.applet.*;
/*
<object code="Clock" width=200 height=50>
</object>
*/

public class Clock extends Applet implements Runnable {
  String msg;
  Thread t;
  Calendar clock;

  boolean stopFlag;

  // Initialize
  public void init() {
    t = null;
    msg = "";
  }

  // Start thread
  public void start() {
    t = new Thread(this);
    stopFlag = false;
    t.start();
  }

  // Entry point for the clock.
  public void run() {
    // Display clock
    for( ; ; ) {
      try {
        repaint();
        Thread.sleep(1000);
        if(stopFlag)
            break;
      } catch(InterruptedException exc) {}
    }
  }

  // Pause the clock.
  public void stop() {
    stopFlag = true;
    t = null;
  }

  // Display the clock.
  public void paint(Graphics g) {
    clock = Calendar.getInstance();

    msg = "Current time is " +
          Integer.toString(clock.get(Calendar.HOUR));
    msg = msg + ":" +
          Integer.toString(clock.get(Calendar.MINUTE));
    msg = msg + ":" +
          Integer.toString(clock.get(Calendar.SECOND));
  
    g.drawString(msg, 30, 30);
  }
}


//listing 3
/* Track mouse motion by drawing a line 
   when a mouse button is pressed. */ 
 
import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
/*  
  <applet code="TrackM" width=300 height=100>  
  </applet>  
*/  
  
public class TrackM extends Applet  
  implements MouseListener, MouseMotionListener {  
  
  int curX = 0, curY = 0; // current coordinates 
  int oldX = 0, oldY = 0; // previous coordinates 
  boolean draw; 
  
  public void init() {  
     addMouseListener(this);  
     addMouseMotionListener(this);  
     draw = false; 
  }  
 
  /* The next three methods are not used, but must 
     be null-implemented because they are defined  
     by MouseListener. */ 
  
  // Handle mouse entered.  
  public void mouseEntered(MouseEvent me) {  
  }  
  
  // Handle mouse exited.  
  public void mouseExited(MouseEvent me) {  
  }  
 
  // Handle mouse click.  
  public void mouseClicked(MouseEvent me) {  
  }  
  
  // Handle button pressed.  
  public void mousePressed(MouseEvent me) {  
    // save coordinates  
    oldX = me.getX();  
    oldY = me.getY();  
    draw = true; 
  }  
  
  // Handle button released.  
  public void mouseReleased(MouseEvent me) {  
    draw = false; 
  }  
  
  // Handle mouse dragged.  
  public void mouseDragged(MouseEvent me) {  
    // save coordinates  
    curX = me.getX();  
    curY = me.getY();  
    repaint();  
  }  
  
  // Handle mouse moved.  
  public void mouseMoved(MouseEvent me) {  
    // show status  
    showStatus("Moving mouse at " + me.getX() + ", " + me.getY());  
  }  
  
  // Display line in applet window. 
  public void paint(Graphics g) {  
    if(draw) 
     g.drawLine(oldX, oldY, curX, curY); 
  }  
}

