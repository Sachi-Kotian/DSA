package dsa04_Searching;

//Time Complexity:O(n)
//Space Complexity:O(1)

public class S01_LinearSearch {
    
    public static int search(int arr[], int x) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                return i;
        }
        
        return -1;
        
    }
    
    public static void main(String args[])
    {
        int[] arr={5,7,8,100,45};
        int result=search(arr,100);
        if(result>=0)
            System.out.println("Element found at:"+result+" position");
        else
            System.out.println("Element not found");
    }

    
}
