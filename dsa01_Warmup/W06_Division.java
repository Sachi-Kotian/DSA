package dsa01_Warmup;

//Time complexity-O(1)
//Space complexity-O(1)

public class W06_Division {
    
    public static int[] divide(int dividend, int divisor) {
        int quotient,remainder;
        
        if(divisor!=0)
        {
        quotient=dividend/divisor;
        remainder=dividend%divisor;
        }
        else
        {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return new int[]{quotient,remainder};

    }

    public static void main(String args[])
    {
        int[] result=divide(33,2);
        for(int m:result)
        {
            System.out.println(m);
        }
    }

    
}
