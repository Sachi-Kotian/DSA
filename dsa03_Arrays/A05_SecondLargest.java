//REVISION

package dsa03_Arrays;


//Time Complexity:O(n)
//Space Complexity:O(1)

public class A05_SecondLargest {
    public static int findSecond(int nums[])
    {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int m:nums)
        {
            if(m>largest)
            {
                second=largest;
                largest=m;
            }
            else if(m>second && m<largest)
            {
                second=m;
            }
        }

        return second;
    }
    
    public static void main(String args[])
    {
        int[] nums={5,6,99,4};
        System.out.println("Second Largest: "+findSecond(nums));

    }
    
}
