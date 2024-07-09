import java.util.*;
public class Sawaal {
    public static void main(String[] args) {
     String s = "paper";
     String t = "title";
     StringBuilder sb = new StringBuilder(t);

     int count =0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }
        System.out.println(count);
        System.out.println(s==t);
        isIsomorphic(s,t);
        System.out.println((int)('A') );
        System.out.println((char)('A'+32));
        System.out.println(t);
        System.out.println((char)(t.charAt(2)-32));
    }
    public static void isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<Character,Character>();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),t.charAt(i));
            }
        }
        for(int i =0; i<s.length(); i++){
            sb.append(map1.get(s.charAt(i)));
        }
        System.out.println(sb.toString());
//        if(sb.toString()!=t){
//            return false;
//        }
//        return true;
    }
}