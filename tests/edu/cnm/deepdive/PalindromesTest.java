package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromesTest {

  @ParameterizedTest
  @CsvFileSource(resources = "/affirmative.csv")
  void isPalindrome_affirmative(String testCase) {
    assertTrue(Palindromes.isPalindrome(testCase));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/negative.csv")
  void isPalindrome_negative(String testCase) {
    assertFalse(Palindromes.isPalindrome(testCase));
  }

}