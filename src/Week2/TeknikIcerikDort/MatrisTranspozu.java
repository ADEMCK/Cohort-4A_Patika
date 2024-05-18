package Week2.TeknikIcerikDort;

public class MatrisTranspozu {
    public static void main(String[] args) {
        // İki boyutlu dizi yazılır.
        int[][] matrix = {{1, 2},
                {3, 4},
                {5, 6}};
        System.out.println("Matris: ");

        // Matrisin düz halini yazdır
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrisin Transpozu: ");

        // İlk önce matrisin sütunlarını geziyoruz, sonrasında satırlarını gezerek yazdırıyoruz.
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
