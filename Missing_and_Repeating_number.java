import java.util.*;
class Missing_and_Repeating_number{
    public static void main(String[] args) {

        int[] arr = {4,3,6,2,1,1};

        int[] result = solution(arr);

        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }

    public static int[] solution(int[] arr) {
        int [] result=new int[2];

        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(set.contains(arr[i]))
            {
                result[0]=arr[i];
            }
            else{
                 set.add(arr[i]);
                 sum+=arr[i];
            }
            
           
        }

        int n=arr.length;
        int expected=n*(n+1)/2;

        result[1]=expected-sum;

        return result;
    }
}