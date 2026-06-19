package dsa04_Searching;
import java.util.Scanner;
import java.util.Arrays;
public class S04_LSMatrix {

    public static int[] searchMatrix(int arr[][],int target,int rows,int cols)
    {

        if(arr.length==0)
        {
            return new int[]{-1};
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1};
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=3,columns=3;
        int[][] arr=new int[rows][columns];

        System.out.println("Enter matrix elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int[] matrix=searchMatrix(arr,5,rows,columns);

        if(matrix[0]!=-1)
            System.out.println(Arrays.toString(matrix));
        else
            System.out.println("Element not found");

        

    }
    
}
