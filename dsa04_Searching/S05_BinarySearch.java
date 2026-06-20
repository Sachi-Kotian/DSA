package dsa04_Searching;

public class S05_BinarySearch {

    public static int binarySearch(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr={-1,0,23,55,68,71,89,100,150};
        int pos=binarySearch(arr,100);
        if(pos>=0)
        {
            System.out.println("Element found at position:"+pos);

        }
        else
        {
            System.out.println("Element not");
        }
    }
    
}
