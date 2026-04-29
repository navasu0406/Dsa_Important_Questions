public class Find_Missing_Number {
    public static void main(String[] args) {

        int[] arr = {3,0,1};

        int result = solution(arr);

        System.out.println("Missing number: " + result);
    }

    public static int solution(int[] arr) {
         int sum=0;
         int n=arr.length;
         int expectedsum=n*(n+1)/2;

         for(int i=0; i<arr.length; i++)
         {
            sum+=arr[i];
         }
          


         return expectedsum-sum;
    }
}
