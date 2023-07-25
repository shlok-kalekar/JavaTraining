//Write programs to accept any word and check whether the word is palindrome or not.
import java.io.*;

public class PalindromeTest {

    public boolean checkPalindrome(String word){
        int i = 0, j;
        boolean flag = false, checker = false;
        word = word.toLowerCase().trim();
        int len = word.length();
        j = len-1;
        while (flag == false) {
            if (word.charAt(i) == word.charAt(j)){
                if (i == len - 1) {
                    checker = true;
                    flag = true;
                }
                i++;
                j--;
                continue;
            }
            else
                break;
        }
        return checker;
    }

    public String printAnswer(boolean checker){
        String answer;
        if(checker == true)
            answer = "It is a Palindrome";
        else
            answer = "It is not a Palindrome";
        return answer;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word: ");
        String word = br.readLine();
        PalindromeTest p1 = new PalindromeTest();
        boolean checker = p1.checkPalindrome(word);
        String answer = p1.printAnswer(checker);
        System.out.println(answer);
    }
}
