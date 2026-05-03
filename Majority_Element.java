
public class Majority_Element {
    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        int result = solution(arr);

        System.out.println("Majority Element: " + result);
    }

    public static int solution(int[] arr) {
        
        int ele=arr[0];
        int count=0;

        for(int i=0; i<arr.length; i++)
        {
            if(count==0)
            {
                ele=arr[i];
            }
            if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}
