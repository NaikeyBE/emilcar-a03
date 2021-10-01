package baseline;
import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Naikey Emilcar
 */

public class Solution24 {

    public static Scanner in = new Scanner(System.in);


    public static boolean lengthChecker(String word1, String word2){

        //first check if the word have similar length
        if(word1.length() != word2.length()) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean isAnagram(String word1, String word2){

        //convert both strings to arrays
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        //sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        //compare the two received arrays
        for(int i = 0; i < word1.length(); i++){

            if(array1[i] != array2[i]){
                return false;
            }
        }

        return true;

    }

    public static void inputPrompt1(){

        //Ask for first string
        System.out.println("Enter the first string: ");

    }

    public static void inputPrompt2(){

        //Ask for second string
        System.out.println("Enter the second string: ");

    }

    public static void main(String[] args){

        inputPrompt1();
        String word1 = in.nextLine();

        inputPrompt2();
        String word2 = in.nextLine();

        //call length checker method
        if(lengthChecker(word1, word2) == false){

            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1 ,word2);
        }

        //Call anagram checker method
        else if(isAnagram(word1, word2) == false){

            //display result of anagram checker
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1 ,word2);;

        }

        else
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1 ,word2);

    }

}
