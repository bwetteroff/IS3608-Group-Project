//listing 1
// An enumeration of Transport varieties. 
enum Transport {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
} 
 
class EnumDemo { 
  public static void main(String args[])  
  { 
    Transport tp; 
 
    tp = Transport.AIRPLANE; 
 
    // Output an enum value. 
    System.out.println("Value of tp: " + tp); 
    System.out.println(); 
 
    tp = Transport.TRAIN; 
 
    // Compare two enum values. 
    if(tp == Transport.TRAIN)  
      System.out.println("tp contains TRAIN.\n"); 
 
    // Use an enum to control a switch statement. 
    switch(tp) { 
      case CAR: 
        System.out.println("A car carries people."); 
        break; 
      case TRUCK: 
        System.out.println("A truck carries freight."); 
        break; 
      case AIRPLANE:  
        System.out.println("An airplane flies."); 
        break; 
      case TRAIN: 
        System.out.println("A train runs on rails."); 
        break; 
      case BOAT: 
        System.out.println("A boat sails on water."); 
        break; 
    } 
  } 
}

//listing 2
// Use the built-in enumeration methods. 
 
// An enumeration of Transport varieties. 
enum Transport {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
} 
 
class EnumDemo2 { 
  public static void main(String args[])  
  { 
    Transport tp; 
 
    System.out.println("Here are all Transport constants"); 
 
    // use values() 
    Transport allTransports[] = Transport.values(); 
    for(Transport t : allTransports) 
      System.out.println(t); 
 
    System.out.println(); 
    
    // use valueOf() 
    tp = Transport.valueOf("AIRPLANE"); 
    System.out.println("tp contains " + tp); 
 
  } 
}

//listing 3
// Use an enum constructor, instance variable, and method.  
enum Transport {  
  CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);  
  
  private int speed; // typical speed of each transport   
  
  // Constructor  
  Transport(int s) { speed = s; }  
  
  int getSpeed() { return speed; }  
}  
  
class EnumDemo3 {  
  public static void main(String args[])   
  {  
    Transport tp;  
  
    // Display speed of an airplane.  
    System.out.println("Typical speed for an airplane is " +  
                       Transport.AIRPLANE.getSpeed() +  
                       " miles per hour.\n");  
  
    // Display all Transports and speeds.  
    System.out.println("All Transport speeds: ");  
    for(Transport t : Transport.values())  
      System.out.println(t + " typical speed is " + 
                         t.getSpeed() +  
                         " miles per hour.");  
  }  
}

//listing 4
// Demonstrate ordinal() and compareTo(). 
 
// An enumeration of Transport varieties. 
enum Transport {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
} 
 
class EnumDemo4 { 
  public static void main(String args[])  
  { 
    Transport tp, tp2, tp3; 
 
    // Obtain all ordinal values using ordinal(). 
    System.out.println("Here are all Transport constants" + 
                       " and their ordinal values: "); 
    for(Transport t : Transport.values()) 
      System.out.println(t + " " + t.ordinal()); 
 
    tp =  Transport.AIRPLANE; 
    tp2 = Transport.TRAIN; 
    tp3 = Transport.AIRPLANE; 
 
    System.out.println(); 
 
    // Demonstrate compareTo() 
    if(tp.compareTo(tp2) < 0) 
      System.out.println(tp + " comes before " + tp2); 
 
    if(tp.compareTo(tp2) > 0) 
      System.out.println(tp2 + " comes before " + tp); 
 
    if(tp.compareTo(tp3) == 0) 
      System.out.println(tp + " equals " + tp3); 
  } 
}

//listing 5
// Try This 12-1

// A simulation of a traffic light that uses 
// an enumeration to describe the light's color. 
 
// An enumeration of the colors of a traffic light. 
enum TrafficLightColor {  
  RED, GREEN, YELLOW 
} 
 
// A computerized traffic light. 
class TrafficLightSimulator implements Runnable { 
  private Thread thrd; // holds the thread that runs the simulation 
  private TrafficLightColor tlc; // holds the current traffic light color 
  boolean stop = false; // set to true to stop the simulation 
  boolean changed = false; // true when the light has changed
 
  TrafficLightSimulator(TrafficLightColor init) {  
    tlc = init; 
 
    thrd = new Thread(this); 
    thrd.start(); 
  } 
 
  TrafficLightSimulator() {  
    tlc = TrafficLightColor.RED; 
 
    thrd = new Thread(this); 
    thrd.start(); 
  } 
 
  // Start up the light. 
  public void run() { 
    while(!stop) { 
      try { 
        switch(tlc) { 
          case GREEN: 
            Thread.sleep(10000); // green for 10 seconds 
            break; 
          case YELLOW: 
            Thread.sleep(2000);  // yellow for 2 seconds 
            break; 
          case RED: 
            Thread.sleep(12000); // red for 12 seconds 
            break; 
        } 
      } catch(InterruptedException exc) { 
        System.out.println(exc); 
      } 
      changeColor(); 
    }  
  } 
 
  // Change color. 
  synchronized void changeColor() { 
    switch(tlc) { 
      case RED: 
        tlc = TrafficLightColor.GREEN; 
        break; 
      case YELLOW: 
        tlc = TrafficLightColor.RED; 
        break; 
      case GREEN: 
       tlc = TrafficLightColor.YELLOW; 
    } 
 
    changed = true;
    notify(); // signal that the light has changed 
  } 
 
  // Wait until a light change occurs. 
  synchronized void waitForChange() { 
    try { 
      while(!changed) 
        wait(); // wait for light to change 
      changed = false;
    } catch(InterruptedException exc) { 
      System.out.println(exc); 
    } 
  } 
 
  // Return current color. 
  synchronized TrafficLightColor getColor() { 
    return tlc; 
  } 
 
  // Stop the traffic light. 
  synchronized void cancel() { 
    stop = true; 
  } 
}  
  
class TrafficLightDemo {  
  public static void main(String args[]) {  
    TrafficLightSimulator tl =
      new TrafficLightSimulator(TrafficLightColor.GREEN); 
 
    for(int i=0; i < 9; i++) { 
      System.out.println(tl.getColor()); 
      tl.waitForChange(); 
    } 
 
    tl.cancel(); 
  }  
}

//listing 6
// Demonstrate manual boxing and unboxing with a type wrapper. 
class Wrap { 
  public static void main(String args[]) { 
     
    Integer iOb = new Integer(100);  
 
    int i = iOb.intValue(); 
 
    System.out.println(i + " " + iOb); // displays 100 100 
  } 
}

//listing 7
// Demonstrate autoboxing/unboxing. 
class AutoBox { 
  public static void main(String args[]) { 
     
    Integer iOb = 100; // autobox an int 
 
    int i = iOb; // auto-unbox 
 
    System.out.println(i + " " + iOb);  // displays 100 100 
  } 
}

//listing 8
// Autoboxing/unboxing takes place with  
// method parameters and return values.  
  
class AutoBox2 {  
  // This method has an Integer parameter. 
  static void m(Integer v) {  
    System.out.println("m() received " + v); 
  }   
  
  // This method returns an int. 
  static int m2() { 
    return 10; 
  } 
 
  // This method returns an Integer. 
  static Integer m3() { 
    return 99; // autoboxing 99 into an Integer. 
  } 
 
  public static void main(String args[]) { 
 
    // Pass an int to m().  Because m() has an Integer 
    // parameter, the int value passed is automatically boxed. 
    m(199); 
 
    // Here, iOb recieves the int value returned by m2(). 
    // This value is automatically boxed so that it can be 
    // assigned to iOb. 
    Integer iOb = m2();   
    System.out.println("Return value from m2() is " + iOb);  
 
    // Next, m3() is called. It returns an Integer value 
    // which is auto-unboxed into an int. 
    int i = m3(); 
    System.out.println("Return value from m3() is " + i);  
 
    // Next, Math.sqrt() is called with iOb as an argument. 
    // In this case, iOb is auto-unboxed and its value promoted to 
    // double, which is the type needed by sqrt(). 
    iOb = 100; 
    System.out.println("Square root of iOb is " + Math.sqrt(iOb)); 
  }  
}

//listing 9
// Autoboxing/unboxing occurs inside expressions. 
 
class AutoBox3 { 
  public static void main(String args[]) { 
     
    Integer iOb, iOb2; 
    int i; 
 
    iOb = 99; 
    System.out.println("Original value of iOb: " + iOb); 
 
    // The following automatically unboxes iOb, 
    // performs the increment, and then reboxes 
    // the result back into iOb. 
    ++iOb; 
    System.out.println("After ++iOb: " + iOb); 
 
    // Here, iOb is unboxed, its value is increased by 10 
    // and the result is boxed and stored back in iOb. 
    iOb += 10;  
    System.out.println("After iOb += 10: " + iOb); 
 
    // Here, iOb is unboxed, the expression is  
    // evaluated, and the result is reboxed and 
    // assigned to iOb2. 
    iOb2 = iOb + (iOb / 3); 
    System.out.println("iOb2 after expression: " + iOb2); 
 
    // The same expression is evaluated, but the 
    // result is not reboxed. 
    i = iOb + (iOb / 3); 
    System.out.println("i after expression: " + i); 
  }  
}

//listing 10
// Find the solutions to a quadratic equation. 
class Quadratic {  
  public static void main(String args[]) {  
 
    // a, b, and c represent the coefficients in the 
    // quadratic equation: ax2 + bx + c = 0 
    double a, b, c, x; 
 
    // Solve 4x2 + x - 3 = 0 for x. 
    a = 4; 
    b = 1; 
    c = -3; 
 
    // Find first solution. 
    x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("First solution: " + x); 
 
    // Find second solution. 
    x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("Second solution: " + x); 
  }  
}

//listing 11
// Use static import to bring sqrt() and pow() into view. 
 
import static java.lang.Math.sqrt; 
import static java.lang.Math.pow; 
 
class Quadratic {  
  public static void main(String args[]) {  
 
    // a, b, and c represent the coefficients in the 
    // quadratic equation: ax2 + bx + c = 0 
    double a, b, c, x; 
 
    // Solve 4x2 + x -3 = 0 for x. 
    a = 4; 
    b = 1; 
    c = -3; 
 
    // Find first solution. 
    x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("First solution: " + x); 
 
    // Find second solution. 
    x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("Second solution: " + x); 
  }  
}

//listing 12
// An example that uses @Deprecated. 
 
// Deprecate a class. 
@Deprecated 
class MyClass { 
  private String msg; 
 
  MyClass(String m) { 
    msg = m; 
  } 
   
  // Deprecate a method within a class. 
  @Deprecated 
  String getMsg() { 
    return msg; 
  } 
 
  // ... 
} 
 
class AnnoDemo { 
  public static void main(String args[]) { 
    MyClass myObj = new MyClass("test"); 
 
    System.out.println(myObj.getMsg()); 
  } 
}

