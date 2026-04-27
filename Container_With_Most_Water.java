public class Container_With_Most_Water {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = solution(height);

        System.out.println("Max Area: " + result);
    }

    public static int solution(int[] arr) {
        int l=0;
        int r=arr.length-1;
         int max=0;
        while(l<r)
        {
            int h=Math.min(arr[l],arr[r]);
            int w=r-l;

            max=Math.max(max,w*h);
            if(arr[l]<arr[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
