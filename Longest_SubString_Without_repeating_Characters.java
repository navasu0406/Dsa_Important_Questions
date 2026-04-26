import java.util.*;
public class Longest_SubString_Without_repeating_Characters {
     public static void main(String[] args) {

        String s = "abcabcbb";

        int result = solution(s);

        System.out.println("Longest length: " + result);
    }

    public static int solution(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        int l=0;
        int max=0;
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);

            if(map.containsKey(c))
            {
                l=Math.max(l,map.get(c)+1);
            }
            map.put(c,i);

            max=Math.max(max,i-l+1);
        }

        return max;
    }
}
