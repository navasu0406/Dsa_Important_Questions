public class Valid_Anagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = solution(s, t);

        System.out.println("Is Anagram: " + result);
    }

    public static boolean solution(String s, String t) {
        if(s.length()!=t.length())return false;

        int [] alpha=new int[26];

        for(int i=0; i<s.length(); i++)
        {
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }

        for(int i=0; i<alpha.length; i++)
        {
            if(alpha[i]!=0)return false;
        }
        return true;
    }
}
