package JavaBookAnswers;

//listing 1
/* Copy a text file, substituting hyphens for spaces. 
  
   This version uses byte streams. 
 
   To use this program, specify the name   
   of the source file and the destination file.  
   For example, 
  
   java Hyphen source target 
*/  
 
import java.io.*; 
 
class Hyphen { 
  public static void main(String args[])  
  { 
    int i; 
    FileInputStream fin = null; 
    FileOutputStream fout = null; 

    // First make sure that both files have been specified.
    if(args.length !=2 ) {
      System.out.println("Usage: Hyphen From To"); 
      return;
    }
 
    // Copy file and substitute hyphens.
    try { 
      fin = new FileInputStream(args[0]); 
      fout = new FileOutputStream(args[1]); 

      do { 
        i = fin.read(); 

        // convert space to a hypen
        if((char)i == ' ') i = '-'; 

        if(i != -1) fout.write(i); 
      } while(i != -1); 
    } catch(IOException exc) { 
      System.out.println("I/O Error: " + exc); 
    } finally {
      try {
        if(fin != null) fin.close(); 
      } catch(IOException exc) { 
        System.out.println("Error closing input file."); 
      } 

      try {
        if(fin != null) fout.close(); 
      } catch(IOException exc) { 
        System.out.println("Error closing output file."); 
      } 
    }
  } 
}

//listing 2
/* Copy a text file, substituting hyphens for spaces.

   This version uses character streams.

   To use this program, specify the name
   of the source file and the destination file.
   For example,

   java Hyphen2 source target

   This code requires JDK 7 or later.
*/

import java.io.*;

class Hyphen2 {
  public static void main(String args[])
    throws IOException
  {
    int i;

    // First make sure that both files have been specified.
    if(args.length !=2 ) {
      System.out.println("Usage: CopyFile From To");
      return;
    }

    // Copy file and substitute hyphens.
    // Use the try-with-resources statement.
    try (FileReader fin = new FileReader(args[0]);
         FileWriter fout = new FileWriter(args[1]))
    {
      do {
        i = fin.read();

        // convert space to a hypen
        if((char)i == ' ') i = '-';

        if(i != -1) fout.write(i);
      } while(i != -1);
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
