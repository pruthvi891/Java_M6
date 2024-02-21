/*A Java Program to check the given Character is Alphabet or not*/

import java.util.Scanner;
public class CharAlpha {
    public static void main(String[] args) {

        char ch = '@';
        String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? ("The " + ch + " Character is a Alphabet.") : ("The" + ch + " Character is not a Alphabet.");
        System.out.println(result);
    }
}
