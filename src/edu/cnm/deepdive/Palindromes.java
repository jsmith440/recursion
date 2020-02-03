package edu.cnm.deepdive;

public final class Palindromes {

  private Palindromes() {
  }

  private static boolean isPalindromeClean(String source) {
    return source.length() <= 1
        || (
        source.charAt(0) == source.charAt(source.length() - 1))
        && isPalindromes(source.substring(1, source.length() - 1))
         );
  }

  private static boolean isPalindromes(String substring) {
  }
        
        
}

}

public static boolean isPalindrome(Stringsource){
    }

    }
