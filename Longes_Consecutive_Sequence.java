import java.util.*;
public class Longes_Consecutive_Sequence {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = solution(arr);

        System.out.println("Longest Consecutive Length: " + result);
    }

    // Implement this function
    public static int solution(int[] arr) {
        
       int max=0;
       HashSet<Integer> set=new HashSet<>();
        for(int n:arr)
        {
          set.add(n);
        }

        for(int num:set){

            if(!set.contains(num-1))
            {
                int curr=num;
                int count=1;

                while(set.contains(curr+1))
                {
                    count++;
                    curr++;
                }
                max=Math.max(max,count);
            }
        }


        return max;
        
    }
}
