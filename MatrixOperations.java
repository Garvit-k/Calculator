import java.util.Scanner;

public class MatrixOperations {
	public static int[][] setMatrixValues(int[][] matrix,int initialVal) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j< columns; j++) {
				matrix[i][j] = initialVal;
			}
		}
		return matrix;
	}
	public static int[][] setMatrixValues(int[][] matrix) {
		Scanner in = new Scanner(System.in);
		int dataEntered;
		int rows = matrix.length;
		int columns = matrix[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j< columns; j++) {
				System.out.println("Enter value of matrix at row: "+i+" and column:"+j+" :");
				dataEntered = in.nextInt();
				matrix[i][j] = dataEntered;
			}
		}
		return matrix;
	}
	public static int [][] addition(int [][] matrix) {
		
		return matrix;
	}
	public static int [][] inverse(int [][] matrix) {
		
		return matrix;
	}
	public static void disp(int [][] matrix) {
		System.out.println("The Answer is : \n");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void matrix() {
		Scanner in = new Scanner(System.in);
        int ch1,rows,col;
        System.out.println("Choose any one operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Transpose");
        System.out.println("5.Determinant");
        System.out.println("6.Eigen Values");
        System.out.println("7.Eigen Vectors");
        System.out.println("8.Inverse");
        System.out.println("9.Adjoint");
        ch1=in.nextInt();
        switch(ch1) {
        case 1:
        	System.out.println("Enter number of matrices to be added");
        	int n=in.nextInt();
        	System.out.println("Enter number of rows\n");
        	rows=in.nextInt();
        	System.out.println("Enter number of columns");
        	col=in.nextInt();
        	int matrix1[][]=new int[rows][col];
        	matrix1=setMatrixValues(matrix1, 0);
        	for(int i=0;i<n;i++) {
        		matrix1=setMatrixValues(matrix1);
        	}
        	disp(matrix1);
        	break;
        case 4:
        	System.out.println("Enter number of rows\n");
        	rows=in.nextInt();
        	System.out.println("Enter number of columns");
        	col=in.nextInt();
        	int matrix11[][]=new int[rows][col];
        	matrix11=setMatrixValues(matrix11);
        	for(int i=0;i<rows;i++) {
        		for(int j=0;j<col;j++) {
        			matrix11[i][j]=matrix11[j][i];
        		}
        	}
        	disp(matrix11);
        	break;
        }
	}
}
