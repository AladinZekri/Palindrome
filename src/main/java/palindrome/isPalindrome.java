package palindrome;
import java.util.stream.IntStream;

class Main {
  public static void main(String[] args) {

      
      System.out.println("est ce que le mot ala est palinddrome? - " + isPalindrome("ala")); 

     
      System.out.println("est ce que le mot zekri est palinddrome? - " + isPalindrome("zekri"));
  }

  public static boolean isPalindrome(String originalString) {

      String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

      return IntStream.range(0, tempString.length() / 2)
        .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

  }
}