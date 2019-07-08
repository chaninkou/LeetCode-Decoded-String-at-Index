package decoded;

public class Main {
	public static void main(String[] args){
		String S = "leet2code3";
		
		int K = 10;
		
		System.out.println("Input: " + S);
		
		System.out.println("Solution: " + decodeAtIndex(S, K));
		
	}
	
	public static String decodeAtIndex(String S, int K) {
        for(int i = 0, cur = 0; i < S.length(); i++){
            if(Character.isDigit(S.charAt(i))){
                int number = S.charAt(i) - '0';
                
                System.out.println(number);
                
                int count = 0;
                
                // Doing ; since we want to use the if statement below with count
                for(; count < number - 1 && K > cur; count++){
                    K = K - cur;
                }
                
                if(count != (number - 1)){
                    return decodeAtIndex(S,K);
                }else{
                    cur = cur * number;
                }
            }
            else{
                cur++;
                
                K--;
                
                // K-- until K is zero
                if(K == 0){
                    return String.valueOf(S.charAt(i));
                }
            }
        }
                   return "";
    }       
}
