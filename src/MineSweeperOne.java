import java.util.Random;
import java.util.Scanner;

public class MineSweeperOne {
    private char[][] board;
    private char[][] mineLocations;
    private int rows;
    private int cols;
    private int mines;
    private boolean gameOver;
    private Scanner scanner;

    public MineSweeperOne() {
        scanner = new Scanner(System.in);
        gameOver = false;
    }

    public void startGame() {
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        System.out.println("Oyun Alanı Boyutlarını Girin (minimum 2x2):");
        while (true) {
            System.out.print("Satır Sayısı: ");
            rows = scanner.nextInt();
            System.out.print("Sütun Sayısı: ");
            cols = scanner.nextInt();
            if (rows >= 2 && cols >= 2) {
                break;
            } else {
                System.out.println("Lütfen geçerli boyutlar girin!");
            }
        }
        board = new char[rows][cols];
        mineLocations = new char[rows][cols];
        int totalCells = rows * cols;
        mines = totalCells / 4;
        if (mines < 1) {
            mines = 1;
        } else if (mines > totalCells - 1) {
            mines = totalCells - 1;
        }
        initializeBoard();
        printBoard();
        while (!gameOver) {
            playTurn();
            printBoard();
        }
        revealBoard(); // Oyun bittiğinde Mayınların Konumu'nu göster
        scanner.close();
    }

    private void initializeBoard() {
        // Board'u "-" ile doldur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
        // Mayınları yerleştir
        Random random = new Random();
        for (int i = 0; i < mines; i++) {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);
            while (mineLocations[row][col] == '*') {
                row = random.nextInt(rows);
                col = random.nextInt(cols);
            }
            mineLocations[row][col] = '*';
        }
    }

    private void printBoard() {
        System.out.println("   " + "0123456789".substring(0, cols));
        for (int i = 0; i < rows; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("|");
        }
    }

    private void playTurn() {
        System.out.print("Satır seçin: ");
        int row = scanner.nextInt();
        System.out.print("Sütun seçin: ");
        int col = scanner.nextInt();
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            System.out.println("Geçersiz koordinatlar, lütfen tekrar deneyin!");
            return;
        }
        if (board[row][col] != '-') {
            System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin!");
            return;
        }
        if (mineLocations[row][col] == '*') {
            gameOver = true;
            System.out.println("Game Over!!");
            revealBoard();
        } else {
            int count = countAdjacentMines(row, col);
            board[row][col] = (char) (count + '0');
            if (count == 0) {
                // Eğer seçilen noktada mayın yoksa ve etrafında da mayın yoksa diğer komşuları kontrol et
                checkAdjacentCells(row, col);
            }
            if (checkWin()) {
                gameOver = true;
                System.out.println("Tebrikler! Oyunu kazandınız!");
            }
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = Math.max(0, row - 1); i <= Math.min(row + 1, rows - 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(col + 1, cols - 1); j++) {
                if (mineLocations[i][j] == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    private void checkAdjacentCells(int row, int col) {
        for (int i = Math.max(0, row - 1); i <= Math.min(row + 1, rows - 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(col + 1, cols - 1); j++) {
                if (board[i][j] == '-') {
                    int count = countAdjacentMines(i, j);
                    board[i][j] = (char) (count + '0');
                    if (count == 0) {
                        checkAdjacentCells(i, j);
                    }
                }
            }
        }
    }

    private void revealBoard() {
        System.out.println("Mayınlar:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineLocations[i][j] == '*') {
                    System.out.print("* ");
                } else {
                    System.out.print(countAdjacentMines(i, j) + " ");
                }
            }
            System.out.println();
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == '-' && mineLocations[i][j] != '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MineSweeperOne game = new MineSweeperOne();
        game.startGame();
    }
}