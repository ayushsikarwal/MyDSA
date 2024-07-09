import java.util.ArrayList;

public class PermutationsRecursion {
    public static void main(String[] args) {
        String s = "abc";
        permutations("",s);
        System.out.println(permutation("",s));
        System.out.println(permutationsNumber("",s));
    }
    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i = 0; i < p.length()+1; i++) {
            String pre = p.substring(0,i);
            char ch = up.charAt(0);
            String suff = p.substring(i);
            String formed = pre+ch+suff;

            permutations(formed,up.substring(1));
        }
    }
    public static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList <String> toReturn = new ArrayList<>();
        for (int i = 0; i < p.length()+1; i++) {
            String pre = p.substring(0,i);
            char ch = up.charAt(0);
            String suff = p.substring(i,p.length());
            String formed = pre+ch+suff;

            toReturn.addAll(permutation(formed,up.substring(1)));

        }
        return toReturn;
    }
    public static int permutationsNumber(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int res= 0;
        for (int i = 0; i < p.length()+1; i++) {
            String pre = p.substring(0,i);
            char ch = up.charAt(0);
            String suff = p.substring(i,p.length());
            String formed = pre+ch+suff;


            res =res+permutationsNumber(formed,up.substring(1));
        }
        return res;
    }
}
