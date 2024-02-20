import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        
        result.add(row1);
        
        for(int i = 0; i < numRows -1; i++){
            List<Integer> tempList = new ArrayList<>();
            tempList.add(0);
            tempList.addAll(result.get(result.size() -1));
            tempList.add(0);
            
            List<Integer> row = new ArrayList<>();
            
            for(int j = 0; j < result.size()+1; j++){
                row.add(tempList.get(j) + tempList.get(j+1));
            }
            result.add(row);
        }
        return result;
    }
}