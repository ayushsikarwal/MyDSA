import java.util.ArrayList;
import java.util.List;

public class MobilePad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padList("","123"));
        System.out.println(padCount("","123"));
    }
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
    public static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> toReturn = new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i);
            toReturn.addAll(padList(p+ch, up.substring(1)));
        }
        return toReturn;
    }
    public static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';
        int res =0;
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i);
            res+=padCount(p+ch,up.substring(1));
        }
        return res;
    }
}
