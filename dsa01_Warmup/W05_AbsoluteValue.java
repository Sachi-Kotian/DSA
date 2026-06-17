package dsa01_Warmup;

//Time complexity-O(1)
//Space complexity-O(1)

public class W05_AbsoluteValue {
    
    //long since abs value of min value is a long value
    public static long absoluteValue(int n) {
        if(n==Integer.MIN_VALUE)
        {
            return 2147483648L;
        }
        else
        {
            return n<0?-n:n;
        }
        
    }

    public static void main(String args[])
    {
        int n=-5;
        System.out.println(absoluteValue(n));
    }

    
}
