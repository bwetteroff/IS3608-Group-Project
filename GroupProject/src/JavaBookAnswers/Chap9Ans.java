package JavaBookAnswers;

//listing 1
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
class Stack {    
  private char stck[]; // this array holds the stack   
  private int tos;  // top of stack   
    
  // Construct an empty Stack given its size.   
  Stack(int size) {    
    stck = new char[size]; // allocate memory for stack   
    tos = 0;    
  }    
   
  // Construct a Stack from a Stack.   
  Stack(Stack ob) {   
    tos = ob.tos;   
    stck = new char[ob.stck.length];   
   
    // copy elements   
    for(int i=0; i < tos; i++)   
      stck[i] = ob.stck[i];   
  }   
   
  // Construct a stack with initial values.   
  Stack(char a[]) {   
    stck = new char[a.length];   
   
    for(int i = 0; i < a.length; i++) {   
      try {  
        push(a[i]);   
      }   
      catch(StackFullException exc) {  
        System.out.println(exc);  
      }  
    }       
  }   
      
  // Push characters onto the stack.   
  void push(char ch) throws StackFullException {    
    if(tos==stck.length)  
      throw new StackFullException(stck.length);  
 
    stck[tos] = ch;   
    tos++;   
  }    
    
  // Pop a character from the stack.   
  char pop() throws StackEmptyException {    
    if(tos==0)    
      throw new StackEmptyException();  
      
    tos--;    
    return stck[tos];    
  }    
}

