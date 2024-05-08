package MineFields;

import java.util.Scanner;

public class MineSweeper {
    private int[][] board;
    private int rows, cols;
    private int mines;
    private boolean[][] revealed; // Bu değişken, hücrelerin açık olup olmadığını takip edecek

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols]; // Değiştirilen kısım: int[][] olarak tanımla
        this.revealed = new boolean[rows][cols]; // Yeni eklenen kısım: hücrelerin açık olup olmadığını takip etmek için bir matris
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = 0; // Değiştirilen kısım: "-" yerine 0 ile başlat
                revealed[i][j] = false; // Yeni eklenen kısım: tüm hücreleri başlangıçta kapalı olarak işaretle
            }
        }
    }

    private void placeMines() {
        int totalCells = rows * cols;
        mines = (totalCells + 3) / 4; // Ensure mines are between 1/4 and 1/2 of total cells
        int placedMines = 0;
        while (placedMines < mines) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);
            if (board[row][col] != -1) { // Değiştirilen kısım: "-" kontrolü yerine -1 kontrolü yap
                board[row][col] = -1; // Değiştirilen kısım: "*" yerine -1 ile işaretle
                placedMines++;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (revealed[i][j]) { // Değiştirilen kısım: Eğer hücre açıksa, değeri yazdır
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- "); // Değiştirilen kısım: Kapalı hücreleri "-" ile göster
                }
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int remainingCells = rows * cols - mines; // Yeni eklenen kısım: açılacak hücre sayısını takip et
        while (!gameWon) {
            printBoard();
            System.out.println("Enter row and column (e.g., 1 2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (row < 0 || row >= rows || col < 0 || col >= cols) {
                System.out.println("Invalid coordinates. Please try again.");
                continue;
            }
            if (board[row][col] == -1) {
                System.out.println("Game Over You hit a mine.");
                return;
            }
            if (revealed[row][col]) { // Değiştirilen kısım: Eğer hücre zaten açıksa, tekrar işaretleme
                System.out.println("Cell already revealed. Please choose another.");
                continue;
            }
            revealCell(row, col); // Yeni eklenen kısım: hücreyi aç
            remainingCells--; // Yeni eklenen kısım: açılan hücre sayısını azalt
            if (remainingCells == 0) { // Yeni eklenen kısım: oyunun kazanılıp kazanılmadığını kontrol et
                System.out.println("Congratulations! You've won.");
                gameWon = true;
            }
        }
    }

    private void revealCell(int row, int col) {
        if (board[row][col] != 0) { // Değiştirilen kısım: Eğer hücre boş değilse, sadece aç ve işaretleme yap
            revealed[row][col] = true;
            return;
        }
        // Değiştirilen kısım: Eğer hücre boşsa, tüm komşu boş olmayan hücreleri aç ve işaretleme yap
        revealed[row][col] = true;
        for (int i = Math.max(0, row - 1); i <= Math.min(row + 1, rows - 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(col + 1, cols - 1); j++) {
                if (!revealed[i][j]) {
                    revealCell(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        MineSweeper game = new MineSweeper(5, 5); // Example: 5x5 board
        game.play();
    }
}
