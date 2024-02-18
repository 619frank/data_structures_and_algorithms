class Solution {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(longestPalindromeOn2(s));
    }

    public static String longestPalindromeOn2(String s) {
        
        if(s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            int lenOdd = expandFromMiddle(s, i, i);
            int lenEven = expandFromMiddle(s, i, i+1);
            int lenMax = Math.max(lenOdd, lenEven);
            if(lenMax > end - start){
                start = i - ((lenMax - 1)/ 2);
                end = i + (lenMax/2);
            }
        }
        
        return s.substring(start, end+1);
        
    }
    
    public static int expandFromMiddle(String s, int left, int right){
        
        if(s == null || left > right) return 0;
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++; 
        }
        
        return right - left -1;
        
    }
}