//listing 1
// Demonstrate a one-dimensional array. 
class ArrayDemo {  
  public static void main(String args[]) {  
    int sample[] = new int[10]; 
    int i;  
  
    for(i = 0; i < 10; i = i+1)  
      sample[i] = i; 
 
    for(i = 0; i < 10; i = i+1)  
      System.out.println("This is sample[" + i + "]: " + 
                          sample[i]);  
  }  
}

//listing 2
// Find the minimum and maximum values in an array. 
class MinMax {  
  public static void main(String args[]) {  
    int nums[] = new int[10]; 
    int min, max; 
 
    nums[0] = 99; 
    nums[1] = -10; 
    nums[2] = 100123; 
    nums[3] = 18; 
    nums[4] = -978; 
    nums[5] = 5623; 
    nums[6] = 463; 
    nums[7] = -9; 
    nums[8] = 287; 
    nums[9] = 49; 
 
    min = max = nums[0]; 
    for(int i=1; i < 10; i++) { 
      if(nums[i] < min) min = nums[i]; 
      if(nums[i] > max) max = nums[i]; 
    } 
    System.out.println("min and max: " + min + " " + max); 
  }  
}

//listing 3
// Use array initializers. 
class MinMax2 {  
  public static void main(String args[]) {  
    int nums[] = { 99, -10, 100123, 18, -978, 
                   5623, 463, -9, 287, 49 }; 
    int min, max; 
 
    min = max = nums[0]; 
    for(int i=1; i < 10; i++) { 
      if(nums[i] < min) min = nums[i]; 
      if(nums[i] > max) max = nums[i]; 
    } 
    System.out.println("Min and max: " + min + " " + max); 
  }  
}

//listing 4
// Demonstrate an array overrun. 
class ArrayErr {  
  public static void main(String args[]) {  
    int sample[] = new int[10]; 
    int i;  
  
    // generate an array overrun 
    for(i = 0; i < 100; i = i+1)  
      sample[i] = i; 
  }  
}

//listing 5
/* 
   Try This 5-1 
   Demonstrate the Bubble sort. 
*/ 
 
class Bubble {  
  public static void main(String args[]) {  
    int nums[] = { 99, -10, 100123, 18, -978, 
                   5623, 463, -9, 287, 49 }; 
    int a, b, t;  
    int size;  
  
    size = 10; // number of elements to sort  
  
    // display original array  
    System.out.print("Original array is:"); 
    for(int i=0; i < size; i++) 
      System.out.print(" " + nums[i]);  
    System.out.println();  
  
    // This is the bubble sort.  
    for(a=1; a < size; a++)  
      for(b=size-1; b >= a; b--) {  
        if(nums[b-1] > nums[b]) { // if out of order  
          // exchange elements   
          t = nums[b-1];  
          nums[b-1] = nums[b];  
          nums[b] = t;  
        }  
      }  
  
    // display sorted array  
    System.out.print("Sorted array is:");  
    for(int i=0; i < size; i++) 
      System.out.print(" " + nums[i]);  
    System.out.println(); 
  } 
}

//listing 6
// Demonstrate a two-dimensional array.  
class TwoD {  
  public static void main(String args[]) {  
    int t, i; 
    int table[][] = new int[3][4];  
  
    for(t=0; t < 3; ++t) {  
      for(i=0; i < 4; ++i) {  
        table[t][i] = (t*4)+i+1;  
        System.out.print(table[t][i] + " ");  
      }  
      System.out.println(); 
    }  
  } 
}

//listing 7
// Manually allocate differing size second dimensions.  
class Ragged {  
  public static void main(String args[]) {  
    int riders[][] = new int[7][];  
    riders[0] = new int[10];  
    riders[1] = new int[10];  
    riders[2] = new int[10];  
    riders[3] = new int[10];  
    riders[4] = new int[10];  
    riders[5] = new int[2];  
    riders[6] = new int[2];  
  
    int i, j; 
 
    // fabricate some fake data    
    for(i=0; i < 5; i++)   
      for(j=0; j < 10; j++)  
        riders[i][j] = i + j + 10;  
    for(i=5; i < 7; i++)   
      for(j=0; j < 2; j++)  
        riders[i][j] = i + j + 10;  
 
    System.out.println("Riders per trip during the week:"); 
    for(i=0; i < 5; i++) {  
      for(j=0; j < 10; j++)  
        System.out.print(riders[i][j] + " ");  
      System.out.println();  
    } 
    System.out.println(); 
 
    System.out.println("Riders per trip on the weekend:"); 
    for(i=5; i < 7; i++) {  
      for(j=0; j < 2; j++)  
        System.out.print(riders[i][j] + " ");   
      System.out.println();  
    }  
  }  
}

//listing 8
// Initialize a two-dimensional array. 
class Squares {  
  public static void main(String args[]) {  
    int sqrs[][] = { 
      { 1, 1 }, 
      { 2, 4 }, 
      { 3, 9 }, 
      { 4, 16 }, 
      { 5, 25 }, 
      { 6, 36 }, 
      { 7, 49 }, 
      { 8, 64 }, 
      { 9, 81 }, 
      { 10, 100 } 
    }; 
    int i, j; 
 
    for(i=0; i < 10; i++) {  
      for(j=0; j < 2; j++)  
        System.out.print(sqrs[i][j] + " ");   
      System.out.println();  
    }  
  }  
}

//listing 9
// Assigning array reference variables. 
class AssignARef {  
  public static void main(String args[]) {  
    int i; 
 
    int nums1[] = new int[10]; 
    int nums2[] = new int[10]; 
 
    for(i=0; i < 10; i++) 
      nums1[i] = i; 
 
    for(i=0; i < 10; i++) 
      nums2[i] = -i; 
 
    System.out.print("Here is nums1: "); 
    for(i=0; i < 10; i++) 
      System.out.print(nums1[i] + " ");   
    System.out.println(); 
 
    System.out.print("Here is nums2: "); 
    for(i=0; i < 10; i++) 
      System.out.print(nums2[i] + " ");   
    System.out.println(); 
 
    nums2 = nums1; // now nums2 refers to nums1 
 
    System.out.print("Here is nums2 after assignment: "); 
    for(i=0; i < 10; i++) 
      System.out.print(nums2[i] + " ");   
    System.out.println(); 
 
   // now operate on nums1 array through nums2 
   nums2[3] = 99; 
 
    System.out.print("Here is nums1 after change through nums2: "); 
    for(i=0; i < 10; i++) 
      System.out.print(nums1[i] + " ");   
    System.out.println(); 
  }  
}

//listing 10
// Use the length array member.  
class LengthDemo {  
  public static void main(String args[]) {  
    int list[] = new int[10];  
    int nums[] = { 1, 2, 3 };  
    int table[][] = { // a variable-length table  
      {1, 2, 3},  
      {4, 5},  
      {6, 7, 8, 9}  
    };  
  
    System.out.println("length of list is " + list.length);  
    System.out.println("length of nums is " + nums.length);  
    System.out.println("length of table is " + table.length);  
    System.out.println("length of table[0] is " + table[0].length);  
    System.out.println("length of table[1] is " + table[1].length);  
    System.out.println("length of table[2] is " + table[2].length);  
    System.out.println(); 
  
    // use length to initialize list  
    for(int i=0; i < list.length; i++)  
      list[i] = i * i;  
  
    System.out.print("Here is list: "); 
    // now use length to display list  
    for(int i=0; i < list.length; i++)  
      System.out.print(list[i] + " ");  
    System.out.println(); 
  }  
}

//listing 11
// Use length variable to help copy an array. 
class ACopy {  
  public static void main(String args[]) {  
    int i; 
    int nums1[] = new int[10]; 
    int nums2[] = new int[10]; 
 
    for(i=0; i < nums1.length; i++) 
      nums1[i] = i; 
 
    // copy nums1 to nums2 
    if(nums2.length >= nums1.length)  
      for(i = 0; i < nums2.length; i++) 
        nums2[i] = nums1[i]; 
 
    for(i=0; i < nums2.length; i++) 
      System.out.print(nums2[i] + " ");   
  } 
}

//listing 12
/* 
   Try This 5-2 
 
   A queue class for characters. 
*/ 
 
class Queue { 
  char q[]; // this array holds the queue 
  int putloc, getloc; // the put and get indices 
 
  Queue(int size) { 
    q = new char[size]; // allocate memory for queue 
    putloc = getloc = 0; 
  } 
 
  // put a characer into the queue 
  void put(char ch) { 
    if(putloc==q.length) { 
      System.out.println(" -- Queue is full."); 
      return; 
    } 
     
    q[putloc++] = ch; 
  } 
 
  // get a character from the queue 
  char get() { 
    if(getloc == putloc) { 
      System.out.println(" -- Queue is empty."); 
      return (char) 0;  
    } 
   
    return q[getloc++]; 
  } 
} 
 
// Demonstrate the Queue class. 
class QDemo { 
  public static void main(String args[]) { 
    Queue bigQ = new Queue(100); 
    Queue smallQ = new Queue(4); 
    char ch; 
    int i; 
 
    System.out.println("Using bigQ to store the alphabet."); 
    // put some numbers into bigQ 
    for(i=0; i < 26; i++) 
      bigQ.put((char) ('A' + i)); 
 
    // retrieve and display elements from bigQ 
    System.out.print("Contents of bigQ: "); 
    for(i=0; i < 26; i++) {  
      ch = bigQ.get(); 
      if(ch != (char) 0) System.out.print(ch); 
    } 
 
    System.out.println("\n"); 
 
 
    System.out.println("Using smallQ to generate erros."); 
    // Now, use smallQ to generate some errors 
    for(i=0; i < 5; i++) { 
      System.out.print("Attempting to store " + 
                       (char) ('Z' - i)); 
 
      smallQ.put((char) ('Z' - i)); 
 
      System.out.println(); 
    } 
    System.out.println(); 
 
    // more errors on smallQ 
    System.out.print("Contents of smallQ: "); 
    for(i=0; i < 5; i++) {  
      ch = smallQ.get(); 
 
      if(ch != (char) 0) System.out.print(ch); 
    } 
  } 
}

//listing 13
// Use a for-each style for loop. 
class ForEach {  
  public static void main(String args[]) {  
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  
    int sum = 0;  
 
    // Use for-each style for to display and sum the values. 
    for(int x : nums) {  
      System.out.println("Value is: " + x); 
      sum += x;  
    }  
 
    System.out.println("Summation: " + sum); 
  }  
}

//listing 14
// The for-each loop is essentially read-only. 
class NoChange {   
  public static void main(String args[]) {   
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };   
  
    for(int x : nums) {   
      System.out.print(x + " ");  
      x = x * 10; // no effect on nums 
    }   
    
    System.out.println(); 
 
    for(int x : nums)  
      System.out.print(x + " ");  
 
    System.out.println(); 
  }   
}

//listing 15
// Use for-each style for on a two-dimensional array.  
class ForEach2 {  
  public static void main(String args[]) {  
    int sum = 0;  
    int nums[][] = new int[3][5];  
  
    // give nums some values  
    for(int i = 0; i < 3; i++)   
      for(int j=0; j < 5; j++)  
        nums[i][j] = (i+1)*(j+1);  
  
    // Use for-each for loop to display and sum the values. 
    for(int x[] : nums) {  
      for(int y : x) { 
        System.out.println("Value is: " + y);  
        sum += y;  
      } 
    }  
    System.out.println("Summation: " + sum);  
  }  
}

//listing 16
// Search an array using for-each style for.  
class Search {  
  public static void main(String args[]) {  
    int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 }; 
    int val = 5;  
    boolean found = false;  
 
    // Use for-each style for to search nums for val. 
    for(int x : nums) {  
      if(x == val) {  
        found = true;  
        break;  
      }  
    }  
  
    if(found)   
      System.out.println("Value found!");  
  }  
}


//listing 17
// Introduce String. 
class StringDemo {  
  public static void main(String args[]) {  
    // declare strings in various ways 
    String str1 = new String("Java strings are objects."); 
    String str2 = "They are constructed various ways."; 
    String str3 = new String(str2); 
 
    System.out.println(str1); 
    System.out.println(str2); 
    System.out.println(str3); 
  }  
}

//listing 18
// Some String operations. 
class StrOps {  
  public static void main(String args[]) {  
    String str1 = 
      "When it comes to Web programming, Java is #1.";  
    String str2 = new String(str1); 
    String str3 = "Java strings are powerful.";  
    int result, idx; 
    char ch; 
 
    System.out.println("Length of str1: " +  
                       str1.length());  
  
    // display str1, one char at a time. 
    for(int i=0; i < str1.length(); i++) 
      System.out.print(str1.charAt(i));  
    System.out.println();  
 
    if(str1.equals(str2))  
      System.out.println("str1 equals str2");  
    else  
      System.out.println("str1 does not equal str2");  
  
    if(str1.equals(str3))  
      System.out.println("str1 equals str3");  
    else  
      System.out.println("str1 does not equal str3");  
 
    result = str1.compareTo(str3); 
    if(result == 0) 
      System.out.println("str1 and str3 are equal"); 
    else if(result < 0) 
      System.out.println("str1 is less than str3"); 
    else 
      System.out.println("str1 is greater than str3"); 
 
 
    // assign a new string to str2 
    str2 = "One Two Three One"; 
 
    idx = str2.indexOf("One"); 
    System.out.println("Index of first occurence of One: " + idx); 
    idx = str2.lastIndexOf("One"); 
    System.out.println("Index of last occurence of One: " + idx); 
     
  }  
}

//listing 19
// Demonstrate String arrays.  
class StringArrays {  
  public static void main(String args[]) {  
    String strs[] = { "This", "is", "a", "test." };  
  
    System.out.println("Original array: ");  
    for(String s : strs)
      System.out.print(s + " ");  
    System.out.println("\n");  
  
    // change a string  
    strs[1] = "was";  
    strs[3] = "test, too!";  
  
    System.out.println("Modified array: "); 
    for(String s : strs)
      System.out.print(s + " ");  
  }  
} 

//listing 20
// Use substring(). 
class SubStr {  
  public static void main(String args[]) {  
    String orgstr = "Java makes the Web move."; 
 
    // construct a substring 
    String substr = orgstr.substring(5, 18); 
 
     
    System.out.println("orgstr: " + orgstr); 
    System.out.println("substr: " + substr); 
 
  }  
}

//listing 21
// Use a string to control a switch statement.

class StringSwitch {
  public static void main(String args[]) {

    String command = "cancel";

    switch(command) {
      case "connect":
        System.out.println("Connecting");
        break;
      case "cancel": 
        System.out.println("Canceling");
        break;
      case "disconnect":
        System.out.println("Disconnecting");
        break;
      default: 
        System.out.println("Command Error!");
        break;
    }
  }
}

//listing 22
// Display all command-line information. 
class CLDemo {  
  public static void main(String args[]) { 
    System.out.println("There are " + args.length + 
                       " command-line arguments."); 
 
    System.out.println("They are: "); 
    for(int i=0; i<args.length; i++)  
      System.out.println("arg[" + i + "]: " + args[i]);  
  }  
}

//listing 23
// A simple automated telphone directory. 
class Phone {  
  public static void main(String args[]) {  
    String numbers[][] = { 
      { "Tom", "555-3322" }, 
      { "Mary", "555-8976" }, 
      { "Jon", "555-1037" }, 
      { "Rachel", "555-1400" } 
    }; 
    int i; 
 
    if(args.length != 1) 
      System.out.println("Usage: java Phone <name>"); 
    else { 
      for(i=0; i<numbers.length; i++) { 
        if(numbers[i][0].equals(args[0])) { 
          System.out.println(numbers[i][0] + ": " + 
                             numbers[i][1]); 
          break; 
        } 
      } 
      if(i == numbers.length) 
        System.out.println("Name not found."); 
    } 
  }  
}

//listing 24
// Uppercase letters. 
class UpCase {  
  public static void main(String args[]) { 
    char ch;  
  
    for(int i=0; i < 10; i++) { 
      ch = (char) ('a' + i);  
      System.out.print(ch); 
 
      // This statement turns off the 6th bit.   
      ch = (char) ((int) ch & 65503); // ch is now uppercase  
  
      System.out.print(ch + " ");  
    } 
  } 
}

//listing 25
// Display the bits within a byte.  
class ShowBits { 
  public static void main(String args[]) { 
    int t; 
    byte val;  
  
    val = 123; 
    for(t=128; t > 0; t = t/2) { 
      if((val & t) != 0) System.out.print("1 ");  
      else System.out.print("0 ");  
    } 
  } 
}

//listing 26
// Lowercase letters. 
class LowCase {  
  public static void main(String args[]) { 
    char ch;  
  
    for(int i=0; i < 10; i++) { 
      ch = (char) ('A' + i);  
      System.out.print(ch); 
 
      // This statement turns on the 6th bit.   
      ch = (char) ((int) ch | 32); // ch is now lowercase  
  
      System.out.print(ch + " ");  
    } 
  } 
}

//listing 27
// Use XOR to encode and decode a message. 
class Encode {  
  public static void main(String args[]) { 
    String msg = "This is a test";  
    String encmsg = ""; 
    String decmsg = ""; 
    int key = 88; 
 
    System.out.print("Original message: "); 
    System.out.println(msg); 
 
    // encode the message 
    for(int i=0; i < msg.length(); i++) 
      encmsg = encmsg + (char) (msg.charAt(i) ^ key); 
 
    System.out.print("Encoded message: "); 
    System.out.println(encmsg); 
 
    // decode the message 
    for(int i=0; i < msg.length(); i++) 
      decmsg = decmsg + (char) (encmsg.charAt(i) ^ key); 
    
    System.out.print("Decoded message: "); 
    System.out.println(decmsg); 
  } 
}

//listing 28
// Demonstrate the bitwise NOT. 
class NotDemo { 
  public static void main(String args[]) { 
    byte b = -34; 
 
    for(int t=128; t > 0; t = t/2) { 
      if((b & t) != 0) System.out.print("1 ");  
      else System.out.print("0 ");  
    } 
    System.out.println(); 
 
    // reverse all bits 
    b = (byte) ~b; 
 
    for(int t=128; t > 0; t = t/2) { 
      if((b & t) != 0) System.out.print("1 ");  
      else System.out.print("0 ");  
    } 
  } 
} 

//listing 29
// Demonstrate the shift << and >> operators. 
class ShiftDemo { 
  public static void main(String args[]) { 
    int val = 1; 
 
    for(int i = 0; i < 8; i++) {  
      for(int t=128; t > 0; t = t/2) { 
        if((val & t) != 0) System.out.print("1 ");  
        else System.out.print("0 ");  
      } 
      System.out.println(); 
      val = val << 1; // left shift 
    } 
    System.out.println(); 
 
    val = 128; 
    for(int i = 0; i < 8; i++) {  
      for(int t=128; t > 0; t = t/2) { 
        if((val & t) != 0) System.out.print("1 ");  
        else System.out.print("0 ");  
      } 
      System.out.println(); 
      val = val >> 1; // right shift 
    } 
  } 
}

//listing 30
/* 
   Try This 5-3 
 
   A class that displays the binary representation of a value. 
*/ 
 
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
 
// Demonstrate ShowBits. 
class ShowBitsDemo { 
  public static void main(String args[]) { 
    ShowBits b = new ShowBits(8); 
    ShowBits i = new ShowBits(32); 
    ShowBits li = new ShowBits(64); 
 
    System.out.println("123 in binary: "); 
    b.show(123); 
 
    System.out.println("\n87987 in binary: "); 
    i.show(87987); 
 
    System.out.println("\n237658768 in binary: "); 
    li.show(237658768); 
 
 
    // you can also show low-order bits of any integer 
    System.out.println("\nLow order 8 bits of 87987 in binary: "); 
    b.show(87987);  
  } 
}

//listing 31
// Prevent a division by zero using the ?. 
class NoZeroDiv { 
  public static void main(String args[]) { 
    int result; 
 
    for(int i = -5; i < 6; i++) { 
      result = i != 0 ? 100 / i : 0; 
      if(i != 0)  
        System.out.println("100 / " + i + " is " + result); 
    } 
  } 
} 

//listing 32
// Prevent a division by zero using the ?. 
class NoZeroDiv2 { 
  public static void main(String args[]) { 
 
    for(int i = -5; i < 6; i++)  
      if(i != 0 ? true : false)  
        System.out.println("100 / " + i + 
                           " is " + 100 / i); 
  } 
}

