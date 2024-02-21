/*A Java Program to check the given Character is upperCase or lowerCase*/

import java.util.Scanner;
class UpperLowerCase{
    public static void main(String[] args) {
        char ch='n';
        String result=((ch>=65 && ch<=90)) ? (ch+" is in Upper Case.") : (ch+" is in Lower Case.");
        System.out.println(result);
    }
}
