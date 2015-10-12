//listing 1
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
      push(a[i]); 
    }     
  } 
 
    
  // Push characters onto the stack. 
  void push(char ch) {  
    if(tos==stck.length) {  
      System.out.println(" -- Stack is full.");  
      return;  
    }  
      
    stck[tos] = ch; 
    tos++; 
  }  
  
  // Pop a character from the stack. 
  char pop() {  
    if(tos==0) {  
      System.out.println(" -- Stack is empty.");  
      return (char) 0;   
    }  
    
    tos--;  
    return stck[tos];  
  }  
}  
  
// Demonstrate the Stack class.  
class SDemo {  
  public static void main(String args[]) {  
    // construct 10-element empty stack 
    Stack stk1 = new Stack(10);  
 
    char name[] = {'T', 'o', 'm'};  
   
    // construct stack from array 
    Stack stk2 = new Stack(name);  
 
    char ch;  
    int i;  
  
    // put some characters into stk1  
    for(i=0; i < 10; i++)  
      stk1.push((char) ('A' + i));  
 
    // construct stack from another stack 
    Stack stk3 = new Stack(stk1); 
 
    //show the stacks. 
    System.out.print("Contents of stk1: ");  
    for(i=0; i < 10; i++) {   
      ch = stk1.pop();  
      System.out.print(ch);  
    }  
  
    System.out.println("\n");  
  
    System.out.print("Contents of stk2: ");  
    for(i=0; i < 3; i++) {   
      ch = stk2.pop();  
      System.out.print(ch);  
    }  
  
    System.out.println("\n");  
  
    System.out.print("Contents of stk3: ");  
    for(i=0; i < 10; i++) {   
      ch = stk3.pop();  
      System.out.print(ch);  
    }  
  }  
}

//listing 2
void swap(Test ob1, Test ob2) { 
  int t; 
 
  t = ob1.a; 
  ob1.a = ob2.a; 
  ob2.a = t; 
}

//listing 3
// Display a string backwards using recursion. 
class Backwards { 
  String str; 
 
  Backwards(String s) { 
    str = s; 
  } 
 
  void backward(int idx) { 
    if(idx != str.length()-1) backward(idx+1); 
 
    System.out.print(str.charAt(idx)); 
  } 
} 
 
class BWDemo { 
  public static void main(String args[]) { 
    Backwards s = new Backwards("This is a test"); 
 
    s.backward(0); 
  } 
}

//listing 4
class SumIt {
  int sum(int ... n) {
    int result = 0;

    for(int i = 0; i < n.length; i++)
      result += n[i];

    return result;
  }
}

class SumDemo {
  public static void main(String args[]) {

    SumIt siObj = new SumIt();

    int total = siObj.sum(1, 2, 3);
    System.out.println("Sum is " + total);

    total = siObj.sum(1, 2, 3, 4, 5);
    System.out.println("Sum is " + total);
  }
}
