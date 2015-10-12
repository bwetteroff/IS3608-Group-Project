//listing 1
// Public vs private access. 
class MyClass {  
  private int alpha; // private access 
  public int beta; // public access 
  int gamma; // default access
 
  /* Methods to access alpha.  It is OK for a 
     member of a class to access a private member 
     of the same class. 
  */ 
  void setAlpha(int a) { 
    alpha = a;  
  } 
 
  int getAlpha() { 
    return alpha; 
  } 
}  
  
class AccessDemo {  
  public static void main(String args[]) {  
    MyClass ob = new MyClass();  
  
    /* Access to alpha is allowed only through 
       its accessor methods. */ 
    ob.setAlpha(-99); 
    System.out.println("ob.alpha is " + ob.getAlpha()); 
 
    // You cannot access alpha like this: 
//  ob.alpha = 10; // Wrong! alpha is private! 
 
    // These are OK because beta and gamma are public. 
    ob.beta = 88;  
    ob.gamma = 99;  
   }  
}

//listing 2
/* This class implements a "fail-soft" array which prevents 
   runtime errors. 
 */  
class FailSoftArray {  
  private int a[]; // reference to array 
  private int errval; // value to return if get() fails 
 
  public int length; // length is public 
   
  /* Construct array given its size and the value to 
     return if get() fails. */ 
  public FailSoftArray(int size, int errv) { 
    a = new int[size]; 
    errval = errv; 
    length = size;  
  } 
 
  // Return value at given index. 
  public int get(int index) { 
    if(indexOK(index)) return a[index]; 
    return errval; 
  } 
 
  // Put a value at an index. Return false on failure. 
  public boolean put(int index, int val) { 
    if(indexOK(index)) { 
      a[index] = val; 
      return true; 
    } 
    return false; 
  } 
 
  // Return true if index is within bounds. 
  private boolean indexOK(int index) { 
   if(index >= 0 & index < length) return true; 
   return false; 
  } 
}  
  
// Demonstrate the fail-soft array. 
class FSDemo {  
  public static void main(String args[]) {  
    FailSoftArray fs = new FailSoftArray(5, -1); 
    int x; 
 
    // show quiet failures 
    System.out.println("Fail quietly."); 
    for(int i=0; i < (fs.length * 2); i++) 
      fs.put(i, i*10); 
 
    for(int i=0; i < (fs.length * 2); i++) { 
      x = fs.get(i); 
      if(x != -1) System.out.print(x + " "); 
    } 
    System.out.println(""); 
 
    // now, handle failures 
    System.out.println("\nFail with error reports."); 
    for(int i=0; i < (fs.length * 2); i++) 
      if(!fs.put(i, i*10)) 
        System.out.println("Index " + i + " out-of-bounds"); 
 
    for(int i=0; i < (fs.length * 2); i++) { 
      x = fs.get(i); 
      if(x != -1) System.out.print(x + " "); 
      else 
        System.out.println("Index " + i + " out-of-bounds"); 
    } 
  } 
}

//listing 3
// An improved queue class for characters.  
class Queue {  
  // these members are now private 
  private char q[]; // this array holds the queue  
  private int putloc, getloc; // the put and get indices  
  
  Queue(int size) {  
    q = new char[size]; // allocate memory for queue  
    putloc = getloc = 0;  
  }  
  
  // Put a characer into the queue. 
  void put(char ch) {  
    if(putloc==q.length) {  
      System.out.println(" -- Queue is full.");  
      return;  
    }  
      
    q[putloc++] = ch;  
  }  
  
  // Get a character from the queue. 
  char get() {  
    if(getloc == putloc) {  
      System.out.println(" -- Queue is empty.");  
      return (char) 0;   
    }  
    
    return q[getloc++];  
  }  
}

//listing 4
// Objects can be passed to methods.  
class Block {  
  int a, b, c;  
  int volume; 
  
  Block(int i, int j, int k) {  
    a = i;  
    b = j;  
    c = k; 
    volume = a * b * c; 
  }  
  
  // Return true if ob defines same block. 
  boolean sameBlock(Block ob) {  
    if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;  
    else return false;  
  }  
 
  // Return true if ob has same volume. 
  boolean sameVolume(Block ob) { 
    if(ob.volume == volume) return true; 
    else return false; 
  } 
}  
  
class PassOb {  
  public static void main(String args[]) { 
    Block ob1 = new Block(10, 2, 5);  
    Block ob2 = new Block(10, 2, 5);  
    Block ob3 = new Block(4, 5, 5);  
  
    System.out.println("ob1 same dimensions as ob2: " + 
                       ob1.sameBlock(ob2));  
    System.out.println("ob1 same dimensions as ob3: " + 
                        ob1.sameBlock(ob3));  
    System.out.println("ob1 same volume as ob3: " + 
                       ob1.sameVolume(ob3));  
  }  
}

//listing 5
// Simple types are passed by value. 
class Test { 
  /* This method causes no change to the arguments 
     used in the call. */ 
  void noChange(int i, int j) { 
    i = i + j; 
    j = -j; 
  } 
} 
 
class CallByValue { 
  public static void main(String args[]) { 
    Test ob = new Test(); 
 
    int a = 15, b = 20; 
 
    System.out.println("a and b before call: " + 
                       a + " " + b); 
 
    ob.noChange(a, b);  
 
    System.out.println("a and b after call: " + 
                       a + " " + b); 
  } 
}

//listing 6
// Objects are passed through their references. 
class Test { 
  int a, b; 
 
  Test(int i, int j) { 
    a = i; 
    b = j; 
  }
  /* Pass an object. Now, ob.a and ob.b in object 
     used in the call will be changed. */ 
  void change(Test ob) { 
    ob.a = ob.a + ob.b; 
    ob.b = -ob.b; 
  } 
} 
 
class PassObjRef { 
  public static void main(String args[]) { 
    Test ob = new Test(15, 20); 
 
    System.out.println("ob.a and ob.b before call: " + 
                       ob.a + " " + ob.b); 
 
    ob.change(ob); 
 
    System.out.println("ob.a and ob.b after call: " + 
                       ob.a + " " + ob.b); 
  } 
}

//listing 7
// Return a String object. 
class ErrorMsg { 
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
 
class ErrMsg { 
  public static void main(String args[]) { 
    ErrorMsg err = new ErrorMsg(); 
 
    System.out.println(err.getErrorMsg(2)); 
    System.out.println(err.getErrorMsg(19)); 
  } 
}

//listing 8
// Return a programmer-defined object. 
class Err { 
  String msg; // error message 
  int severity; // code indicating severity of error 
 
  Err(String m, int s) { 
    msg = m; 
    severity  = s; 
  } 
} 
 
class ErrorInfo { 
  String msgs[] = { 
    "Output Error", 
    "Input Error", 
    "Disk Full", 
    "Index Out-Of-Bounds" 
  }; 
  int howbad[] = { 3, 3, 2, 4 }; 
 
  Err getErrorInfo(int i) { 
    if(i >=0 & i < msgs.length) 
      return new Err(msgs[i], howbad[i]); 
    else 
      return new Err("Invalid Error Code", 0); 
  } 
} 
 
class ErrInfo { 
  public static void main(String args[]) { 
    ErrorInfo err = new ErrorInfo(); 
    Err e; 
 
    e = err.getErrorInfo(2); 
    System.out.println(e.msg + " severity: " + e.severity); 
 
    e = err.getErrorInfo(19); 
    System.out.println(e.msg + " severity: " + e.severity); 
  } 
}

//listing 9
// Demonstrate method overloading.  
class Overload {  
  void ovlDemo() {  
    System.out.println("No parameters");  
  }  
  
  // Overload ovlDemo for one integer parameter.  
  void ovlDemo(int a) {  
    System.out.println("One parameter: " + a);  
  }  
  
  // Overload ovlDemo for two integer parameters.  
  int ovlDemo(int a, int b) {  
    System.out.println("Two parameters: " + a + " " + b);  
    return a + b; 
  }  
  
  // Overload ovlDemo for two double parameters.  
  double ovlDemo(double a, double b) { 
    System.out.println("Two double parameters: " + 
                       a + " "+ b);  
    return a + b;  
  }  
}  
  
class OverloadDemo {  
  public static void main(String args[]) {  
    Overload ob = new Overload();  
    int resI; 
    double resD;      
  
    // call all versions of ovlDemo()  
    ob.ovlDemo();   
    System.out.println(); 
 
    ob.ovlDemo(2);  
    System.out.println(); 
 
    resI = ob.ovlDemo(4, 6);  
    System.out.println("Result of ob.ovlDemo(4, 6): " + 
                       resI);  
    System.out.println(); 
 
 
    resD = ob.ovlDemo(1.1, 2.32);  
    System.out.println("Result of ob.ovlDemo(1.1, 2.2): " + 
                       resD);  
  }  
}

//listing 10
/* Automatic type conversions can affect 
   overloaded method resolution. 
*/ 
class Overload2 { 
  void f(int x) { 
    System.out.println("Inside f(int): " + x); 
  } 
 
  void f(double x) { 
    System.out.println("Inside f(double): " + x); 
  } 
} 
 
class TypeConv { 
  public static void main(String args[]) { 
    Overload2 ob = new Overload2(); 
 
    int i = 10; 
    double d = 10.1; 
 
    byte b = 99; 
    short s = 10; 
    float f = 11.5F; 
 
 
    ob.f(i); // calls ob.f(int) 
    ob.f(d); // calls ob.f(double) 
 
    ob.f(b); // calls ob.f(int) -- type conversion 
    ob.f(s); // calls ob.f(int) -- type conversion 
    ob.f(f); // calls ob.f(double) -- type conversion 
  } 
}

//listing 11
// Add f(byte). 
class Overload2 { 
  void f(byte x) { 
    System.out.println("Inside f(byte): " + x); 
  } 
 
  void f(int x) { 
    System.out.println("Inside f(int): " + x); 
  } 
 
  void f(double x) { 
    System.out.println("Inside f(double): " + x); 
  } 
} 
 
class TypeConv { 
  public static void main(String args[]) { 
    Overload2 ob = new Overload2(); 
 
    int i = 10; 
    double d = 10.1; 
 
    byte b = 99; 
    short s = 10; 
    float f = 11.5F; 
 
 
    ob.f(i); // calls ob.f(int) 
    ob.f(d); // calls ob.f(double) 
 
    ob.f(b); // calls ob.f(byte) -- now, no type conversion 
 
    ob.f(s); // calls ob.f(int) -- type conversion 
    ob.f(f); // calls ob.f(double) -- type conversion 
  } 
}

//listing 12
// Demonstrate an overloaded constructor. 
class MyClass {  
  int x;  
  
  MyClass() { 
    System.out.println("Inside MyClass()."); 
    x = 0; 
  } 
 
  MyClass(int i) {  
    System.out.println("Inside MyClass(int)."); 
    x = i;  
  } 
 
  MyClass(double d) { 
    System.out.println("Inside MyClass(double)."); 
    x = (int) d; 
  } 
 
  MyClass(int i, int j) { 
    System.out.println("Inside MyClass(int, int)."); 
    x = i * j; 
  }    
}    
    
class OverloadConsDemo {    
  public static void main(String args[]) {    
    MyClass t1 = new MyClass();  
    MyClass t2 = new MyClass(88);  
    MyClass t3 = new MyClass(17.23);  
    MyClass t4 = new MyClass(2, 4);  
  
    System.out.println("t1.x: " + t1.x); 
    System.out.println("t2.x: " + t2.x); 
    System.out.println("t3.x: " + t3.x); 
    System.out.println("t4.x: " + t4.x); 
  }    
}

//listing 13
// Initialize one object with another. 
class Summation { 
  int sum; 
 
  // Construct from an int. 
  Summation(int num) { 
    sum = 0; 
    for(int i=1; i <= num; i++) 
      sum += i; 
  } 
 
  // Construct from another object. 
  Summation(Summation ob) { 
    sum = ob.sum; 
  } 
} 
 
class SumDemo { 
  public static void main(String args[]) { 
    Summation s1 = new Summation(5); 
    Summation s2 = new Summation(s1); 
 
    System.out.println("s1.sum: " + s1.sum); 
    System.out.println("s2.sum: " + s2.sum); 
  } 
}

//listing 14
// A queue class for characters.   
class Queue {   
  private char q[]; // this array holds the queue   
  private int putloc, getloc; // the put and get indices   
   
  // Construct an empty Queue given its size.  
  Queue(int size) {   
    q = new char[size]; // allocate memory for queue   
    putloc = getloc = 0;   
  }   
  
  // Construct a Queue from a Queue.  
  Queue(Queue ob) {  
    putloc = ob.putloc;  
    getloc = ob.getloc;  
    q = new char[ob.q.length];  
  
    // copy elements  
    for(int i=getloc; i < putloc; i++)  
      q[i] = ob.q[i];  
  }  
  
  // Construct a Queue with initial values.  
  Queue(char a[]) {  
    putloc = 0;  
    getloc = 0;  
    q = new char[a.length];  
  
    for(int i = 0; i < a.length; i++) put(a[i]);  
  }  
      
  // Put a characer into the queue.   
  void put(char ch) {   
    if(putloc==q.length) {   
      System.out.println(" -- Queue is full.");   
      return;   
    }   
       
    q[putloc++] = ch;   
  }   
   
  // Get a character from the queue.  
  char get() {   
    if(getloc == putloc) {   
      System.out.println(" -- Queue is empty.");   
      return (char) 0;    
    }   
     
    return q[getloc++];   
  }   
}   
   
// Demonstrate the Queue class.   
class QDemo2 {   
  public static void main(String args[]) {   
    // construct 10-element empty queue  
    Queue q1 = new Queue(10);   
  
    char name[] = {'T', 'o', 'm'};   
    // construct queue from array  
    Queue q2 = new Queue(name);   
  
    char ch;   
    int i;   
   
    // put some characters into q1   
    for(i=0; i < 10; i++)   
      q1.put((char) ('A' + i));   
  
    // construct queue from another queue  
    Queue q3 = new Queue(q1);  
  
    // Show the queues.  
    System.out.print("Contents of q1: ");   
    for(i=0; i < 10; i++) {    
      ch = q1.get();   
      System.out.print(ch);   
    }   
   
    System.out.println("\n");   
   
    System.out.print("Contents of q2: ");   
    for(i=0; i < 3; i++) {    
      ch = q2.get();   
      System.out.print(ch);   
    }   
   
    System.out.println("\n");   
   
    System.out.print("Contents of q3: ");   
    for(i=0; i < 10; i++) {    
      ch = q3.get();   
      System.out.print(ch);   
    }   
  }   
}

//listing 15
// A simple example of recursion.  
class Factorial {  
  // This is a recursive function.  
  int factR(int n) {  
    int result;  
  
    if(n==1) return 1;  
    result = factR(n-1) * n;  
    return result;  
  }  
  
  // This is an iterative equivalent.  
  int factI(int n) {  
    int t, result;  
  
    result = 1;  
    for(t=1; t <= n; t++) result *= t;  
    return result;  
}  
}  
  
class Recursion {  
  public static void main(String args[]) {  
    Factorial f = new Factorial();  
  
    System.out.println("Factorials using recursive method.");  
    System.out.println("Factorial of 3 is " + f.factR(3));  
    System.out.println("Factorial of 4 is " + f.factR(4));  
    System.out.println("Factorial of 5 is " + f.factR(5));  
    System.out.println();  
 
    System.out.println("Factorials using iterative method.");  
    System.out.println("Factorial of 3 is " + f.factI(3));  
    System.out.println("Factorial of 4 is " + f.factI(4));  
    System.out.println("Factorial of 5 is " + f.factI(5));  
  }  
}

//listing 16
// Use a static variable.
class StaticDemo {
  int x; // a normal instance variable
  static int y; // a static variable

  // Return the sum of the instance variable x
  // and the static variable y.
  int sum() {
    return x + y;
  }
}

class SDemo {
  public static void main(String args[]) {
    StaticDemo ob1 = new StaticDemo();
    StaticDemo ob2 = new StaticDemo();

    // Each object has its own copy of an instance variable.
    ob1.x = 10;
    ob2.x = 20;
    System.out.println("Of course, ob1.x and ob2.x " +
                       "are independent.");
    System.out.println("ob1.x: " + ob1.x +
                       "\nob2.x: " + ob2.x);
    System.out.println();

    // Each object shares one copy of a static variable.
    System.out.println("The static variable y is shared.");
    StaticDemo.y = 19;
    System.out.println("Set StaticDemo.y to 19.");

    System.out.println("ob1.sum(): " + ob1.sum());
    System.out.println("ob2.sum(): " + ob2.sum());
    System.out.println();

    StaticDemo.y = 100;
    System.out.println("Change StaticDemo.y to 100");

    System.out.println("ob1.sum(): " + ob1.sum());
    System.out.println("ob2.sum(): " + ob2.sum());
    System.out.println();  }
}

//listing 17
// Use a static method. 
class StaticMeth { 
  static int val = 1024; // a static variable 
 
  // a static method 
  static int valDiv2() { 
    return val/2; 
  } 
} 
 
class SDemo2 { 
  public static void main(String args[]) { 
 
    System.out.println("val is " + StaticMeth.val); 
    System.out.println("StaticMeth.valDiv2(): " + 
                       StaticMeth.valDiv2()); 
 
    StaticMeth.val = 4; 
    System.out.println("val is " + StaticMeth.val); 
    System.out.println("StaticMeth.valDiv2(): " + 
                       StaticMeth.valDiv2()); 
 
  } 
}

//listing 18
class StaticError { 
  int denom = 3; // a normal instance variable 
  static int val = 1024; // a static variable 
 
  /* Error! Can't access a non-static variable 
     from within a static method. */ 
  static int valDivDenom() { 
    return val/denom; // won't compile! 
  } 
}

//listing 19
// Use a static block 
class StaticBlock { 
  static double rootOf2; 
  static double rootOf3; 
 
  static { 
    System.out.println("Inside static block."); 
    rootOf2 = Math.sqrt(2.0); 
    rootOf3 = Math.sqrt(3.0); 
  } 
 
  StaticBlock(String msg) { 
    System.out.println(msg); 
  } 
} 
 
class SDemo3 { 
  public static void main(String args[]) { 
    StaticBlock ob = new StaticBlock("Inside Constructor"); 
 
    System.out.println("Square root of 2 is " +  
                       StaticBlock.rootOf2); 
    System.out.println("Square root of 3 is " +  
                       StaticBlock.rootOf3); 
 
  } 
}

//listing 20
// Try This 6-3 A simple version of the Quicksort. 
class Quicksort { 
 
  // Set up a call to the actual Quicksort method. 
  static void qsort(char items[]) { 
    qs(items, 0, items.length-1); 
  } 
 
  // A recursive version of Quicksort for characters. 
  private static void qs(char items[], int left, int right)  
  {  
    int i, j;  
    char x, y;  
  
    i = left; j = right;  
    x = items[(left+right)/2];  
  
    do {  
      while((items[i] < x) && (i < right)) i++;  
      while((x < items[j]) && (j > left)) j--;  
  
      if(i <= j) {  
        y = items[i];  
        items[i] = items[j];  
        items[j] = y;  
        i++; j--;  
      }  
    } while(i <= j);  
  
    if(left < j) qs(items, left, j);  
    if(i < right) qs(items, i, right);  
  } 
} 
 
class QSDemo { 
  public static void main(String args[]) { 
    char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' }; 
    int i; 
 
    System.out.print("Original array: "); 
    for(i=0; i < a.length; i++)  
      System.out.print(a[i]); 
 
    System.out.println(); 
 
    // now, sort the array 
    Quicksort.qsort(a); 
     
    System.out.print("Sorted array: "); 
    for(i=0; i < a.length; i++)  
      System.out.print(a[i]); 
  } 
}

//listing 21
// Use an inner class. 
class Outer {  
  int nums[]; 
 
  Outer(int n[]) { 
    nums = n; 
  } 
  
  void analyze() {  
    Inner inOb = new Inner();  
 
    System.out.println("Minimum: " + inOb.min());  
    System.out.println("Maximum: " + inOb.max());  
    System.out.println("Average: " + inOb.avg());  
  }  
  
  // This is an innner class.  
  class Inner {  
    int min() { 
      int m = nums[0]; 
      for(int i=1; i < nums.length; i++)  
        if(nums[i] < m) m = nums[i]; 
 
      return m; 
    } 
             
    int max() { 
      int m = nums[0]; 
      for(int i=1; i < nums.length; i++)  
        if(nums[i] > m) m = nums[i]; 
 
      return m; 
    } 
             
    int avg() { 
      int a = 0; 
      for(int i=0; i < nums.length; i++)  
        a += nums[i]; 
 
      return a / nums.length; 
    } 
  }  
}  
  
class NestedClassDemo {  
  public static void main(String args[]) {  
    int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 }; 
    Outer outOb = new Outer(x);  
 
    outOb.analyze(); 
  }  
}

//listing 22
// Use ShowBits as a local class.  
class LocalClassDemo {  
  public static void main(String args[]) {  
 
    // An inner class version of ShowBits. 
    class ShowBits {  
      int numbits;  
    
      ShowBits(int n) {  
        numbits = n;  
      }  
  
      void show(long val) {  
        long mask = 1;  
  
        // left-shit a 1 into the proper position  
        mask <<= numbits-1;  
   
        int spacer = 0;  
        for(; mask != 0; mask >>>= 1) {  
          if((val & mask) != 0) System.out.print("1");  
          else System.out.print("0");  
          spacer++;  
          if((spacer % 8) == 0) {  
            System.out.print(" ");  
            spacer = 0;  
          }  
        }  
        System.out.println();  
      }  
    }  
  
     
    for(byte b = 0; b < 10; b++) { 
      ShowBits byteval = new ShowBits(8);  
 
      System.out.print(b + " in binary: "); 
      byteval.show(b);  
    } 
  }  
}

//listing 23
// Demonstrate variable-length arguments. 
class VarArgs { 
 
  // vaTest() uses a vararg. 
  static void vaTest(int ... v) { 
    System.out.println("Number of args: " + v.length); 
    System.out.println("Contents: "); 
 
    for(int i=0; i < v.length; i++) 
      System.out.println("  arg " + i + ": " + v[i]); 
 
    System.out.println(); 
  } 
 
  public static void main(String args[])  
  { 
 
    // Notice how vaTest() can be called with a 
    // variable number of arguments. 
    vaTest(10);      // 1 arg 
    vaTest(1, 2, 3); // 3 args 
    vaTest();        // no args 
  } 
}

//listing 24
// Use varargs with standard arguments.  
class VarArgs2 {  
  
  // Here, msg is a normal parameter and v is a  
  // varargs parameter.  
  static void vaTest(String msg, int ... v) {  
    System.out.println(msg + v.length);  
    System.out.println("Contents: ");  
  
    for(int i=0; i < v.length; i++)  
      System.out.println("  arg " + i + ": " + v[i]);  
  
    System.out.println();  
  }  
  
  public static void main(String args[])   
  {  
    vaTest("One vararg: ", 10);  
    vaTest("Three varargs: ", 1, 2, 3);   
    vaTest("No varargs: ");   
  }  
}

//listing 25
// Varargs and overloading.  
class VarArgs3 {  
  
  static void vaTest(int ... v) {  
    System.out.println("vaTest(int ...): " + 
                       "Number of args: " + v.length);  
    System.out.println("Contents: ");  
  
    for(int i=0; i < v.length; i++)  
      System.out.println("  arg " + i + ": " + v[i]);  
  
    System.out.println();  
  }  
  
  static void vaTest(boolean ... v) {  
    System.out.println("vaTest(boolean ...): " + 
                       "Number of args: " + v.length);  
    System.out.println("Contents: ");  
  
    for(int i=0; i < v.length; i++)  
      System.out.println("  arg " + i + ": " + v[i]);  
  
    System.out.println();  
  }  
  
  static void vaTest(String msg, int ... v) {  
    System.out.println("vaTest(String, int ...): " + 
                       msg + v.length);  
    System.out.println("Contents: ");  
  
    for(int i=0; i < v.length; i++)  
      System.out.println("  arg " + i + ": " + v[i]);  
  
    System.out.println();  
  }  
  
  public static void main(String args[])   
  {  
    vaTest(1, 2, 3);   
    vaTest("Testing: ", 10, 20);  
    vaTest(true, false, false);  
  }  
}

//listing 26
// Varargs, overloading, and ambiguity.  
//  
// This program contains an error and will  
// not compile!  
class VarArgs4 {  
 
  // Use an int vararg parameter.  
  static void vaTest(int ... v) {  
    // ... 
  }  
  
  // Use a boolean vararg parameter.  
  static void vaTest(boolean ... v) {  
    // ... 
  }  
  
  
  public static void main(String args[])   
  {  
    vaTest(1, 2, 3);  // OK  
    vaTest(true, false, false); // OK  
  
    vaTest(); // Error: Ambiguous!  
  }  
}

