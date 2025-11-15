import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            Character currentChar = s.charAt(i);
            if(map.containsKey(currentChar)){
                map.put(currentChar, map.get(currentChar) +1);
            }else{
                map.put(currentChar, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            Character currentChar = t.charAt(i);
            if(!map.containsKey(currentChar) || map.get(currentChar) == 0){
                return false;
            }

            map.put(currentChar, map.get(currentChar) -1);
        }
        return true;
    }
}