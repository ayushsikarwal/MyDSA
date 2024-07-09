public class SBquesstions {
    public static void main(String[] args) {
        String str = "abcdcba";
        SB(str);

    }
    static int SB(String ayush){
        int start = 0;
        int end = ayush.length()-1;
        String as = "String is pallindrome";
        while (start<=end){
            if(ayush.charAt(start)==ayush.charAt(end)){
                start++;
                end--;
            }if (ayush.charAt(start)!=ayush.charAt(end)){
                System.out.println("String is not pallindrome");
                return 0;
            }
        }
        System.out.println("String is pallindorme");
        return 0;
    }
}
