//listing 1
// A short package demonstration.  
package bookpack;  
  
class Book {  
  private String title;  
  private String author;  
  private int pubDate;  
  
  Book(String t, String a, int d) {  
    title = t;  
    author = a;  
    pubDate = d;  
  }  
  
  void show() {  
    System.out.println(title);  
    System.out.println(author);  
    System.out.println(pubDate); 
    System.out.println(); 
  }  
}  
  
class BookDemo {  
  public static void main(String args[]) {  
    Book books[] = new Book[5];  
  
    books[0] = new Book("Java: A Beginner's Guide", 
                        "Schildt", 2014);  
    books[1] = new Book("Java: The Complete Reference", 
                        "Schildt", 2014); 
    books[2] = new Book("The Art of Java", 
                        "Schildt and Holmes", 2003); 
    books[3] = new Book("Red Storm Rising", 
                         "Clancy", 1986);  
    books[4] = new Book("On the Road", 
                        "Kerouac", 1955);  
  
    for(int i=0; i < books.length; i++) books[i].show();  
  } 
}

//listing 2
// Book recoded for public access. 
package bookpack; 
 
public class Book {  
  private String title;  
  private String author;  
  private int pubDate; 
 
  // Now public. 
  public Book(String t, String a, int d) {  
    title = t;  
    author = a;  
    pubDate = d;  
  } 
 
  // Now public. 
  public void show() {  
    System.out.println(title);  
    System.out.println(author);  
    System.out.println(pubDate);   
    System.out.println(); 
  }  
}

//listing 3
// This class is in package bookpackext. 
package bookpackext; 
 
// Use the Book Class from bookpack. 
class UseBook {  
  public static void main(String args[]) {  
    bookpack.Book books[] = new bookpack.Book[5]; 
 
    books[0] = new bookpack.Book("Java: A Beginner's Guide", 
                       "Schildt", 2014);  
    books[1] = new bookpack.Book("Java: The Complete Reference", 
                       "Schildt", 2014); 
    books[2] = new bookpack.Book("The Art of Java", 
                       "Schildt and Holmes", 2003); 
    books[3] = new bookpack.Book("Red Storm Rising", 
                        "Clancy", 1986);  
    books[4] = new bookpack.Book("On the Road", 
                       "Kerouac", 1955);  
  
    for(int i=0; i < books.length; i++) books[i].show();  
  } 
}

//listing 4
// Make the instance variables in Book protected. 
package bookpack; 
 
public class Book { 
  // these are now protected 
  protected String title;  
  protected String author;  
  protected int pubDate; 
 
  public Book(String t, String a, int d) {  
    title = t;  
    author = a;  
    pubDate = d;  
  } 
 
   public void show() {  
    System.out.println(title);  
    System.out.println(author);  
    System.out.println(pubDate);   
    System.out.println(); 
  }  
}

//listing 5
// Demonstrate Protected.  
package bookpackext; 
 
class ExtBook extends bookpack.Book { 
  private String publisher; 
 
  public ExtBook(String t, String a, int d, String p) {   
    super(t, a, d);  
    publisher = p;  
  } 
 
  public void show() {   
    super.show();   
    System.out.println(publisher);   
    System.out.println();    
  } 
 
  public String getPublisher() { return publisher; }  
  public void setPublisher(String p) { publisher = p; } 
 
  /* These are OK because subclass can access  
     a protected member. */  
  public String getTitle() { return title; }  
  public void setTitle(String t) { title = t; }  
  public String getAuthor() { return author; }  
  public void setAuthor(String a) { author = a; }  
  public int getPubDate() { return pubDate; }  
  public void setPubDate(int d) { pubDate = d; }  
} 
 
class ProtectDemo {   
  public static void main(String args[]) {   
    ExtBook books[] = new ExtBook[5]; 
 
    books[0] = new ExtBook("Java: A Beginner's Guide", 
                      "Schildt", 2014, "McGraw-Hill");  
    books[1] = new ExtBook("Java: The Complete Reference", 
                      "Schildt", 2014, "McGraw-Hill"); 
    books[2] = new ExtBook("The Art of Java", 
                      "Schildt and Holmes", 2003, 
                      "McGraw-Hill"); 
    books[3] = new ExtBook("Red Storm Rising", 
                      "Clancy", 1986, "Putnam");  
    books[4] = new ExtBook("On the Road", 
                      "Kerouac", 1955, "Viking");  
 
    for(int i=0; i < books.length; i++) books[i].show();  
 
    // Find books by author 
    System.out.println("Showing all books by Schildt."); 
    for(int i=0; i < books.length; i++) 
      if(books[i].getAuthor() == "Schildt") 
        System.out.println(books[i].getTitle()); 
 
//    books[0].title = "test title"; // Error -- not accessible  
  }  
}

//listing 6
// Demonstrate import. 
package bookpackext; 
import bookpack.*; 
 
// Use the Book Class from bookpack.  
class UseBook {  
  public static void main(String args[]) {  
    Book books[] = new Book[5];  
  
    books[0] = new Book("Java: A Beginner's Guide", 
                        "Schildt", 2014);  
    books[1] = new Book("Java: The Complete Reference", 
                        "Schildt", 2014); 
    books[2] = new Book("The Art of Java", 
                        "Schildt and Holmes", 2003); 
    books[3] = new Book("Red Storm Rising", 
                         "Clancy", 1986);  
    books[4] = new Book("On the Road", 
                        "Kerouac", 1955);  
  
    for(int i=0; i < books.length; i++) books[i].show();  
  } 
}

//listing 7
public interface Series { 
  int getNext(); // return next number in series 
  void reset(); // restart 
  void setStart(int x); // set starting value 
}

//listing 8
// Implement Series. 
class ByTwos implements Series { 
  int start; 
  int val; 
 
  ByTwos() { 
    start = 0; 
    val = 0; 
  }  
 
  public int getNext() { 
    val += 2; 
    return val; 
  } 
 
  public void reset() { 
    val = start; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
}

//listing 9
class SeriesDemo { 
  public static void main(String args[]) { 
    ByTwos ob = new ByTwos(); 
 
    for(int i=0; i < 5; i++) 
      System.out.println("Next value is " + 
                         ob.getNext()); 
 
    System.out.println("\nResetting"); 
    ob.reset(); 
    for(int i=0; i < 5; i++) 
      System.out.println("Next value is " + 
                         ob.getNext()); 
 
    System.out.println("\nStarting at 100"); 
    ob.setStart(100); 
    for(int i=0; i < 5; i++) 
      System.out.println("Next value is " + 
                         ob.getNext()); 
  } 
}

//listing 10
// Implement Series and add getPrevious(). 
class ByTwos implements Series { 
  int start; 
  int val; 
  int prev; 
 
  ByTwos() { 
    start = 0; 
    val = 0; 
    prev = -2; 
  }  
 
  public int getNext() { 
    prev = val; 
    val += 2; 
    return val; 
  } 
 
  public void reset() { 
    val = start; 
    prev = start-2; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
    prev = x - 2; 
  } 
 
  int getPrevious() { 
    return prev; 
  } 
}

//listing 11
// Implement Series. 
class ByThrees implements Series { 
  int start; 
  int val; 
 
  ByThrees() { 
    start = 0; 
    val = 0; 
  } 
 
  public int getNext() { 
    val += 3; 
    return val; 
  } 
 
  public void reset() { 
    start = 0; 
    val = 0; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
}

//listing 12
// Demonstrate interface references. 
 
class ByTwos implements Series { 
  int start; 
  int val; 
 
  ByTwos() { 
    start = 0; 
    val = 0; 
  }  
 
  public int getNext() { 
    val += 2; 
    return val; 
  } 
 
  public void reset() { 
    val = start; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
} 
 
class ByThrees implements Series { 
  int start; 
  int val; 
 
  ByThrees() { 
    start = 0; 
    val = 0; 
  }  
 
  public int getNext() { 
    val += 3; 
    return val; 
  } 
 
  public void reset() { 
    val = start; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
} 
 
class SeriesDemo2 { 
  public static void main(String args[]) { 
    ByTwos twoOb = new ByTwos(); 
    ByThrees threeOb = new ByThrees(); 
    Series ob; 
 
    for(int i=0; i < 5; i++) { 
      ob = twoOb; 
      System.out.println("Next ByTwos value is " + 
                          ob.getNext()); 
      ob = threeOb; 
      System.out.println("Next ByThrees value is " + 
                          ob.getNext()); 
    } 
  } 
}

//listing 13
// A character queue interface. 
public interface ICharQ {    
  // Put a characer into the queue.    
  void put(char ch); 
 
  // Get a character from the queue.   
  char get(); 
}
 
//listing 14
// A fixed-size queue class for characters.    
class FixedQueue implements ICharQ {    
  private char q[]; // this array holds the queue    
  private int putloc, getloc; // the put and get indices    
    
  // Construct an empty queue given its size.   
  public FixedQueue(int size) {    
    q = new char[size]; // allocate memory for queue    
    putloc = getloc = 0;    
  }    
   
  // Put a characer into the queue.    
  public void put(char ch) {    
    if(putloc==q.length) {    
      System.out.println(" -- Queue is full.");    
      return;    
    }    
        
    q[putloc++] = ch;    
  }    
    
  // Get a character from the queue.   
  public char get() {    
    if(getloc == putloc) {    
      System.out.println(" -- Queue is empty.");    
      return (char) 0;     
    }    
      
    return q[getloc++];    
  }    
}

//listing 15
// A circular queue. 
class CircularQueue implements ICharQ {    
  private char q[]; // this array holds the queue    
  private int putloc, getloc; // the put and get indices    
    
  // Construct an empty queue given its size.   
  public CircularQueue(int size) {    
    q = new char[size+1]; // allocate memory for queue    
    putloc = getloc = 0;    
  }    
   
  // Put a characer into the queue.    
  public void put(char ch) {    
    /* Queue is full if either putloc is one less than 
       getloc, or if putloc is at the end of the array 
       and getloc is at the beginning. */ 
    if(putloc+1==getloc | 
       ((putloc==q.length-1) & (getloc==0))) {    
      System.out.println(" -- Queue is full.");    
      return;    
    }    
        
    q[putloc++] = ch;    
    if(putloc==q.length) putloc = 0; // loop back 

  }    
    
  // Get a character from the queue.   
  public char get() {    
    if(getloc == putloc) {    
      System.out.println(" -- Queue is empty.");    
      return (char) 0;     
    }    
      
    char ch = q[getloc++];
    if(getloc==q.length) getloc = 0; // loop back 
    return ch;    
  }    
}

//listing 16
// A dynamic queue. 
class DynQueue implements ICharQ {    
  private char q[]; // this array holds the queue    
  private int putloc, getloc; // the put and get indices    
    
  // Construct an empty queue given its size.   
  public DynQueue(int size) {    
    q = new char[size]; // allocate memory for queue    
    putloc = getloc = 0;    
  }    
   
  // Put a characer into the queue.    
  public void put(char ch) {    
    if(putloc==q.length) {    
      // increase queue size 
      char t[] = new char[q.length * 2]; 
 
      // copy elements into new queue 
      for(int i=0; i < q.length; i++) 
        t[i] = q[i]; 
 
      q = t; 
    }    
        
     q[putloc++] = ch;    
  }    
    
  // Get a character from the queue.   
  public char get() {    
    if(getloc == putloc) {    
      System.out.println(" -- Queue is empty.");    
      return (char) 0;     
    }    
      
    return q[getloc++];    
  }    
}

//listing 17
// Demonstrate the ICharQ interface.    
class IQDemo {    
  public static void main(String args[]) {    
    FixedQueue q1 = new FixedQueue(10);    
    DynQueue q2 = new DynQueue(5); 
    CircularQueue q3 = new CircularQueue(10); 
 
    ICharQ iQ; 
 
    char ch;    
    int i;    
 
    iQ = q1;    
    // Put some characters into fixed queue.    
    for(i=0; i < 10; i++)    
      iQ.put((char) ('A' + i));    
   
    // Show the queue. 
    System.out.print("Contents of fixed queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    } 
    System.out.println(); 
 
    iQ = q2; 
    // Put some characters into dynamic queue.    
    for(i=0; i < 10; i++)    
      iQ.put((char) ('Z' - i));    
   
    // Show the queue. 
    System.out.print("Contents of dynamic queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
    System.out.println(); 
 
    iQ = q3; 
    // Put some characters into circular queue.    
    for(i=0; i < 10; i++)    
      iQ.put((char) ('A' + i));    
   
    // Show the queue. 
    System.out.print("Contents of circular queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
    System.out.println(); 
 
    // Put more characters into circular queue.    
    for(i=10; i < 20; i++)    
      iQ.put((char) ('A' + i));    
 
    // Show the queue. 
    System.out.print("Contents of circular queue: ");    
    for(i=0; i < 10; i++) {     
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
    System.out.println("\nStore and consume from" + 
                       " circular queue."); 
 
    // Use and consume from circular queue. 
    for(i=0; i < 20; i++) { 
      iQ.put((char) ('A' + i));    
      ch = iQ.get();    
      System.out.print(ch);    
    }    
 
  }    
}

//listing 18
// An interface that contains constants. 
interface IConst { 
  int MIN = 0; 
  int MAX = 10; 
  String ERRORMSG = "Boundary Error"; 
} 
 
class IConstD implements IConst { 
  public static void main(String args[]) { 
    int nums[] = new int[MAX]; 
 
    for(int i=MIN; i < 11; i++) { 
      if(i >= MAX) System.out.println(ERRORMSG); 
      else { 
        nums[i] = i; 
        System.out.print(nums[i] + " "); 
      } 
    } 
  } 
}

//listing 19
// One interface can extend another. 
interface A { 
  void meth1(); 
  void meth2(); 
} 
 
// B now includes meth1() and meth2() -- it adds meth3(). 
interface B extends A { 
  void meth3(); 
} 
 
// This class must implement all of A and B 
class MyClass implements B { 
  public void meth1() { 
    System.out.println("Implement meth1()."); 
  } 
 
  public void meth2() { 
    System.out.println("Implement meth2()."); 
  } 
 
  public void meth3() { 
    System.out.println("Implement meth3()."); 
  } 
} 
 
class IFExtend { 
  public static void main(String arg[]) { 
    MyClass ob = new MyClass(); 
 
    ob.meth1(); 
    ob.meth2(); 
    ob.meth3(); 
  } 
}

//listing 20
public interface MyIF { 
  // This is a "normal" interface method declaration. 
  // It does NOT define a default implementation. 
  int getUserID(); 
 
  // This is a default method. Notice that it provides 
  // a default implementation. 
  default int getAdminID() { 
    return 1; 
  } 
}

//listing 21
// Implement MyIF. 
class MyIFImp implements MyIF { 
  // Only getUserID() defined by MyIF needs to be implemented. 
  // getAdminID() can be allowed to default. 
  public int getUserID() { 
    return 100; 
  } 
}

//listing 22
// Use the default method. 
class DefaultMethodDemo { 
  public static void main(String args[]) { 
 
    MyIFImp obj = new MyIFImp(); 
 
    // Can call getUserID(), because it is explicitly 
    // implemented by MyIFImp: 
    System.out.println("User ID is " + obj.getUserID()); 
 
    // Can also call getAdminID(), because of default 
    // implementation: 
    System.out.println("Administrator ID is " + obj.getAdminID()); 
  } 
}

//listing 23
class MyIFImp2 implements MyIF { 
  // Here, implementations for both getUserID( ) and getAdminID( ) are 
  // provided. 
  public int getUserID() { 
    return 100; 
  } 
 
  public int getAdminID() { 
    return 42; 
  }   
}

//listing 24
public interface MyIF { 
  // This is a "normal" interface method declaration. 
  // It does NOT define a default implementation. 
  int getUserID(); 
 
  // This is a default method. Notice that it provides 
  // a default implementation. 
  default int getAdminID() { 
    return 1; 
  } 
 
  // This is a static interface method. 
  static int getUniversalID() { 
    return 0; 
  } 
}
