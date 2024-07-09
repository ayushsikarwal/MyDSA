import java.util.Scanner;

public class TreesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTrees trees = new BinaryTrees();
        trees.populate(sc);
        trees.display();
    }
}
