public class FLoor_and_Ceil {
     public static void main(String[] args) {

        int[] arr = {1,2,4,4,5,6};
        int target = 3;

        int floor = floor(arr, target);
        int ceil = ceil(arr, target);

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static int floor(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int floor=-1;

        while(start<=end)
        {
              int mid=start+(end-start)/2;

              if(arr[mid]<=target)
              {
               floor=arr[mid];
               start=mid+1;
              }
              else{
                end=mid-1;;
              }
        }
        return floor;
    }

    public static int ceil(int[] arr, int target) {
         int start=0;
        int end=arr.length-1;
        int floor=-1;

        while(start<=end)
        {
              int mid=start+(end-start)/2;

              if(arr[mid]>=target)
              {
                floor=arr[mid];
                end=mid-1;
              }
              else{
                start=mid+1;
              }
        }
        return floor;
    }
}
