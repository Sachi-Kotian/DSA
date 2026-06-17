//REVISION
package dsa03_Arrays;

//Time Complexity:O(n)
//Space Complexity:O(1)

public class A07_InPlaceReversal {
    
    public static int[] reverseArray(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int temp;
        
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
        return nums;
        
        
    }

    public static void main(String args[])
    {
        int[] nums={-1,2,56,7};
        int[] reversed=reverseArray(nums);
        for(int m:reversed)
        {
            System.out.println(m);
        }
    }

    
}
