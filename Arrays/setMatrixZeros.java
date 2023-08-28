//BruteForce
import java.util.Scanner;

public class MatrixZero {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and coloumn:" );
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];

        System.out.println("enter elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //performing problem statement
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                  makerow(i,c,matrix);
                  makecol(j,r,matrix);
                }
            }
        }

        //converting the -1 to 1
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }

        System.out.println("Answer after chnging:");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }




    }

    private static void makecol(int j, int r, int[][] matrix) {
        for(int i=0;i<r;i++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }

    private static void makerow(int i, int c, int[][] matrix) {
        for(int j=0;j<c;j++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }

    }
}
//output   
Enter row and coloumn:
3
3
enter elements:
1
2
3
4
0
0
6
8
0
Matrix is:
1 2 3 
4 0 0 
6 8 0 
Answer after chnging:
1 0 0 
0 0 0 
0 0 0 
//Better

  class Solution {
    public void setZeroes(int[][] matrix) {
         int r=matrix.length;
        int c=matrix[0].length;
        int [] col=new int[c];
        int [] row=new int[r];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(row[i]==1|| col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
  
