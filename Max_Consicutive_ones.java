public class Max_Consicutive_ones {
    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,1};

        int result = solution(arr);

        System.out.println("Max consecutive ones: " + result);
    }

    public static int solution(int[] arr) {
        int max=0;

        int count=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max,count);
            }
            if(arr[i]!=1)
            {
                count=0;
            }
        }

        return max;
    }
}
