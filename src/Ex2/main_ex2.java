package Ex2;



public class main_ex2 {

	public static void main(String[] args) {
		
		main_ex2 obj = new main_ex2();
		
		obj.multiply_2d_matrices();
		
		
	}

	private void multiply_2d_matrices() {
		
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		int[][] result = new int[3][3];
		
		System.out.println("Enter the elements of the first matrix: ");
		matrix1 = getMatrix();
		System.out.println("Enter the elements of the second matrix: ");
		matrix2 = getMatrix();
		
		//Multiplication
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				result[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}

			}
		}
		
		//Print the result
		
		System.out.println("The result of the multiplication is: ");
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}	
		
		
	}
	
	private void add_2d_matrix() {
		
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		int[][] result = new int[3][3];
		
		System.out.println("Enter the elements of the first matrix: ");
		matrix1 = getMatrix();
		System.out.println("Enter the elements of the second matrix: ");
		matrix2 = getMatrix();
		
		//Addition
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				result[i][j] = matrix1[i][j] + matrix2[i][j];

			}
		}
		
		//Print the result
		
				System.out.println("The result of the multiplication is: ");
				for (int i = 0; i < 3; i++) {
					
					for (int j = 0; j < 3; j++) {
						System.out.print(result[i][j] + " ");
					}
					System.out.println();
				}	
		
	}

	private int[][] getMatrix() {
		
		int[][] matrix = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter the element at position [" + i + "][" + j + "]: ");
				java.util.Scanner x = new java.util.Scanner(System.in);
				int b = x.nextInt();
				matrix[i][j] = b;
				
			}
		}
		return matrix;
		
	}
	
	
	
}
