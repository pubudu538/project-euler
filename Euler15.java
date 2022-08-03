public class Euler15 {

    public static void main(String[] args) {

        int gridNumber = 20;
        long[][] grid = new long[gridNumber + 1][gridNumber + 1];

        for (int k = 0; k < gridNumber; k++) {

            grid[k][gridNumber] = 1;
            grid[gridNumber][k] = 1;

        }

        for (int i = gridNumber; i > 0; i--) {

            for (int j = gridNumber; j > 0; j--) {

                grid[i - 1][j - 1] = grid[i][j - 1] + grid[i - 1][j];
            }
        }

        System.out.println(grid[0][0]);
    }

}
