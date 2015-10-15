package JavaBookAnswers;

//listing 1
interface NumericFunc {  
  int func(int n);  
}  
  
class FactorialLambdaDemo {  
  public static void main(String args[])  
  {  
  
    // This block lambda computes the factorial of an int value.  
    NumericFunc factorial = (n) ->  {  
      int result = 1;  
  
      for(int i=1; i <= n; i++)  
        result = i * result;  
  
      return result;  
    };  
  
    System.out.println("The factoral of 3 is " + factorial.func(3)); 
    System.out.println("The factoral of 3 is " + factorial.func(5));  
    System.out.println("The factoral of 5 is " + factorial.func(9));  
  }  
}

//listing 2
interface MyFunc<T> {  
  T func(T n);  
}  
  
class FactorialLambdaDemo {  
  public static void main(String args[])  
  {  
  
    // This block lambda computes the factorial of an int value.  
    MyFunc<Integer> factorial = (n) ->  {  
      int result = 1;  
  
      for(int i=1; i <= n; i++)  
        result = i * result;  
  
      return result;  
    };  
  
    System.out.println("The factoral of 3 is " + factorial.func(3)); 
    System.out.println("The factoral of 3 is " + factorial.func(5));  
    System.out.println("The factoral of 5 is " + factorial.func(9));  
  }  
}

//listing 3
StringFunc remove = (str) ->  { 
  String result = ""; 
 
  for(int i = 0; i < str.length(); i++) 
    if(str.charAt(i) != ' ') result += str.charAt(i); 
 
  return result; 
};

//listing 4
class MyIntNum { 
  private int v; 
 
  MyIntNum(int x) { v = x; } 
 
  int getNum() { return v; } 
 
  // Return true if n is a factor of v. 
  boolean isFactor(int n) { 
    return (v % n) == 0; 
  } 
 
  boolean hasCommonFactor(int n) { 
    for(int i=2; i < v/i; i++)  
      if( ((v % i) == 0) && ((n % i) == 0) ) return true; 
 
    return false; 
  } 
}

