//listing 1
// A generic stack. 
 
interface IGenStack<T> { 
  void push(T obj) throws StackFullException; 
  T pop() throws StackEmptyException; 
} 
 
// An exception for stack-full errors.   
class StackFullException extends Exception {   
  int size;   
     
  StackFullException(int s) { size = s; }   
   
  public String toString() {   
   return "\nStack is full. Maximum size is " +   
           size;   
  }   
}   
   
// An exception for stack-empty errors.   
class StackEmptyException extends Exception { 
   
  public String toString() {   
   return "\nStack is empty.";   
  }   
}   
   
// A stack class for characters.     
class GenStack<T> implements IGenStack<T> {  
  private T stck[]; // this array holds the stack    
  private int tos;  // top of stack    
     
  // Construct an empty Stack given its size.    
  GenStack(T[] stckArray) {     
    stck = stckArray; 
    tos = 0;     
  }     
    
  // Construct a Stack from a Stack.    
  GenStack(T[] stckArray, GenStack<T> ob) { 
 
    tos = ob.tos;    
    stck = stckArray; 
 
    try { 
      if(stck.length < ob.stck.length) 
        throw new StackFullException(stck.length); 
    } 
    catch(StackFullException exc) {   
      System.out.println(exc);   
    }   
    
    // Copy elements. 
    for(int i=0; i < tos; i++)    
      stck[i] = ob.stck[i];    
  }    
    
  // Construct a stack with initial values.    
  GenStack(T[] stckArray, T[] a) {    
    stck = stckArray; 
    
    for(int i = 0; i < a.length; i++) {    
      try {   
        push(a[i]);    
      }    
      catch(StackFullException exc) {   
        System.out.println(exc);   
      }   
    }        
  }    
       
  // Push objects onto the stack.    
  public void push(T obj) throws StackFullException {     
    if(tos==stck.length)   
      throw new StackFullException(stck.length);   
  
    stck[tos] = obj;    
    tos++;    
  }     
     
  // Pop an object from the stack.    
  public T pop() throws StackEmptyException {     
    if(tos==0)     
      throw new StackEmptyException();   
       
    tos--;     
    return stck[tos];     
  }     
} 
 
// Demonstrate the Stack class.   
class GenStackDemo {   
  public static void main(String args[]) {   
    // Construct 10-element empty Integer stack. 
    Integer iStore[] = new Integer[10]; 
    GenStack<Integer> stk1 = new GenStack<Integer>(iStore); 
  
    // Construct stack from array. 
    String name[] = {"One", "Two", "Three"};   
    String strStore[] = new String[3]; 
    GenStack<String> stk2 = 
        new GenStack<String>(strStore, name); 
  
    String str; 
    int n;   
 
    try { 
   
      // Put some values into stk1. 
      for(int i=0; i < 10; i++)   
        stk1.push(i); 
    } catch(StackFullException exc) { 
      System.out.println(exc); 
    } 
  
    // Construct stack from another stack. 
    String strStore2[] = new String[3]; 
    GenStack<String> stk3 =  
        new GenStack<String>(strStore2, stk2);  
 
    try {  
      // Show the stacks.  
      System.out.print("Contents of stk1: ");   
      for(int i=0; i < 10; i++) {    
        n = stk1.pop();   
        System.out.print(n + " ");   
      }   
   
      System.out.println("\n");   
   
      System.out.print("Contents of stk2: ");   
      for(int i=0; i < 3; i++) {    
        str = stk2.pop();   
        System.out.print(str + " "); 
      }   
   
      System.out.println("\n");   
   
      System.out.print("Contents of stk3: ");   
      for(int i=0; i < 3; i++) {    
        str = stk3.pop(); 
        System.out.print(str + " "); 
      }   
 
    } catch(StackEmptyException exc) { 
      System.out.println(exc); 
    } 
 
    System.out.println(); 
  }   
}

