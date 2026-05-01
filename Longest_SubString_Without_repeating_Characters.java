import java.util.*;
public class Longest_SubString_Without_repeating_Characters {
     public static void main(String[] args) {

        String s = "abcabcbb";

        int result = solution(s);

        System.out.println("Longest length: " + result);
    }

    public static int solution(String s) {
        int max=0;

        HashMap<Character,Integer> map=new HashMap<>();

        int l=0;
        for(int r=0; r<s.length(); r++)
        {
            char c=s.charAt(r);
            if(map.containsKey(c))
            {
               l=Math.max(l,map.get(c)+1);
            }
            map.put(c,r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
