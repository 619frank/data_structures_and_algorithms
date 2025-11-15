import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class AverageSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<String, List<String>>();

        for(String word : strs){
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);

            String key = new String(wordArray);

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