import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        String s = "absdbvafappced";
        String abc = "abccababcc";
        StringBuilder sb = new StringBuilder();
//        System.out.println(s.indexOf("z"));
        helper(s, sb, 0);
        System.out.println(sb.toString());
        System.out.println(skipABC(abc));
        System.out.println(skipApp(s));
        int num =12;
        System.out.println(num%10);
        int[]arr = {12,432,2112,1242352,22342-12341};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void helper(String s, StringBuilder sb, int i) {
        if (i < s.length()) {
            char ch = s.charAt(i);
            if (ch != 'a') {
                sb.append(ch);
            }
            helper(s, sb, i + 1); // Move to the next character
        }
    }
    private static String skipABC(String s){
        int index = s.indexOf("abc");
        if(index!=-1){
            s=s.replaceFirst("abc","");
        }else{
            return s;
        }
        return skipABC(s);
    }
    private static String skipApp(String s){
        int index = s.indexOf("apple");
        int index1 = s.indexOf("app");
        if(index==-1 && index1!=-1){
            s=s.replaceFirst("app","");
        }else{
            return s;
        }
        return skipApp(s);
    }

}
