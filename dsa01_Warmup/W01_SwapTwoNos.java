package dsa01_Warmup;

//Time complexity:O(1)
//Space complexity:O(1)

public class W01_SwapTwoNos {
    public static int[] swap(int a, int b) {
        int[] arr=new int[2];
        int temp;
        temp=a;
        a=b;
        b=temp;
        arr[0]=a;
        arr[1]=b;
        return arr;
        
    }

    public static void main(String args[]){
        int[] result=swap(5,7);
        for(int m:result)
        {
            System.out.println(m);
        }

    }
}

