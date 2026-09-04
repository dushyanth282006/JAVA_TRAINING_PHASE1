package Day7;

public class RatInAMaze {

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int[][] path = new int[maze.length][maze[0].length];

        if (findPath(maze, 0, 0, path)) {
            printPath(path);
        } else {
            System.out.println("No path found");
        }
    }

    private static boolean findPath(int[][] maze, int row, int column, int[][] path) {
        if (row < 0 || column < 0 || row >= maze.length || column >= maze[0].length
                || maze[row][column] == 0 || path[row][column] == 1) {
            return false;
        }

        path[row][column] = 1;

        if (row == maze.length - 1 && column == maze[0].length - 1) {
            return true;
        }

        if (findPath(maze, row + 1, column, path)
                || findPath(maze, row, column + 1, path)
                || findPath(maze, row - 1, column, path)
                || findPath(maze, row, column - 1, path)) {
            return true;
        }

        path[row][column] = 0;
        return false;
    }

    private static void printPath(int[][] path) {
        for (int[] row : path) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}