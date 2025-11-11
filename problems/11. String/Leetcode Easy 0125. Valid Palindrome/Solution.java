public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution sol = new Solution();
        System.out.println(s + " isPalindrome "+ sol.isPalindrome(s));    
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            } else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }
}
