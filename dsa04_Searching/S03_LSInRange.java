package dsa04_Searching;

public class S03_LSInRange {
   
    
    public static int search(int arr[], int x,int start,int end) {
        if (start>=0 && end<arr.length && start<end)
        {
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==x)
                return i;
        }
    }
        
        return -1;
        
    }
    
    public static void main(String args[])
    {
        int[] arr={5,7,8,100,45};
        int result=search(arr,100,1,3);
        if(result>=0)
            System.out.println("Element found at:"+result+" position");
        else
            System.out.println("Element not found");
    }

    
}

    

