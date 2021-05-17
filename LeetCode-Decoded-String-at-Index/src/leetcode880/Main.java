package leetcode880;

public class Main {
	public static void main(String[] args){
		String S = "leet2code3";
		
		int K = 10;
		
		System.out.println("Input: " + S + " K: " + K );
		
		GetDecodeLetterAtIndexFunction solution = new GetDecodeLetterAtIndexFunction();
		
		System.out.println("Solution: " + solution.decodeAtIndex(S, K));
		
	}
     
}
