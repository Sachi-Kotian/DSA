package dsa03_Arrays;

//Time Complexity:O(n)
//Space Complexity:O(1)


public class A04_AverageOfElements {
    
    public static  double arrayAverage(int[] nums) {
        double sum=0,avg;
        for(int m:nums)
        {
            sum+=m;
        }
        avg=sum/nums.length;
        return avg;
        
        
    }

    public static void main(String args[])
    {
        int[] nums={3,5,9};
        System.out.println("Average of array elements : "+arrayAverage(nums));
    }

    
}
