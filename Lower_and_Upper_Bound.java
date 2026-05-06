public class Lower_and_Upper_Bound {
    public static void main(String[] args) {

    int[] arr = {1,2,4,4,5,6};
    int target = 4;

    int lb = lowerBound(arr, target);
    int ub = upperBound(arr, target);

    System.out.println("Lower Bound: " + lb);
    System.out.println("Upper Bound: " + ub);
}

    public static int lowerBound(int arr[],int target)
    {
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
    public static int upperBound(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]>target)
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
