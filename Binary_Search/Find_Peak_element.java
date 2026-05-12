// find peak element in an array this problem is based on binary search where u fined weather 
//arr[i]<arr[i+1] is then move right start=mid+1;
public class Find_Peak_element {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        int result = solution(arr);

        System.out.println("Peak Index: " + result);
    }

    public static int solution(int[] arr) {

        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;

    }
}
