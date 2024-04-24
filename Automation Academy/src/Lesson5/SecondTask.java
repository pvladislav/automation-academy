package Lesson5;

/*
2. Write a method that takes a string and determines whether it is a palindrome (reads the same forwards and backwards).
For example, "level" is palindrome.
 */

public class SecondTask {
    public static void main(String[] args) {
        palindrome("level");
    }
    static void palindrome (String word) {
        String word2 = "";
        char temp;

        //Creating reverse of string 'word'
        for (int i = word.length()-1; i >= 0; i--) {
            temp = word.charAt(i);
            word2 += temp;
        }

        //Comparing word with word2
        if (word.equals(word2)) {
            System.out.println("The \"" + word + "\" word is palindrome.");
        }
        else {
            System.out.print("The \"" + word + "\" word is NOT palindrome.");

        }
    }
}
