//bruteforce 
public class RotateArby90{
    static int [][]  rotate(int [][] matrix,int row,int col)
    {
        int [][] ans=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ans[j][row-1-i]=matrix[i][j];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int r=matrix.length;
        int c=matrix[0].length;
        System.out.println("array before rotation:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

       int [][] rotated=rotate(matrix,r,c);

        System.out.println("array after rotation:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(rotated[i][j]+" ");
            }
            System.out.println();

        }


    }
}
//tc=O(N^2) sc=O(N^2)

//optimal
//bruteforce
public class RotateArby90{
    static void rotate(int [][] matrix,int row,int col)
    {
        //transpose
        for (int i = 0; i <row; i++) {
            for (int j = i; j < col; j++) {
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reverse
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < row / 2; j++) {
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][row- 1 - j];
                matrix[i][row-1- j] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int [][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
        int r=matrix1.length;
        int c=matrix1[0].length;
        System.out.println("array before rotation:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();

        }

        rotate(matrix1,r,c);

        System.out.println("array after rotation:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();

        }


    }
}
//tc=O(N^2) 
//output

array before rotation:
1 2 3 
4 5 6 
7 8 9 
array after rotation:
7 4 1 
8 5 2 
9 6 3 
