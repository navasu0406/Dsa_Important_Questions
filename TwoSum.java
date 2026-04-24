import java.util.Arrays;
import java.util.*;

class TwoSum{
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        int[] result = solution(arr, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            int key=target-arr[i];

            if(map.containsKey(key))
            {
                return new int[]{map.get(key),i};
            }
           
                map.put(arr[i],i);
            
        }
        

        return new int[]{-1,-1};
    }
}