public class Solution {
    
    public static void main(String[] args) {
        
        System.out.println(romanNumberConversion());

    }

    public static String romanNumberConversion(){
        int num = 4365;

        Object[][] romanNumerals = {
            {"I", 1},
            {"IV", 4},
            {"V", 5},
            {"IX", 9},
            {"X", 10},
            {"XL", 40},
            {"L", 50},
            {"XC", 90},
            {"C", 100},
            {"CD", 400},
            {"D", 500},
            {"CM", 900},
            {"M", 1000}
        };

        String romanNumber = "";
        
        for(int i = romanNumerals.length -1; i >= 0; i--){
            if(num != 0){
                String romanString = (String) romanNumerals[i][0];
                int value = (int) romanNumerals[i][1];
                
                // This is the most important part -> num/value will tell us how many Roman literals are there in num
                int count = num/value;
    
                // Forming the roman number with the number of times it is there in num
                String tempRomanString = "";
                for(int j = 0; j < count; j++){
                    tempRomanString += romanString;
                }
                romanNumber = romanNumber + tempRomanString;
    
                // Resetting the num with the remainder for the next iteration
                num = num % value;
            }
        }

        return romanNumber;
    }
}
