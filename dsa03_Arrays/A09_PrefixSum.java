package dsa03_Arrays;
// Time Complexity: O(n)
//Space Complexity: O(1)

public class A09_PrefixSum {
    public static int  maxPrefixSum(int nums[])
    {
        int sum=0;
         int max=Integer.MIN_VALUE;
        for(int m:nums)
        {
            sum+=m;

            if(sum>max)
                 max=sum;   
        }

       

        return max;
    }

    public static void main(String args[])
    {
        int[] nums={2,3,4,5};
        System.out.println("Max Prefix Sum:"+maxPrefixSum(nums));

    }
}
