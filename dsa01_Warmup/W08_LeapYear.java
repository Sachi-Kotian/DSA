package dsa01_Warmup;

//Time complexity-O(1)
//Space complexity-O(1)


public class W08_LeapYear {
    
    public static boolean isLeapYear(int year) {
        if(year%100==0)
        {
            if(year%400==0)
                return true;
            else
                return false;
        }
        else
        {
            if(year%4==0)
                return true;
            else
                return false;
        }
        
    }


    public static void main(String args[])
    {
        boolean decision=isLeapYear(2020);
        if(decision==true)
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");

    }
    
}
