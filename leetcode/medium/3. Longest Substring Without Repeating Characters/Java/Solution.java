import java.util.HashSet;

class Solution {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int pointer_one = 0;
        int pointer_two = 0;
        int max = 0;
        
        HashSet<Character> hashSet = new HashSet();

        while(pointer_two < s.length()){
            if(!hashSet.contains(s.charAt(pointer_two))){
                hashSet.add(s.charAt(pointer_two));
                pointer_two++;
                max = Math.max(hashSet.size(), max);                
            }else{
                hashSet.remove(s.charAt(pointer_one));
                pointer_one++;
            }            
        }
        System.out.println(hashSet);
        return max;
    }
}