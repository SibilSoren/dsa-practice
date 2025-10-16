package Questions.Arrays;

public class ValidAnagram {
    static void main() {
        String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t){
        int[] charCount = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int i : charCount ){
            if( i != 0){
                return false;
            }
        }

        return true;
    }
}
