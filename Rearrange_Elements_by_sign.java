import java.util.*;
public class Rearrange_Elements_by_sign {
     public static void main(String[] args) {

        int[] arr = {3,1,-2,-5,2,-4};

        int[] result = solution(arr);

        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] arr) {
        int pos=0;
        int neg=1;

        int [] result=new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=0)
            {
                result[pos]=arr[i];
                pos=pos+2;
            }
            else{
                result[neg]=arr[i];
                neg=neg+2;
            }
        }
        return result;
    }
}
