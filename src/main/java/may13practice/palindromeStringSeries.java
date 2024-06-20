package may13practice;

public class palindromeStringSeries {

	public static void main(String[] args) {
		

		        String[] words = {"raar", "talented", "deified", "teet", "tenet", "Amrit", "malayalam", "Blob"};

		        for (String word : words) {
		            System.out.println(word);
		            System.out.println("Is palindrome: " + isPalindrome(word));
		        }
		    }

		    public static boolean isPalindrome(String word) {
		        boolean palindromeTestResult = true;

		        if (word.length() % 2 == 1) {
		            int backward = word.length() - 1; // 7-1=6
		            for (int i = 0; i < backward; i++) {
		                if (word.charAt(i) == word.charAt(backward)) {
		                    palindromeTestResult = true;
		                } else {
		                    palindromeTestResult = false;
		                    
		                }
		                backward = backward - 1; // Move the backward index towards the start
		            }
		        } else {
		            palindromeTestResult = false; // If the length is even, it's not a palindrome
		        }

		        return palindromeTestResult;
		    }
		}
