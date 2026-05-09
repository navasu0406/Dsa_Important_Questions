public class Count_Occurance_of_element_in_sorted_aray {
public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int result = solution(arr, target);

        System.out.println("Count: " + result);
    }

    public static int solution(int[] arr, int target) {
       
        int first=firstocc(arr,target);
        int second=secondocc(arr,target);

        return second-first+1;
    }


    public static int firstocc(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
            
    }
     public static int secondocc(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
            
    }
}
