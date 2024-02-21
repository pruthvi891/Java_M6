/*A program to check Temp 0 to 50*/

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        float t = 66;
        Scanner sc=new Scanner(System.in);

        String res = (t >= 0 && t < 10) ? ("Very cold"):
                (t >= 10 && t < 20) ? ("Cold"):
                             (t >= 20 && t < 30) ? ("Moderate"):
                                     (t >= 30 && t < 40) ? ("Summer"):
                                             (t >= 40 && t < 50) ? ("Very Hot"):
                                                     ("");


        System.out.println(res);
    }
}
