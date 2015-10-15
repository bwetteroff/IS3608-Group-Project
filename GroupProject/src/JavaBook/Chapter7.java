//listing 1
// A simple class hierarchy. 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  double width; 
  double height; 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  String style; 
   
  double area() { 
    return width * height / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
class Shapes { 
  public static void main(String args[]) { 
    Triangle t1 = new Triangle(); 
    Triangle t2 = new Triangle(); 
 
    t1.width = 4.0; 
    t1.height = 4.0; 
    t1.style = "filled"; 
 
    t2.width = 8.0; 
    t2.height = 12.0; 
    t2.style = "outlined"; 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
  } 
}

//listing 2
// A subclass of TwoDShape for rectangles. 
class Rectangle extends TwoDShape { 
  boolean isSquare() { 
    if(width == height) return true; 
    return false; 
  } 
   
  double area() { 
    return width * height; 
  } 
}

//listing 3
// Private members are not inherited.  
 
// This example will not compile. 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  private double width;  // these are 
  private double height; // now private  
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  String style; 
   
  double area() { 
    return width * height / 2; // Error! can't access 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
}

//listing 4
// Use accessor methods to set and get private members. 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  private double width;  // these are 
  private double height; // now private  
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  String style; 
   
  double area() { 
    return getWidth() * getHeight() / 2;  
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
class Shapes2 { 
  public static void main(String args[]) { 
    Triangle t1 = new Triangle(); 
    Triangle t2 = new Triangle(); 
 
    t1.setWidth(4.0); 
    t1.setHeight(4.0); 
    t1.style = "filled"; 
 
    t2.setWidth(8.0); 
    t2.setHeight(12.0); 
    t2.style = "outlined"; 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
  } 
}

//listing 5
// Add a constructor to Triangle. 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  private double width;  // these are 
  private double height; // now private  
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  private String style; 
   
  // Constructor 
  Triangle(String s, double w, double h) { 
    setWidth(w); 
    setHeight(h); 
 
    style = s;  
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2;  
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
class Shapes3 { 
  public static void main(String args[]) { 
    Triangle t1 = new Triangle("filled", 4.0, 4.0); 
    Triangle t2 = new Triangle("outlined", 8.0, 12.0); 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
  } 
}

//listing 6
// Add constructors to TwoDShape. 
class TwoDShape { 
  private double width; 
  private double height; 
 
  // Parameterized constructor. 
  TwoDShape(double w, double h) { 
    width = w; 
    height = h; 
  } 
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  private String style; 
   
  Triangle(String s, double w, double h) { 
    super(w, h); // call superclass constructor 
 
    style = s;  
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
class Shapes4 { 
  public static void main(String args[]) { 
    Triangle t1 = new Triangle("filled", 4.0, 4.0); 
    Triangle t2 = new Triangle("outlined", 8.0, 12.0); 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
  } 
}

//listing 7
// Add more constructors to TwoDShape. 
class TwoDShape { 
  private double width; 
  private double height; 
 
  // A default constructor. 
  TwoDShape() { 
    width = height = 0.0; 
  } 
 
  // Parameterized constructor. 
  TwoDShape(double w, double h) { 
    width = w; 
    height = h; 
  } 
 
  // Construct object with equal width and height. 
  TwoDShape(double x) { 
    width = height = x; 
  } 
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  private String style; 
   
  // A default constructor. 
  Triangle() { 
    super(); 
    style = "none"; 
  } 
 
  // Constructor 
  Triangle(String s, double w, double h) { 
    super(w, h); // call superclass constructor 
 
    style = s;  
  } 
 
  // One argument constructor. 
  Triangle(double x) { 
    super(x); // call superclass constructor 
 
    style = "filled";  
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
class Shapes5 { 
  public static void main(String args[]) { 
    Triangle t1 = new Triangle(); 
    Triangle t2 = new Triangle("outlined", 8.0, 12.0); 
    Triangle t3 = new Triangle(4.0); 
 
    t1 = t2; 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t3: "); 
    t3.showStyle(); 
    t3.showDim(); 
    System.out.println("Area is " + t3.area()); 
 
    System.out.println(); 
  } 
}

//listing 8
// Using super to overcome name hiding. 
class A { 
  int i; 
} 
 
// Create a subclass by extending class A. 
class B extends A { 
  int i; // this i hides the i in A 
 
  B(int a, int b) { 
    super.i = a; // i in A 
    i = b; // i in B 
  } 
 
  void show() { 
    System.out.println("i in superclass: " + super.i); 
    System.out.println("i in subclass: " + i); 
  } 
} 
 
class UseSuper { 
  public static void main(String args[]) { 
    B subOb = new B(1, 2); 
 
    subOb.show(); 
  } 
}

//listing 9
// Try This 7-1
//
// Build a subclass of Vehicle for trucks. 
class Vehicle {    
  private int passengers; // number of passengers    
  private int fuelcap;    // fuel capacity in gallons   
  private int mpg;        // fuel consumption in miles per gallon   
   
  // This is a constructor for Vehicle.  
  Vehicle(int p, int f, int m) {  
    passengers = p;  
    fuelcap = f;  
    mpg = m;  
  }  
 
  // Return the range.   
  int range() {   
    return mpg * fuelcap;   
  }   
   
  // Compute fuel needed for a given distance.  
  double fuelneeded(int miles) {   
    return (double) miles / mpg;   
  } 
 
  // Access methods for instance variables. 
  int getPassengers() { return passengers; } 
  void setPassengers(int p) { passengers = p; } 
  int getFuelcap() { return fuelcap; } 
  void setFuelcap(int f) { fuelcap = f; } 
  int getMpg() { return mpg; } 
  void setMpg(int m) { mpg = m; } 
   
}    
  
// Extend Vehicle to create a Truck specialization.    
class Truck extends Vehicle {  
  private int cargocap; // cargo capacity in pounds  
  
  // This is a constructor for Truck.  
  Truck(int p, int f, int m, int c) {  
    /* Initialize Vehicle members using 
       Vehicle's constructor. */ 
    super(p, f, m);  
 
    cargocap = c;  
  }  
 
  // Accessor methods for cargocap. 
  int getCargo() { return cargocap; } 
  void putCargo(int c) { cargocap = c; } 
}  
    
class TruckDemo {    
  public static void main(String args[]) {    
  
    // construct some trucks 
    Truck semi = new Truck(2, 200, 7, 44000);    
    Truck pickup = new Truck(3, 28, 15, 2000);    
    double gallons;   
    int dist = 252;   
   
    gallons = semi.fuelneeded(dist);    
    
    System.out.println("Semi can carry " + semi.getCargo() +  
                       " pounds."); 
    System.out.println("To go " + dist + " miles semi needs " +   
                       gallons + " gallons of fuel.\n");   
       
    gallons = pickup.fuelneeded(dist);    
    
    System.out.println("Pickup can carry " + pickup.getCargo() +  
                       " pounds."); 
    System.out.println("To go " + dist + " miles pickup needs " +   
                       gallons + " gallons of fuel.");  
  }    
}

//listing 10
// Create an off-road vehicle class 
class OffRoad extends Vehicle { 
  private int groundClearance; // ground clearance in inches 
 
  // ... 
}

//listing 11
// A multilevel hierarchy. 
class TwoDShape { 
  private double width; 
  private double height; 
 
  // A default constructor. 
  TwoDShape() { 
    width = height = 0.0; 
  } 
 
  // Parameterized constructor. 
  TwoDShape(double w, double h) { 
    width = w; 
    height = h; 
  } 
 
  // Construct object with equal width and height. 
  TwoDShape(double x) { 
    width = height = x; 
  } 
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// Extend TwoDShape. 
class Triangle extends TwoDShape { 
  private String style; 
   
  // A default constructor. 
  Triangle() { 
    super(); 
    style = "none"; 
  } 
 
  Triangle(String s, double w, double h) { 
    super(w, h); // call superclass constructor 
 
    style = s;  
  } 
 
  // One argument constructor. 
  Triangle(double x) { 
    super(x); // call superclass constructor 
 
    style = "filled";  
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
// Extend Triangle. 
class ColorTriangle extends Triangle { 
  private String color; 
 
  ColorTriangle(String c, String s, 
                double w, double h) { 
    super(s, w, h); 
 
    color = c; 
  } 
 
  String getColor() { return color; } 
 
  void showColor() { 
    System.out.println("Color is " + color); 
  } 
} 
 
class Shapes6 { 
  public static void main(String args[]) { 
    ColorTriangle t1 =  
         new ColorTriangle("Blue", "outlined", 8.0, 12.0); 
    ColorTriangle t2 =  
         new ColorTriangle("Red", "filled", 4.0, 2.0); 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    t1.showColor(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    t2.showColor(); 
    System.out.println("Area is " + t2.area()); 
  } 
}

//listing 12
// Demonstrate when constructors are called. 
 
// Create a super class. 
class A { 
  A() {  
    System.out.println("Constructing A."); 
  } 
} 
 
// Create a subclass by extending class A. 
class B extends A { 
  B() { 
    System.out.println("Constructing B."); 
  } 
} 
 
// Create another subclass by extending B. 
class C extends B { 
  C() { 
    System.out.println("Constructing C."); 
  } 
} 
 
class OrderOfConstruction { 
  public static void main(String args[]) {
    C c = new C(); 
  } 
}

//listing 13
// This will not compile. 
class X { 
  int a; 
 
  X(int i) { a = i; } 
} 
 
class Y { 
  int a; 
 
  Y(int i) { a = i; } 
} 
 
class IncompatibleRef { 
  public static void main(String args[]) { 
    X x = new X(10); 
    X x2;  
    Y y = new Y(5); 
 
    x2 = x; // OK, both of same type 
 
    x2 = y; // Error, not of same type 
  } 
}

//listing 14
// A superclass reference can refer to a subclass object. 
class X { 
  int a; 
 
  X(int i) { a = i; } 
} 
 
class Y extends X { 
  int b; 
 
  Y(int i, int j) { 
    super(j); 
    b = i; 
  } 
} 
 
class SupSubRef { 
  public static void main(String args[]) { 
    X x = new X(10); 
    X x2;  
    Y y = new Y(5, 6); 
 
    x2 = x; // OK, both of same type 
    System.out.println("x2.a: " + x2.a); 
 
    x2 = y; // still Ok because Y is derived from X 
    System.out.println("x2.a: " + x2.a); 
 
    // X references know only about X members 
    x2.a = 19; // OK 
//    x2.b = 27; // Error, X doesn't have a b member 
  } 
}

//listing 15
class TwoDShape { 
  private double width; 
  private double height; 
 
  // A default constructor. 
  TwoDShape() { 
    width = height = 0.0; 
  } 
 
  // Parameterized constructor. 
  TwoDShape(double w, double h) { 
    width = w; 
    height = h; 
  } 
 
  // Construct object with equal width and height. 
  TwoDShape(double x) { 
    width = height = x; 
  } 
 
  // Construct an object from an object. 
  TwoDShape(TwoDShape ob) { 
    width = ob.width; 
    height = ob.height; 
  } 
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 
 
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  private String style; 
   
  // A default constructor. 
  Triangle() { 
    super(); 
    style = "none"; 
  } 
 
  // Constructor for Triangle. 
  Triangle(String s, double w, double h) { 
    super(w, h); // call superclass constructor 
 
    style = s;  
  } 
 
  // One argument constructor. 
  Triangle(double x) { 
    super(x); // call superclass constructor 
 
    style = "filled";  
  } 
 
  // Construct an object from an object. 
  Triangle(Triangle ob) { 
    super(ob); // pass object to TwoDShape constructor 
    style = ob.style; 
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
 
class Shapes7 { 
  public static void main(String args[]) { 
    Triangle t1 =  
         new Triangle("outlined", 8.0, 12.0); 
 
    // make a copy of t1 
    Triangle t2 = new Triangle(t1); 
 
    System.out.println("Info for t1: "); 
    t1.showStyle(); 
    t1.showDim(); 
    System.out.println("Area is " + t1.area()); 
 
    System.out.println(); 
 
    System.out.println("Info for t2: "); 
    t2.showStyle(); 
    t2.showDim(); 
    System.out.println("Area is " + t2.area()); 
  } 
}

//listing 16
// Method overriding. 
class A { 
  int i, j; 
  A(int a, int b) { 
    i = a; 
    j = b; 
  } 
 
  // display i and j 
  void show() { 
    System.out.println("i and j: " + i + " " + j); 
  } 
} 
 
class B extends A {
  int k; 
 
  B(int a, int b, int c) { 
    super(a, b); 
    k = c; 
  } 
 
  // display k – this overrides show() in A 
  void show() { 
    System.out.println("k: " + k); 
  } 
} 
 
class Override { 
  public static void main(String args[]) { 
    B subOb = new B(1, 2, 3); 
 
    subOb.show(); // this calls show() in B 
  } 
}

//listing 17
class B extends A { 
  int k; 
 
  B(int a, int b, int c) { 
    super(a, b); 
    k = c; 
  }
  void show() { 
    super.show(); // this calls A's show() 
    System.out.println("k: " + k); 
  } 
}

//listing 18
/* Methods with differing type signatures are 
   overloaded and not overridden. */ 
class A { 
  int i, j; 
 
  A(int a, int b) { 
    i = a; 
    j = b; 
  } 
 
  // display i and j 
  void show() { 
    System.out.println("i and j: " + i + " " + j); 
  } 
} 
 
// Create a subclass by extending class A. 
class B extends A { 
  int k; 
 
  B(int a, int b, int c) { 
    super(a, b); 
    k = c;
  } 
 
  // overload show() 
  void show(String msg) { 
    System.out.println(msg + k); 
  } 
} 
 
class Overload { 
  public static void main(String args[]) { 
    B subOb = new B(1, 2, 3); 
 
    subOb.show("This is k: "); // this calls show() in B 
    subOb.show(); // this calls show() in A 
  } 
}

//listing 19
// Demonstrate dynamic method dispatch. 
 
class Sup { 
  void who() { 
    System.out.println("who() in Sup"); 
  } 
} 
 
class Sub1 extends Sup { 
  void who() { 
    System.out.println("who() in Sub1"); 
  } 
} 
 
class Sub2 extends Sup { 
  void who() { 
    System.out.println("who() in Sub2"); 
  } 
} 
 
class DynDispDemo { 
  public static void main(String args[]) { 
    Sup superOb = new Sup(); 
    Sub1 subOb1 = new Sub1(); 
    Sub2 subOb2 = new Sub2(); 
 
    Sup supRef;  
 
    supRef = superOb;  
    supRef.who(); 
 
    supRef = subOb1;  
    supRef.who(); 
 
    supRef = subOb2;  
    supRef.who(); 
  } 
}

//listing 20
// Use dynamic method dispatch.  
class TwoDShape {  
  private double width;  
  private double height;  
  private String name;  
  
  // A default constructor.  
  TwoDShape() {  
    width = height = 0.0;  
    name = "none";  
  }  
  
  // Parameterized constructor.  
  TwoDShape(double w, double h, String n) {  
    width = w;  
    height = h;  
    name = n;  
  }  
  
  // Construct object with equal width and height.  
  TwoDShape(double x, String n) {  
    width = height = x;  
    name = n;  
  }  
  
  // Construct an object from an object.  
  TwoDShape(TwoDShape ob) {  
    width = ob.width;  
    height = ob.height;  
    name = ob.name;  
  }  
  
  // Accessor methods for width and height.  
  double getWidth() { return width; }  
  double getHeight() { return height; }  
  void setWidth(double w) { width = w; }  
  void setHeight(double h) { height = h; }  
  
  String getName() { return name; }  
  
  void showDim() {  
    System.out.println("Width and height are " +  
                       width + " and " + height);  
  }  
  
  double area() {   
    System.out.println("area() must be overridden");  
    return 0.0;  
  }   
}  
  
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape {  
  private String style;  
    
  // A default constructor.  
  Triangle() {  
    super();  
    style = "none";  
  }  
  
  // Constructor for Triangle.  
  Triangle(String s, double w, double h) {  
    super(w, h, "triangle");  
  
    style = s;   
  }  
  
  // One argument constructor. 
  Triangle(double x) {  
    super(x, "triangle"); // call superclass constructor  
  
    style = "filled";   
  }  
  
  // Construct an object from an object.  
  Triangle(Triangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
    style = ob.style;  
  }  
  
  // Override area() for Triangle. 
  double area() {  
    return getWidth() * getHeight() / 2;  
  }  
  
  void showStyle() {  
    System.out.println("Triangle is " + style);  
  }  
}  
  
// A subclass of TwoDShape for rectangles.   
class Rectangle extends TwoDShape {   
  // A default constructor.  
  Rectangle() {  
    super();  
  }  
  
  // Constructor for Rectangle.  
  Rectangle(double w, double h) {  
    super(w, h, "rectangle"); // call superclass constructor  
  }  
  
  // Construct a square.  
  Rectangle(double x) {  
    super(x, "rectangle"); // call superclass constructor  
  }  
  
  // Construct an object from an object.  
  Rectangle(Rectangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
  }  
  
  boolean isSquare() {   
    if(getWidth() == getHeight()) return true;   
    return false;   
  }   
     
  // Override area() for Rectangle. 
  double area() {   
    return getWidth() * getHeight();   
  }   
}  
  
class DynShapes {  
  public static void main(String args[]) {  
    TwoDShape shapes[] = new TwoDShape[5];  
  
    shapes[0] = new Triangle("outlined", 8.0, 12.0);  
    shapes[1] = new Rectangle(10);  
    shapes[2] = new Rectangle(10, 4);  
    shapes[3] = new Triangle(7.0);  
    shapes[4] = new TwoDShape(10, 20, "generic"); 
  
    for(int i=0; i < shapes.length; i++) {  
      System.out.println("object is " + shapes[i].getName());  
      System.out.println("Area is " + shapes[i].area());  
  
      System.out.println();    
    }  
  }  
}

//listing 21
// Create an abstract class. 
abstract class TwoDShape {  
  private double width;  
  private double height;  
  private String name;  
  
  // A default constructor.  
  TwoDShape() {  
    width = height = 0.0;  
    name = "none";  
  }  
  
  // Parameterized constructor.  
  TwoDShape(double w, double h, String n) {  
    width = w;  
    height = h;  
    name = n;  
  }  
  
  // Construct object with equal width and height.  
  TwoDShape(double x, String n) {  
    width = height = x;  
    name = n;  
  }  
  
  // Construct an object from an object.  
  TwoDShape(TwoDShape ob) {  
    width = ob.width;  
    height = ob.height;  
    name = ob.name;  
  }  
  
  // Accessor methods for width and height.  
  double getWidth() { return width; }  
  double getHeight() { return height; }  
  void setWidth(double w) { width = w; }  
  void setHeight(double h) { height = h; }  
  
  String getName() { return name; }  
  
  void showDim() {  
    System.out.println("Width and height are " +  
                       width + " and " + height);  
  }  
  
  // Now, area() is abstract. 
  abstract double area(); 
}  
  
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape {  
  private String style;  
    
  // A default constructor.  
  Triangle() {  
    super();  
    style = "none";  
  }  
  
  // Constructor for Triangle.  
  Triangle(String s, double w, double h) {  
    super(w, h, "triangle");  
  
    style = s;   
  }  
  
  // One argument constructor 
  Triangle(double x) {  
    super(x, "triangle"); // call superclass constructor  
  
    style = "filled";   
  }  
  
  // Construct an object from an object.  
  Triangle(Triangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
    style = ob.style;  
  }  
  
  double area() {  
    return getWidth() * getHeight() / 2;  
  }  
  
  void showStyle() {  
    System.out.println("Triangle is " + style);  
  }  
}  
  
// A subclass of TwoDShape for rectangles.   
class Rectangle extends TwoDShape {   
  // A default constructor.  
  Rectangle() {  
    super();  
  }  
  
  // Constructor for Rectangle.  
  Rectangle(double w, double h) {  
    super(w, h, "rectangle"); // call superclass constructor  
  }  
  
  // Construct a square.  
  Rectangle(double x) {  
    super(x, "rectangle"); // call superclass constructor  
  }  
  
  // Construct an object from an object.  
  Rectangle(Rectangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
  }  
  
  boolean isSquare() {   
    if(getWidth() == getHeight()) return true;   
    return false;   
  }   
     
  double area() {   
    return getWidth() * getHeight();   
  }   
}  
  
class AbsShape {  
  public static void main(String args[]) {  
    TwoDShape shapes[] = new TwoDShape[4];  
  
    shapes[0] = new Triangle("outlined", 8.0, 12.0);  
    shapes[1] = new Rectangle(10);  
    shapes[2] = new Rectangle(10, 4);  
    shapes[3] = new Triangle(7.0);  
  
    for(int i=0; i < shapes.length; i++) {  
      System.out.println("object is " + shapes[i].getName());  
      System.out.println("Area is " + shapes[i].area());  
  
      System.out.println();    
    }  
  }  
}

//listing 22
class A { 
  final void meth() { 
    System.out.println("This is a final method."); 
  } 
} 
 
class B extends A { 
  void meth() { // ERROR! Can't override.
    System.out.println("Illegal!"); 
  } 
}

//listing 23
// Return a String object.  
class ErrorMsg {  
  // Error codes. 
  final int OUTERR   = 0; 
  final int INERR    = 1; 
  final int DISKERR  = 2; 
  final int INDEXERR = 3; 
 
  String msgs[] = {  
    "Output Error",  
    "Input Error",  
    "Disk Full",  
    "Index Out-Of-Bounds"  
  };  
  
  // Return the error message.  
  String getErrorMsg(int i) {  
    if(i >=0 & i < msgs.length)  
      return msgs[i];  
    else  
      return "Invalid Error Code";  
  }  
}  
  
class FinalD {  
  public static void main(String args[]) {  
    ErrorMsg err = new ErrorMsg();  
  
    System.out.println(err.getErrorMsg(err.OUTERR));  
    System.out.println(err.getErrorMsg(err.DISKERR));  
  }  
}

