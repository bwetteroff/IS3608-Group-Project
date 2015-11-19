/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeAndLearnUK;

/**
 *
 * @author wetteb
 */
public class IFStatements
{
    public static void main(String[] args)
    {
	ifstatement();
	IfElseStatement();
	ifelserange();
    }
    
    public static void ifstatement()
    {
        int user = 22;
	if (user <= 18)
	{
	    System.out.println("User is 18 or younger");
	}
	if (user > 18)
	{
	    System.out.println("User is older than 18");
	}
                
    }
    
    static void IfElseStatement()
    {
	int user = 17;
	if (user <= 18)
	{
	    System.out.println("User is 18 or younger");
	}
	else
	{
	    System.out.println("User is older than 18");
	}
    }
    static void ifelserange()
    {
	int user = 21;
	if (user <= 18)
	{
	    System.out.println("User is 18 or younger");
	}
	    else if (user > 18 && user < 40)
	{
	    System.out.println("User is between 19 and 39");
	}
	    else if (user == 45 || user == 50)
	{
	    System.out.println("User is either 45 or 50");
	}
	    else 
	{
	    System.out.println("User is older than 40");
	}
    }
    
}
