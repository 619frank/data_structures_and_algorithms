import java.util.List;
import java.util.ArrayList;

public class PermutationsRecursion {
    
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        PermutationsRecursion pr = new PermutationsRecursion();
        pr.permute(list, result, 0);

        for(List<Integer>res : result){
            System.out.println(res);
        }
    }

    private void permute(List<Integer> list, List<ArrayList<Integer>> result, int l){

        if(l == list.size()){
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = l; i < list.size(); i++){
            swap(list, l, i);
            permute(list, result, l+1);
            swap(list, l, i);
        }
    }

    private void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
