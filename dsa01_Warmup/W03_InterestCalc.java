package dsa01_Warmup;

//Time complexity:O(1) because of built in power operation
//Space complexity:O(1)


public class W03_InterestCalc {

    public static double[] interest(double principal, double rate, double time) {
        double simpleInterest;
        double compoundInterest;
        double[] result=new double[2];

        simpleInterest = principal * rate * time / 100.0;

        compoundInterest = principal * Math.pow( (1 + rate/100.0),time) - principal;
        result[0]=Math.round((simpleInterest*100.0))/100.0;
        result[1]=Math.round((compoundInterest*100.0))/100.0;

        return result;

        
    }

    public static void main(String args[])
    {
        double interests[]=interest(1000,5,2);
        for(double m:interests)
        {
            System.out.println(m);
        }
    }

    
}
