package dsa04_Searching;

import java.util.Arrays;

public class S02_LSString {
    public static int search(String str,char target)
    {
        if(str.length()==0)
        {
            return -1;
        }

        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        String str="Chocolate";
        char target='o';
        int index=search(str,target);

        //string to array
        System.out.println(Arrays.toString(str.toCharArray()));

        
        if(index>0)
        {
            System.out.println("target found at :"+index+" position");

        }
        else
        {
            System.out.println("target not found");
        }

    }
    
}
