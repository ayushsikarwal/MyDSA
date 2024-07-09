import java.util.Scanner;

public class StringAndArrays {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        System.out.println("The length of the name is " + length);

        // Reverse the string
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        // Check whether the string is a palindrome or not
       // boolean isPalindrome = checkPalindrome(name);
        // so yaha pta laga kuch boolean ke baare me


        if (checkPalindrome(name)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        reverseString(name);

        //String sentence = sc.nextLine();

    //function
        maximumOccuring(name);

    //function
        replaceSpaces(name);
        System.out.println("substring u wanna remove from this string :-");
        String toRemove = sc.nextLine();
        substringRemove(name, toRemove);

    }

    private static boolean checkPalindrome(String abc) {
        int length = abc.length();

        for (int i = 0; i < length / 2; i++) {
            if (abc.charAt(i) != abc.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
    //function of reversing the string, just for fun;
    private static void reverseString(String num){
        int z = num.length();
        for (int k = z - 1; k >= 0; k--) {
            System.out.print(num.charAt(k));
        }
        System.out.println();

    }
    //count for maximum occuring alphabet in a string
    private static void maximumOccuring(String s){
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int number =0;
            if(ch>='a' && ch<='z'){
                number = ch-'a';
            }
            if(ch>='A' && ch<='Z'){
                number = ch-'A';
            }
            if(ch==' '){
                continue;
            }
            arr[number]++;
        }
        int maxi=0;
        int ans =0;
        for(int i=0; i<26;i++){
            if(maxi<arr[i]){
                ans = i;
                maxi=arr[i];
            }
        }
        char finalAnswer = (char) ('a' + ans);
        System.out.println("maximum occuring alphabet in the string is "+finalAnswer);
    }
    private static void replaceSpaces(String s) {
        s = s.replaceAll(" ", "@40");
        System.out.println(s);
    }
    //function to remove substring from a string
    private static void substringRemove(String s, String toRemove) {
         for(int i=0; i<s.length();i++){
             if(s.charAt(i)=='a'&& s.charAt(i+1)=='b'&& s.charAt(i+2)=='c'){
                 s = s.replaceAll("abc", "");
             }
         }
        System.out.println(s);
    }
}
