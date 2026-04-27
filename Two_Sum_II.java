import java.util.Arrays;

public class Two_Sum_II {
     public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        int[] result = solution(arr, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr, int target) {
       
         int start=0;
         int end=arr.length-1;

         while(start<end)
         {
            if(arr[start]+arr[end]==target)
            {
                return new int[]{start,end};
            }
            else if(arr[start]+arr[end]<target)
            {
                start++;
            }
            else{
                end--;
            }
         }

        return new int[]{-1,-1};
    }
}
