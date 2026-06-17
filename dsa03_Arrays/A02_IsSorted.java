package dsa03_Arrays;

//Time Complexity:O(n)
//Space Complexity:O(1)



public class A02_IsSorted {
    public static String sorted(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return "Not Sorted";
            
        }
        return "Sorted";
    } 

    public static void main(String args[])
    {

        int[] nums={33,55,77,99};
        System.out.println(sorted(nums));
    }
     
}
