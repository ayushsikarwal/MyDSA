public class SegmentTreesMain {
    public static void main(String[] args) {
        int[]arr ={3,8,7,6,-2,-8,4,9};
        SegmentTrees trees = new SegmentTrees(arr);
        System.out.println(trees.query(0,7));
        trees.update(2,-20);
        System.out.println(trees.root.data);
    }
}
