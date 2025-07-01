package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
    }

    public static boolean isPasswordLong(String password) {
        return password.length() >= 8;
    }

    public static boolean isNummers(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAlphabet(String password) {
        boolean isOneBigLetter = false;
        boolean isOneSmallLetter = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                isOneSmallLetter = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                isOneBigLetter = true;
            }

        }

        return isOneBigLetter && isOneSmallLetter;
    }
}