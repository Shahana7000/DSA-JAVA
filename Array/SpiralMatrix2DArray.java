public class SpiralMatrix2DArray {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // 1️⃣ Top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // 2️⃣ Right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 3️⃣ Bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break;  // avoid duplicate printing
                System.out.print(matrix[endRow][j] + " ");
            }

            // 4️⃣ Left boundary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) break;  // avoid duplicate printing
                System.out.print(matrix[i][startCol] + " ");
            }

            // move to the next inner layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }
}
