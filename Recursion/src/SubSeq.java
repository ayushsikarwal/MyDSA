import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        sequence(up,p);
        System.out.println(seqAscii(p,up));
        System.out.println(sequenceList(p,up));
    }
    public static void sequence(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sequence(up.substring(1),p+ch);
        sequence(up.substring(1), p);
    }
    public static ArrayList<String> sequenceList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(p.isEmpty()){
                return list;
            }
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sequenceList(p+ch,up.substring(1));
        ArrayList<String> right = sequenceList(p,up.substring(1));

        left.addAll(right);
        return left;
    }
    public static ArrayList<Integer> seqAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<Integer>list = new ArrayList<>();

            if(p.length()==1){
                list.add((int)(p.charAt(0)));
            }
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<Integer> left = seqAscii(p+ch,up.substring(1));
        ArrayList<Integer> right = seqAscii(p,up.substring(1));

        left.addAll(right);

        return left;
    }

}
