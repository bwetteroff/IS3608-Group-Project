/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Benjamin;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author bpwc0b
 */
public class Account //implements Serializable //only if printing out file
{
    protected double balance;
    protected int firstdate;
    protected int seconddate;
    protected Calendar cal1 = new GregorianCalendar();
    protected Calendar cal2 = new GregorianCalendar();
    protected boolean dateflag = false;
    protected double rate;
    
    
}

public void getInterest()
        {
            int datediff = seconddate - firstdate;
            rate = .05/365;
            double ratetime = Math.pow(1+rate,datediff);
            balance = balance * ratetime;
            firstdate = seconddate;

        }

public void getDate1() throws IOException {

        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
                //Date date= new Date();
        Date mydate = formatter.parse(inputText, pos);

        cal1.setTime(mydate);

        firstdate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;

        }
public void getDate1() throws IOException {

        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
                //Date date= new Date();
        Date date = formatter.parse(inputText, pos);

        cal1.setTime(date);

        firstdate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;

        }