//REVISION

package dsa03_Arrays;
import java.util.LinkedHashMap;
import java.util.Map;;

//Time complexity-O(n+k)->n>k always->O(n)
//Space complexity:O(n)->in worst case scenario

public class A08_CountFrequency {
    public static int[][] getFrequency(int nums[])
    {

        //stores k unique elements
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();


        //visits each element once-O(n)
        for(int m:nums)
        {
            map.put(m,map.getOrDefault(m,0)+1);
        }

        //stores k unique elements
        int[][] freq=new int[map.size()][2];

        int i=0;
        //visits only unique elements-O(k)
        for(Map.Entry<Integer,Integer> mp:map.entrySet())
        {
            freq[i][0]=mp.getKey();
            freq[i][1]=mp.getValue();
            i++;
        }

        return freq;
    } 

    public static void main(String args[])
    {
        int[] nums={4,2,3,4,5,3,4};
    
        int[][] arr=getFrequency(nums);
        for(int[] n:arr)
        {
            for(int m:n)
            {
                System.out.println(m);
            }
        }
    }
    
}
