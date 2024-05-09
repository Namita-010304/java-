
import java.util.Scanner;

public class multiply_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrices A and B:");
        int rowsA = sc.nextInt();
        System.out.println("Enter the number of columns for matrix A:");
        int columnsA = sc.nextInt();
        System.out.println("Enter the number of columns for matrix B:");
        int columnsB = sc.nextInt();

        int[][] matrixA = new int[rowsA][columnsA];
        int[][] matrixB = new int[columnsA][columnsB];
        int[][] resultMatrix = new int[rowsA][columnsB];

        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < columnsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < columnsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

