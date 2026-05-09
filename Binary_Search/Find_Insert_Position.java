public class Find_Insert_Position {
public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 7;

        int result = solution(arr, target);

        System.out.println("Position: " + result);
    }

    public static int solution(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(arr[mid]>=target)
            {
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
}
