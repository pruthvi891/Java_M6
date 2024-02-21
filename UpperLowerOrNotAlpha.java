
/*A Java Program for the given Character is upperCase or lowerCase or it is not an Alphabet*/

import java.util.Scanner;
class UpperLowerOrNotAlpha{
    public static void main(String[] args) {
        char ch='Z';
        String result=((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) ? ((ch>=65 && ch<=90)?(ch+" is in Upper Case."):(ch+" is in Lower Case.")): (ch+" is not an Alphabet.");
        System.out.println(result);
    }
}
