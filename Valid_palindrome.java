public class Valid_palindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = solution(s);

        System.out.println("Is Palindrome: " + result);
    }

    public static boolean solution(String s) {
        
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int start=0;
        int end=s.length()-1;

        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))return false;
            
            start++;
            end--;
        }

        return true;
    }
}
