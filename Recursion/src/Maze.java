import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(5,5));
        System.out.println(paths("",3,3));
        System.out.println(diagPath("",3,3));
        System.out.println(diagPath("",5,5).size());
        boolean [][] board ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(pathCountWithObs("",board, 0,0));
    }
    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r,c-1);
        int down = count(r-1,c);

        return right+down;
    }
    public static ArrayList<String> paths(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>right = new ArrayList<>();
        ArrayList<String>down = new ArrayList<>();
        if(c==1){
            down = paths(p+"D", r-1,c);
        }
        else if(r==1){
            right = paths(p+"R",r,c-1);
        }else{
            right = paths(p+"R",r,c-1);
            down = paths(p+"D", r-1,c);
        }

        right.addAll(down);

        return right;

    }
    public static ArrayList<String> diagPath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String>list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list= new ArrayList<>();
        if(c>1 && r>1){
            list.addAll(diagPath(p+"D",r-1,c-1));
        }
        if(c>1){
            list.addAll(diagPath(p+"H",r,c-1));
        }
        if(r>1){
            list.addAll(diagPath(p+"V",r-1,c));
        }
        return list;
    }
    public static ArrayList<String> pathCountWithObs(String p, boolean[][] maze, int r, int c){
        if(c== maze[0].length-1 && r == maze.length-1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String>list = new ArrayList<>();
        if(c< maze[0].length-1){
            list.addAll(pathCountWithObs(p+"R",maze,r,c+1));
        }
        if(r< maze.length-1){
            list.addAll(pathCountWithObs(p+"D",maze,r+1,c));
        }
        return list;
    }
}
