public class Solution {
    
    public static void main(String[] args) {
        int num = 1234567890;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        
        int reversedNum = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        while(x != 0){
            int digit = x % 10;
            
            // this is to make sure that the digit we are going to add to the reversedNum doesn't exceed 2147483647
            // reversedNum > max/10 -> the current reversedNum shouldn't be greater than 214748364
            // If the reversedNUm is equal to 214748364, we have to make sure that the digit is not greater than 7
            if(reversedNum > max/10 || (reversedNum == max/10 && digit > max%10))
                return 0;
            
            // this is to make sure that the digit we are going to add to the reversedNum doesn't go below -2147483647
            if(reversedNum < min/10 || (reversedNum == min/10 && digit < min%10))
                return 0;
            
            x = x/10;
            reversedNum = reversedNum * 10 + digit;
        }
        return reversedNum;
        
    }
}
