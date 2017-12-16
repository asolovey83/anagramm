package Anagramm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramm {

    public static boolean checkStrings(String a, String b)
    {
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();
        Arrays.sort(charArray1);
        System.out.println(charArray1);
        Arrays.sort(charArray2);
        System.out.println(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }

    public static void main(String[] args) {

        System.out.println("Please, enter two strings:");

        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        System.out.println(checkStrings(string1, string2));
    }
}
