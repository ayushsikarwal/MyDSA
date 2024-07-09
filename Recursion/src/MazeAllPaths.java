import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][]board ={
                {true,true,true},
                {true,true,true},
                {false,true,true}
        };
        int[][]path = new int[board.length][board[0].length];
//        allPaths("",board,0,0);
//        System.out.println(allPathsList("",board,0,0));
        printAllPaths("",board,0,0,path,1);
    }
    public static void allPaths(String p,boolean[][]maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;
        if(r<maze.length-1){
            allPaths(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(p+"R",maze,r,c+1);
        }
        if(c>0){
            allPaths(p+"L",maze,r,c-1);
        }
        if(r>0){
            allPaths(p+"U",maze,r-1,c);
        }
        maze[r][c]=true;
    }
    public static ArrayList<String> allPathsList(String p, boolean[][]maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        maze[r][c]=false;
        ArrayList<String>list= new ArrayList<>();
        if(r<maze.length-1){
            list.addAll(allPathsList(p+"D",maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(allPathsList(p+"H",maze,r,c+1));
        }
        if(c>0){
            list.addAll(allPathsList(p+"L",maze,r,c-1));
        }
        if(r>0){
            list.addAll(allPathsList(p+"U",maze,r-1,c));
        }
        maze[r][c]=true;
        return list;

    }
    public static void printAllPaths(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        // Base condition: if we have reached the bottom-right corner
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        // Check if the current cell is a valid cell to explore
        if (!maze[r][c]) {
            return;
        }

        // Mark the cell as visited and set the step
        maze[r][c] = false;  // Mark the cell as visited
        path[r][c] = step;

        // Explore in all four possible directions

        // Move Down
        if (r < maze.length - 1) {
            printAllPaths(p + "D", maze, r + 1, c, path, step + 1);
        }

        // Move Right
        if (c < maze[0].length - 1) {
            printAllPaths(p + "R", maze, r, c + 1, path, step + 1);
        }

        // Move Left
        if (c > 0) {
            printAllPaths(p + "L", maze, r, c - 1, path, step + 1);
        }

        // Move Up
        if (r > 0) {
            printAllPaths(p + "U", maze, r - 1, c, path, step + 1);
        }

        // Backtrack: Unmark the cell as visited and reset the step in the path
        maze[r][c] = true;  // Unmark the cell
        path[r][c] = 0;     // Reset the path step
    }

}
