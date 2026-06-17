package dsa03_Arrays;

//Time Complexity:O(n)
//Space Complexity:O(1)

public class A06_EvenOdd {
    public static int[] countEvenOdd(int[] nums) {
        int evenCount=0,oddCount=0;
        for(int m:nums)
        {
            if(m%2==0)
                evenCount++;
            else
                oddCount++;
        }
        return new int[]{evenCount,oddCount};
        
    }

    public static void main(String args[])
    {
        int[] nums={3,2,4,78,95};
        int[] arr=countEvenOdd(nums);
        for(int m:arr)
        {
            System.out.println(m);
        }
    }
}