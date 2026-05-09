public class First_and_Last_Occurrence_of_element {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        int[] result = solution(arr, target);

        System.out.println("First: " + result[0]);
        System.out.println("Last: " + result[1]);
    }

    public static int[] solution(int[] arr, int target) {
       int first=firstoccurence(arr,target);
       int last=secondoccurence(arr,target);


       return new int []{first,last};
    }

    public static int firstoccurence(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int result=-1;
          
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                result =mid;
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
    public static int secondoccurence(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int result=-1;
          
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                result =mid;
                start=mid+1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
}
