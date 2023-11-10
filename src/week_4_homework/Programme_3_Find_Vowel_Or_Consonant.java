package week_4_homework;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_Find_Vowel_Or_Consonant {

    public static void checkVowelOrConsonant(String letter) {
        //check length of string
        //if user enter more than pne character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error. Not a single character");
            //if user enters a symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lower case letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is a consonant");
        }
    }

    //method to check is it a letter or not
    public static boolean isItALetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any charater : ");
        String str = scanner.next().toLowerCase();

        //calling method
        checkVowelOrConsonant(str);

        //closing object
        scanner.close();
    }
}
