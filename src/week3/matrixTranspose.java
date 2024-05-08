package week2.teknikIcerik4;

import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Determining matrix size from user
        System.out.print("Enter the number of row of the matrix: ");
        int row = input.nextInt();
        System.out.print("Enter the number of column of the matrix: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Enter the elements of the matrix: ");

        // Entering the values of the matrix from the user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Element at " + i + ", " + j + ": " + matrix[i][j]);
                matrix[i][j] = input.nextInt();

            }
        }

        System.out.println("Matris 1:");
        printMatrix(matrix);
        System.out.println("Transpoze:");
        printMatrix(transpose(matrix));

    }
    // Function that finds the transpose of the matrix
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposeMatrix = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }
    // Function that prints the matrix on the screen
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
