package dsa04_Searching;

public class S06_OrderAgnostic {

    public static int orderAgSearch(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        boolean ans=arr[start]<arr[end];


            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                    return mid;
                else if(arr[mid]>target)
                    if(ans)
                     end=mid-1;
                    else
                        start=mid+1;
                else
                    if(ans)
                        start=mid+1;
                    else
                        end=mid-1;
            }
        
        
        return -1;
        

    }

    public static void main(String args[])
    {
        int[] arr={1,3,44,56,78,90};
        int[] nums={1000,990,320,100,5};
        System.out.println(orderAgSearch(arr,44));
        System.out.println(orderAgSearch(nums,100));

    }
    
}
