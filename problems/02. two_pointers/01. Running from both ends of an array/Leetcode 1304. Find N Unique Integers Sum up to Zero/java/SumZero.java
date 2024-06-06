import java.util.Arrays;

public class SumZero {
    
    public static void main(String[] args) {
        int n = 5;
        // int n = 4;


        int[] result = new int[n];

        int indexes = 0;
        if( n%2 == 1){
            result[indexes++] = 0;
            n--;
        }
        
        for(int i = 1; i <= n/2; i++){
            result[indexes++] = i;
            result[indexes++] = -i;            
        }

        System.out.println(Arrays.toString(result));
    }
}
