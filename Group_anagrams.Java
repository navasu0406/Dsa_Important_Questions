//Hashing problem
import java.util.*;

public class Group_Anagrams {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = solution(strs);

        System.out.println(result);
    }

    public static List<List<String>> solution(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char [] c=s.toCharArray();
            Arrays.sort(c);

            String key=new String(c);

            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());

    }
}