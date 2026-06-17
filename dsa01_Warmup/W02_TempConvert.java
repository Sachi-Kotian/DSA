package dsa01_Warmup;

//Time complexity:O(1)
//Space complexity:O(1)

public class W02_TempConvert {
    
    public static double convert(double temp, String scale) {
        double result;
        if(scale.equals("C"))
        {
            result= temp * 9 / 5 + 32;
        }
        else if(scale.equals("F"))
        {
            result= (temp - 32) * 5 / 9;
        }
        else{
            
            throw new IllegalArgumentException("Invalid scale");
        
        }
         return Math.round(result * 100.0) / 100.0;
    }
        
    

    public static void main(String[] args){
        
        
        System.out.println(convert(0,"C"));
    }
}
    

