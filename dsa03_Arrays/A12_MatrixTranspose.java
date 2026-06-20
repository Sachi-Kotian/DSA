package dsa03_Arrays;

/*
1 2 3 
4 5 6
7 8 9

Transpose
1 4 7
2 5 8
3 6 9

*/

public class A12_MatrixTranspose {
    public static void main(String args[])
    {
        int rows=3,cols=3;
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix");
        for(int n[]:matrix)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
