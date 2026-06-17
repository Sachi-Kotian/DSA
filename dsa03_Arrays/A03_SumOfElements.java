package dsa03_Arrays;

//Time Complexity:O(n)
//Space Complexity:O(1)


public class A03_SumOfElements {
    
    public static long arraySum(int[] nums) {
        long sum=0;
        for(int m:nums)
        {
            sum+=m;
        }
        return sum;
        
    }

    public static void main(String args[])
    {
        int[] nums={3,8,9,5};
        System.out.println("Sum of elements is : "+arraySum(nums));
    }

    
}
