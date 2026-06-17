package dsa03_Arrays;

//Time complexity:O(qn)->q=no of queries,n=no of elements in list
//Space complexity:O(q)->result list stored elements=q

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class A10_PrefixSumRange {
    
    public static List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
       
      
        
        List<Integer> result=new ArrayList<>();
        
    for(int i=0;i<leftIndex.size();i++)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=leftIndex.get(i);
        int end=rightIndex.get(i);
        
        for(int j=start;j<=end;j++)
        {
            sum+=arr.get(j);
            if(sum>max)
                max=sum;
            
            
        }
        
        result.add(i,max);
    }
    
    return result;
    }
    

    public static void main(String args[])
    {
        List<Integer> arr=Arrays.asList(-1,2,3,-5);
        List<Integer> leftIndex=Arrays.asList(0,1);
        List<Integer> rightIndex=Arrays.asList(3,3);
        maxPrefixes(arr,leftIndex,rightIndex).forEach(n->System.out.println(n));

    }

    
}
