public class Max_Sub_Array_Sum {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int result = solution(arr);

        System.out.println("Max Subarray Sum: " + result);
    }

    public static int solution(int [] arr)
    {
        int max=Integer.MIN_VALUE;

        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }

}
