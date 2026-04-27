import java.util.*;
public class SubArray_sum_equaltoK {
    public static void main(String[] args) {

        int[] arr = {1,1,1};
        int k = 2;

        int result = solution(arr, k);

        System.out.println("Count: " + result);
    }

    public static int solution(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int presum=0;
        
        for(int i=0; i<arr.length; i++)
        {
            presum+=arr[i];

        }

        return 0;
    }
}
