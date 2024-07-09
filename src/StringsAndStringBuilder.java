import java.util.Arrays;

public class StringsAndStringBuilder {
    public static void main(String[] args) {
        String a ="ayush";
        String b = "ayush";
        System.out.println(a==b); // both strings are in same pool and poiting toward same string

        String name1 = new String("ayush");
        String name2 = new String("ayush");
        System.out.println(name1==name2); // both strings are in different pool of a heap so showing not equals

        System.out.println(name1.equals(name2));  // it is only comparing values of both string; doesnt matter whether they are in same pool or in different
        System.out.println((char)('Z'-'A'+'a'));
        String name = "Ayush Sikarwal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
