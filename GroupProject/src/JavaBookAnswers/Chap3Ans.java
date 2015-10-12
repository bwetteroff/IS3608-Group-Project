package JavaBookAnswers;

//listing 1
// Count spaces. 
class Spaces { 
  public static void main(String args[])  
    throws java.io.IOException { 
 
    char ch; 
    int spaces = 0; 
 
 
    System.out.println("Enter a period to stop."); 
 
    do { 
      ch = (char) System.in.read(); 
      if(ch == ' ') spaces++; 
    } while(ch != '.'); 
 
    System.out.println("Spaces: " + spaces); 
  } 
}

//listing 2
// Change case. 
class CaseChg { 
  public static void main(String args[])  
    throws java.io.IOException { 
    char ch; 
    int changes = 0; 
 
    System.out.println("Enter period to stop."); 
 
    do { 
      ch = (char) System.in.read(); 
      if(ch >= 'a' & ch <= 'z') { 
        ch -= 32; 
        changes++; 
        System.out.println(ch); 
      } 
      else if(ch >= 'A' & ch <= 'Z') { 
        ch += 32; 
        changes++; 
        System.out.println(ch); 
      } 
    } while(ch != '.'); 
    System.out.println("Case changes: " + changes); 
  } 
}

