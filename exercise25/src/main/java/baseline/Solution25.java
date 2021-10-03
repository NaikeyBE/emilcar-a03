package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Naikey Emilcar
 */

public class Solution25 {

    public static final Scanner in = new Scanner(System.in);

    //determine if password is at least of 8 characters
    public static boolean lengthChecker(String password){

        return password.length() >= 8;
    }

    //scans all string elements for only numbers
    public static boolean numberChecker(String password){

        char[] numbArray = password.toCharArray();
        int length = password.length();

        for(int i = 0; i < length; i++){

            if(!Character.isDigit(numbArray[i])){

                return false;
            }
        }
        return true;
    }

    //scans all string elements for only letters
    public static boolean letterChecker(String password){

        char[] numbArray = password.toCharArray();
        int length = password.length();

        for(int i = 0; i < length; i++){

            if(!Character.isLetter(numbArray[i])){

                return false;
            }
        }
        return true;
    }

    //call both lengthChecker and numChecker
    public static boolean letterAndNumberChecker(String password){

        char[] numbArray = password.toCharArray();
        int length = password.length();

        for(int i = 0; i < length; i++){

            if(!(numbArray[i] >= 'A' && numbArray[i] <= 'Z')
                    && !(numbArray[i] >= 'a' && numbArray[i] <= 'z')
                    && !(numbArray[i] >= '0' && numbArray[i] <= '9'))
                return  false;
        }
        return true;
    }


    //check presence of any special character
    public static boolean specialChecker(String password){

        char[] numbArray = password.toCharArray();
        String specialArray = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        int length = password.length();

        for(int i = 0; i < length; i++){

            if(specialArray.contains(Character.toString(numbArray[i]))) {
                return true;
            }
        }
        return false;
    }

    public static  void outputPrompt(String password, String strength){

        System.out.println("The password " +password + strength + " password");
    }


    public static void main(String[] args) {

        //initialize password strength and length
        String strength = " is an unknown strength";

        //scan user input
        String password = in.nextLine();

        //call prototype function in strength order
        if (!lengthChecker(password)) {

            if (numberChecker(password)) {

                strength = " is a very weak";

            }

            else if (letterChecker(password)){

                strength = " is a weak";
            }
        }
        else{

            if(letterAndNumberChecker(password)){

                strength = " is a strong";
            }
            else if(specialChecker(password)){
                strength = " is a very strong";
            }
        }
        //output result
        outputPrompt(password, strength);
    }
}
