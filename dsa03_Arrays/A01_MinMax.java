package dsa03_Arrays;

//Time Complexity:O(n)
//Space Complexity:O(1)


public class A01_MinMax {

    public static void minMax(int nums[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        System.out.println("Maximum number="+max+",Minimum number="+min);

    }
    public static void main(String args[])
    {
        int[] nums={33,65,1,20,88,1000};
        minMax(nums);

    }
    
}
