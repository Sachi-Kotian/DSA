package dsa03_Arrays;

/*
1 2 3
4 5 6 
7 8 9

Spiral pattern
1 2 3 6 9 8 7 4 5 

*/

public class A11_2DSpiral {

    public static void main(String args[])
    {
        int rows=3,cols=3;
        int[][] matrix=new int[rows][cols];
        int k=1;
        
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
            
            matrix[i][j]=k;
            k++;
            
            }   
        }


        for(int n[]:matrix)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

        int rowStart=0,colStart=0;
        int rowEnd=rows-1,colEnd=cols-1;

        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int i=colStart;i<=colEnd;i++)
            {
                System.out.println(matrix[rowStart][i]);
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++)
            {
                System.out.println(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowStart<=rowEnd)
            {
                for(int i=colEnd;i>=colStart;i--)
                {
                    System.out.println(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if(colStart<=colEnd)
            {
                for(int i=rowEnd;i>=rowStart;i--)
                {
                    System.out.println(matrix[i][colStart]);
                }
                colStart++;
            }
        }

    

    }
    
}
