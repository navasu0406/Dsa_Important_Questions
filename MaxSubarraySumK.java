import java.util.*;
class MaxSubarraySumK{
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 2, 3};
        int k = 6;

        System.out.println("Longest Length: " + longestSubarray(arr, k));
    }

    public static int longestSubarray(int [] arr,int k)
    {
        int max=0;
        int presum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<arr.length; i++)
        {
            presum+=arr[i];

            if(map.containsKey(presum-k))
            {
                max=Math.max(max,i-map.get(presum-k));
            }
            if(!map.containsKey(presum))
            {
                map.put(presum,i);
            }
        }
        return max;
    }

}