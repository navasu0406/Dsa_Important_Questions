import java.util.HashSet;
public class Conntains_Duplicate {
    public static void main(String[] args) {
        int [] arr={1,2,3,6,5,4,9,9,8,7};
        System.out.println(solution(arr));
    }
    public static boolean solution(int [] arr)
    {
        HashSet<Integer> set=new HashSet<>();

        for(int n:arr)
        {
            if(set.contains(n))
            {
                return true;
            }
            set.add(n);
        }
        return false;


    }
}
