import java.text.DecimalFormat;
import java.text.NumberFormat;

//import javax.swing.*;

public class mathy
{
    private int area=0;
    public static final double PI = 3.1415;

    /**
        default constructor - stubed in
    */
    public mathy( )
    {

        System.out.println ("hi from default constructor" );

    }//end of default const


    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
        */
    public int abs (int x)
    {

        if (x<0)
            x = -x;

        return x;

    }//end of abs

    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */

    public double round(double num, int zeros)
    {

        String afterDec = "";
        for (int i = 0; i< zeros; i++)
            afterDec +="0";
        DecimalFormat fmt = new DecimalFormat("0."+afterDec);
        String number = fmt.format(num);

        return Double.parseDouble(number);

    }

    /**
            toString
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


}//end of class