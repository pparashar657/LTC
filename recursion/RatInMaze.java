package recursion;

public class RatInMaze {

    public static void main(String[] args) {
        printPathWithLeftDown(1,1, 3,3, "");
    }

    private static void printPathWithLeftDown(int currRow, int currCol, int n, int m, String path) {
        if(currRow > n || currCol > m) {
            return;
        }

        if(currRow == n && currCol == m) {
            System.out.println(path);
            return;
        }

        printPathWithLeftDown(currRow, currCol + 1, n, m, path + "R");
        printPathWithLeftDown(currRow + 1, currCol, n, m, path + "D");
        printPathWithLeftDown(currRow + 1, currCol + 1, n, m, path + "M");
    }

}
