package day3;
import java.util.Scanner;

class Matrix
{
	private int mat[][] = new int[3][3];
    private int i,j, size;
	Matrix(int size) {
		this.size = size;
		
	}
    public void input()
    {
    	Scanner sc=new Scanner(System.in);
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.println("Enter value at["+i+"]["+j+"]");
                mat[i][j]=sc.nextInt();
            }
        }
    }
    public void display()
    {
         for(i=0;i<size;i++)
         {
             for(j=0;j<size;j++)
             {
                 System.out.print(mat[i][j]+"\t ");
             }
             System.out.println();
         }
    }

    // Addition of Two Matrixes

    public Matrix Addition(Matrix A)
    {
        Matrix Res=new Matrix(size);
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
                Res.mat[i][j]=mat[i][i]+A.mat[i][j];
        }
        return Res;
    }
    public Matrix Multiplication(Matrix A)
    {
        Matrix Res = new Matrix(size);
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++) {
            	for(int k = 0; k < size; k++) {
            		Res.mat[i][j] += mat[i][k] * A.mat[k][j];
            	}
            }
        }
        return Res;
    }

}
public class Day3Matrix {
	public static void main(String [] args) {
		System.out.println("Enter size of matrix = ");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		Matrix X=new Matrix(size);
		Matrix Y=new Matrix(size);
		Matrix M;
		Matrix Z;
		X.input();
		Y.input();
		Z=X.Addition(Y);
		System.out.println("First Matrix");
		X.display();
		System.out.println("Second Matrix");
		Y.display();
		System.out.println("Sum of The Matrixes");
		Z.display();
		M=X.Multiplication(Y);
		System.out.println("Multiplication of The Matrixes");
		M.display();
	}
}
