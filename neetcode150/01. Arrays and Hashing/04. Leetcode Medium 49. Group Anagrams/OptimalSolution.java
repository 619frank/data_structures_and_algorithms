import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class OptimalSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<String, List<String>>();

        for(String word : strs){
            int[] lettersCount = new int[26];

            char[] charArray = word.toCharArray();

            for(char letter : charArray){
                lettersCount[letter - 97]++;
            }

            StringBuilder sb = new StringBuilder();

            for(int letterCount: lettersCount){
                sb.append("#");
                sb.append(letterCount);
            }

            String key = sb.toString();

            if(result.containsKey(key)){
                List<String> groupList = result.get(key);
                groupList.add(word);
                result.put(key, groupList);                
            }else{
                List<String> groupList = new ArrayList();
                groupList.add(word);
                result.put(key, groupList);
            }
        }
        return new ArrayList(result.values());
    }
}
