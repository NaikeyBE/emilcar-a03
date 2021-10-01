package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Naikey Emilcar
 */

public class Solution25 {

    //define password strengths
    public static final int VERYWEAK  = 1;
    public static final int WEAK = 2;
    public static final int STRONG = 3;
    public static final int VERYSTRONG = 4;

    //determine if password is at least of 8 characters
    public static boolean lengthChecker(String password){


        return false;
    }

    //first calls lengthChecker, if true scans all string elements for only numbers
    public static int numberChecker(String password){

        return VERYWEAK;
    }

    //first calls lengthChecker, if true scans all string elements for only letter
    public static int letterChecker(String password){

        return WEAK;
    }

    //call both lengthChecker and numChecker
    public static int letterAndNumberChecker(String password){

        return STRONG;
    }

    //check presence of any special character
    public static int specialChecker(String password){

        return VERYSTRONG;
    }


    public static void main(String[] args){

        //initialize password strength

        //scan user input

        //call prototype function in strength order

        //output result
    }
}
