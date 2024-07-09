import java.util.*;
public class machaBeta {
//    public static void main(String[] args) {
//        long[] a1 ={1,2,3,4,5,6,7,8};
//        long[] a2 ={1,2,3,1};
//        long n = a1.length;
//        long m = a2.length;
//        System.out.println(isSubset(a1,a2,n,m));
//    }
//    static String isSubset( long a1[], long a2[], long n, long m) {
//        HashSet<Long> sa = new HashSet<>();
//        // HashSet<Integer> sb = new HashSet<>();
//        for(long element : a1){
//            sa.add(element);
//        }
//
//        for(int i =0; i<m; i++){
//            if(!sa.contains(a2[i])){
//                return "No";
//            }
//        }
//        return "Yes";
//    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        output(s);
    }
    static void output(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
