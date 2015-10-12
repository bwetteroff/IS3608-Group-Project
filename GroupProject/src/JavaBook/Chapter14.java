//listing 1
// Demonstrate two simple lambda expressions. 
 
// A functional interface. 
interface MyValue { 
  double getValue();  
} 
 
// Another functional interface. 
interface MyParamValue { 
  double getValue(double v);  
} 
 
class LambdaDemo { 
  public static void main(String args[]) 
  { 
    MyValue myVal;  // declare an interface reference 
 
    // Here, the lambda expression is simply a constant expression. 
    // When it is assigned to myVal, a class instance is 
    // constructed in which the lambda expression implements 
    // the getValue() method in MyValue. 
    myVal = () -> 98.6; 
 
    // Call getValue(), which is provided by the previously assigned 
    // lambda expression. 
    System.out.println("A constant value: " + myVal.getValue()); 
 
    // Now, create a parameterized lambda expression and assign it to 
    // a MyParamValue reference. This lambda expression returns 
    // the reciprocal of its argument. 
    MyParamValue myPval = (n) -> 1.0 / n; 
 
    // Call getValue(v) through the myPval reference. 
    System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));     
    System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));     
 
    // A lambda expression must be compatible with the method 
    // defined by the functional interface. Therefore, these won't work: 
//  myVal = () -> "three"; // Error! String not compatible with double! 
//  myPval = () -> Math.random(); // Error! Parameter required! 
  } 
}

//listing 2
// Use the same functional interface with three different lambda expressions. 
 
// A functional interface that takes two int parameters and returns 
// a boolean result. 
interface NumericTest { 
  boolean test(int n, int m); 
} 
 
class LambdaDemo2 { 
  public static void main(String args[]) 
  { 
    // This lambda expression determines if one number is  
    // a factor of another. 
    NumericTest isFactor = (n, d) -> (n % d) == 0; 
 
    if(isFactor.test(10, 2)) 
      System.out.println("2 is a factor of 10"); 
    if(!isFactor.test(10, 3)) 
      System.out.println("3 is not a factor of 10");   
    System.out.println(); 
 
    // This lambda expression returns true if the first 
    // argument is less than the second. 
    NumericTest lessThan = (n, m) -> (n < m); 
 
    if(lessThan.test(2, 10)) 
      System.out.println("2 is less than 10");   
    if(!lessThan.test(10, 2)) 
      System.out.println("10 is not less than 2"); 
    System.out.println(); 
 
    // This lambda expression returns true if the absolute 
    // values of the arguments are equal. 
    NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m); 
 
    if(absEqual.test(4, -4)) 
      System.out.println("Absolute values of 4 and -4 are equal."); 
    if(!lessThan.test(4, -5)) 
      System.out.println("Absolute values of 4 and -5 are not equal.");   
    System.out.println(); 
  } 
}

//listing 3
// A functional interface that tests two strings. 
interface StringTest { 
  boolean test(String aStr, String bStr); 
} 
 
class LambdaDemo3 { 
  public static void main(String args[]) 
  { 
    // This lambda expression determines if one string is  
    // part of another. 
    StringTest isIn = (a, b) -> a.indexOf(b) != -1; 
 
    String str = "This is a test"; 
 
    System.out.println("Testing string: " + str); 
 
    if(isIn.test(str, "is a")) 
      System.out.println("'is a' found."); 
    else 
      System.out.println("'is a' not found."); 
 
    if(isIn.test(str, "xyz")) 
      System.out.println("'xyz' Found"); 
    else 
     System.out.println("'xyz' not found"); 
  } 
}

//listing 4
// A block lambda that finds the smallest positive factor 
// of an int value. 
 
interface NumericFunc { 
  int func(int n); 
} 
 
class BlockLambdaDemo { 
  public static void main(String args[]) 
  { 
 
    // This block lambda returns the smallest positive factor of a value. 
    NumericFunc smallestF = (n) ->  { 
      int result = 1; 
 
      // Get absolute value of n. 
      n =  n < 0 ? -n : n; 
 
      for(int i=2; i <= n/i; i++) 
        if((n % i) ==0) { 
          result = i; 
          break; 
      } 
 
      return result; 
    }; 
 
    System.out.println("Smallest factor of 12 is " + smallestF.func(12)); 
    System.out.println("Smallest factor of 11 is " + smallestF.func(11)); 
  } 
}

//listing 5
// Use a generic functional interface. 
 
// A generic functional interface with two parameters 
// that returns a boolean result. 
interface SomeTest<T> { 
  boolean test(T n, T m); 
} 
 
class GenericFunctionalInterfaceDemo { 
  public static void main(String args[]) 
  { 
    // This lambda expression determines if one integer is  
    // a factor of another. 
    SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0; 
 
    if(isFactor.test(10, 2)) 
      System.out.println("2 is a factor of 10"); 
    System.out.println(); 
 
    // The next lambda expression determines if one Double is  
    // a factor of another. 
    SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0; 
 
    if(isFactorD.test(212.0, 4.0)) 
      System.out.println("4.0 is a factor of 212.0"); 
    System.out.println(); 
 
    // This lambda expression determines if one string is  
    // part of another. 
    SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1; 
 
    String str = "Generic Functional Interface"; 
 
    System.out.println("Testing string: " + str); 
 
    if(isIn.test(str, "face")) 
      System.out.println("'face' is found."); 
    else 
      System.out.println("'face' not found."); 
  } 
}

//listing 6
// Use a lambda expression as an argument to a method. 
 
interface StringFunc { 
  String func(String str); 
} 
 
class LambdaArgumentDemo { 
 
  // This method has a functional interface as the type of its 
  // first parameter. Thus, it can be passed a reference to any 
  // instance of that interface, including an instance created 
  // by a lambda expression. The second parameter specifies the 
  // string to operate on. 
  static String changeStr(StringFunc sf, String s) { 
    return sf.func(s); 
  } 
 
  public static void main(String args[]) 
  { 
    String inStr = "Lambda Expressions Expand Java"; 
    String outStr; 
 
    System.out.println("Here is input string: " + inStr); 
 
    // Define a lambda expression that reverses the contents 
    // of a string and assign it to a StringFunc reference variable. 
    StringFunc reverse = (str) ->  { 
      String result = ""; 
 
      for(int i = str.length()-1; i >= 0; i--) 
        result += str.charAt(i); 
 
      return result; 
    }; 
 
    // Pass reverse to the first argument to changeStr(). 
    // Pass the input string as the second argument. 
    outStr = changeStr(reverse, inStr); 
    System.out.println("The string reversed: " + outStr); 
 
 
    // This lambda expression replaces spaces with hyphens. 
    // It is embedded directly in the call to changeStr(). 
    outStr = changeStr((str) -> str.replace(' ', '-'), inStr); 
    System.out.println("The string with spaces replaced: " + outStr); 
 
    // This block lambda inverts the case of the characters in the  
    // string. It is also embedded directly in the call to changeStr(). 
    outStr = changeStr((str) -> { 
                         String result = ""; 
                         char ch; 
 
                         for(int i = 0; i < str.length(); i++ ) { 
                           ch = str.charAt(i); 
                           if(Character.isUpperCase(ch)) 
                             result += Character.toLowerCase(ch); 
                           else  
                             result += Character.toUpperCase(ch); 
                         } 
                         return result; 
                       }, inStr); 
 
    System.out.println("The string in reversed case: " + outStr); 
  } 
}

//listing 7
// An example of capturing a local variable from the enclosing scope. 
 
interface MyFunc { 
  int func(int n); 
} 
 
class VarCapture { 
  public static void main(String args[]) 
  { 
    // A local variable that can be captured. 
    int num = 10; 
 
    MyFunc myLambda = (n) ->  { 
      // This use of num is OK. It does not modify num. 
      int v = num + n; 
 
      // However, the following is illegal because it attempts  
      // to modify the value of num. 
//    num++; 
 
      return v; 
    }; 
 
    // Use the lambda. This will display 18. 
    System.out.println(myLambda.func(8)); 
 
    // The following line would also cause an error, because 
    // it would remove the effectively final status from num. 
//  num = 9; 
  } 
}

//listing 8
import java.io.*; 
 
interface MyIOAction { 
  boolean ioAction(Reader rdr) throws IOException; 
} 
 
class LambdaExceptionDemo { 
 
  public static void main(String args[]) 
  { 
    double[] values  = { 1.0, 2.0, 3.0, 4.0 }; 
 
    // This block lambda could throw an IOException. 
    // Thus, IOException must be specified in a throws 
    // clause of ioAction() in MyIOAction. 
    MyIOAction myIO = (rdr) ->  { 
      int ch = rdr.read(); // could throw IOException 
      // ... 
      return true; 
    }; 
  } 
}

//listing 9
// Demonstrate a method reference for a static method. 
 
// A functional interface for numeric predicates that operate 
// on integer values. 
interface IntPredicate { 
  boolean test(int n); 
} 
 
// This class defines three static methods that check an integer 
// against some condition. 
class MyIntPredicates { 
  // A static method that returns true if a number is prime. 
  static boolean isPrime(int n) { 
 
    if(n < 2) return false; 
 
    for(int i=2; i <= n/i; i++) { 
      if((n % i) == 0)  
        return false; 
    } 
    return true; 
  } 
 
  // A static method that returns true if a number is even. 
  static boolean isEven(int n) { 
    return (n % 2) == 0; 
  } 
 
  // A static method that returns true if a number is positive. 
  static boolean isPositive(int n) { 
    return n > 0; 
  } 
}     
 
class MethodRefDemo { 
 
  // This method has a functional interface as the type of its 
  // first parameter. Thus, it can be passed a reference to any 
  // instance of that interface, including one created by a 
  // method reference. 
  static boolean numTest(IntPredicate p, int v) { 
    return p.test(v); 
  } 
 
  public static void main(String args[]) 
  { 
    boolean result; 
     
    // Here, a method reference to isPrime is passed to numTest(). 
    result = numTest(MyIntPredicates::isPrime, 17); 
    if(result) System.out.println("17 is prime."); 
 
    // Next, a method reference to isEven is used. 
    result = numTest(MyIntPredicates::isEven, 12); 
    if(result) System.out.println("12 is even.");  
 
    // Now, a method reference to isPositive is passed. 
    result = numTest(MyIntPredicates::isPositive, 11); 
    if(result) System.out.println("11 is positive."); 
  } 
}

//listing 10
// Use a method reference to an instance method. 
 
// A functional interface for numeric predicates that operate 
// on integer values. 
interface IntPredicate { 
  boolean test(int n); 
} 
 
// This class stores an int value and defines the instance 
// method isFactor(), which returns true if its argument 
// is a factor of the stored value. 
class MyIntNum { 
  private int v; 
 
  MyIntNum(int x) { v = x; } 
 
  int getNum() { return v; } 
 
  // Return true if n is a factor of v. 
  boolean isFactor(int n) { 
    return (v % n) == 0; 
  } 
}     
 
class MethodRefDemo2 { 
 
  public static void main(String args[]) 
  { 
    boolean result; 
 
    MyIntNum myNum = new MyIntNum(12); 
    MyIntNum myNum2 = new MyIntNum(16); 
     
    // Here, a method reference to isFactor on myNum is created. 
    IntPredicate ip = myNum::isFactor; 
 
    // Now, it is used to call isFactor() via test(). 
    result = ip.test(3); 
    if(result) System.out.println("3 is a factor of " + myNum.getNum()); 
 
 
    // This time, a method reference to isFactor on myNum2 is created. 
    // and used to call isFactor() via test(). 
    ip = myNum2::isFactor; 
    result = ip.test(3); 
    if(!result) System.out.println("3 is not a factor of " + myNum2.getNum()); 
  } 
}

//listing 11
// Use an instance method reference to refer to any instance. 
 
// A functional interface for numeric predicates that operate 
// on an object of type MyIntNum and an integer value. 
interface MyIntNumPredicate { 
  boolean test(MyIntNum mv, int n); 
} 
 
// This class stores an int value and defines the instance 
// method isFactor(), which returns true if its argument 
// is a factor of the stored value. 
class MyIntNum { 
  private int v; 
 
  MyIntNum(int x) { v = x; } 
 
  int getNum() { return v; } 
 
  // Return true if n is a factor of v. 
  boolean isFactor(int n) { 
    return (v % n) == 0; 
  } 
}     
 
class MethodRefDemo3 { 
  public static void main(String args[]) 
  { 
    boolean result; 
 
    MyIntNum myNum = new MyIntNum(12); 
    MyIntNum myNum2 = new MyIntNum(16); 
 
    // This makes inp refer to the instance method isFactor(). 
    MyIntNumPredicate inp = MyIntNum::isFactor; 
 
    // The following calls isFactor() on myNum. 
    result = inp.test(myNum, 3); 
    if(result) 
      System.out.println("3 is a factor of " + myNum.getNum()); 
 
    // The following calls isFactor() on myNum2. 
    result = inp.test(myNum2, 3); 
    if(!result) 
      System.out.println("3 is a not a factor of " + myNum2.getNum()); 
  } 
}

//listing 12
// Demonstrate a Constructor reference. 
 
// MyFunc is a functional interface whose method returns 
// a MyClass reference. 
interface MyFunc { 
   MyClass func(String s); 
} 
 
class MyClass { 
  private String str; 
 
  // This constructor takes an argument. 
  MyClass(String s) { str = s; } 
 
  // This is the default constructor. 
  MyClass() { str = ""; } 
 
  // ... 
 
  String getStr() { return str; }   
}     
 
class ConstructorRefDemo { 
  public static void main(String args[]) 
  { 
    // Create a reference to the MyClass constructor. 
    // Because func() in MyFunc takes an argument, new 
    // refers to the parameterized constructor in MyClass, 
    // not the default constructor. 
    MyFunc myClassCons = MyClass::new; 
 
    // Create an instance of MyClass via that constructor reference. 
    MyClass mc = myClassCons.func("Testing"); 
 
    // Use the instance of MyClass just created. 
    System.out.println("str in mc is " + mc.getStr( )); 
  } 
}

//listing 13
// Use the Predicate built-in functional interface. 
 
// Import the Function interface. 
import java.util.function.Predicate; 
 
class UsePredicateInterface { 
  public static void main(String args[]) 
  { 
 
    // This lambda uses Predicate<Integer> to determine 
    // if a number is even. 
    Predicate<Integer> isEven = (n) -> (n %2) == 0; 
 
    if(isEven.test(4)) System.out.println("4 is even"); 
  
    if(!isEven.test(5)) System.out.println("5 is odd"); 
  } 
}

