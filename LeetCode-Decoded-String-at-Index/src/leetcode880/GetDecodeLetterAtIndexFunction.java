package leetcode880;

public class GetDecodeLetterAtIndexFunction {
    public String decodeAtIndex(String S, int K) {
        long currentLength = 0;
        
        char letter = 0;
        
        // store the total length
        for(int i = 0; i < S.length(); i++){
            letter = S.charAt(i);
            
            // If current index is a digit, then multiply the number of times it appear
            if(Character.isDigit(letter)){
                // letter - '0' to get the integer value
                currentLength = currentLength * (letter - '0');
            } else { // Current index is a letter
                // Update the length increase by 1
                currentLength += 1;
            }
        }
        
        // Start from the end now, whenever we see digit, divide current length with that digit
        for(int end = S.length() - 1; end >= 0; end--){
            letter = S.charAt(end);
            
            // If its a digit, now we divide by that digit
            if(Character.isDigit(letter)){
                currentLength = currentLength / (letter - '0');
                
                // Update K since we want to know which exactly index is the one we are looking for
                K %= currentLength;
            } else {
                // When its not digit, check rather if K is 0 or currentLength is already at K
                if(K == 0 || K == currentLength){
                    // "" so the character will convert to string instead
                    return "" + letter;
                }
                
                // Update the length by decreasing by 1
                currentLength -= 1;
            }
        }
        
        // If it gets here, the input didn't meet the condition
        return null;
    }         
}
