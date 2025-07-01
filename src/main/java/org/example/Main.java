package org.example;

import java.util.Random;

public class Main {
    static String[] BAD_PASSWORDS = {"q1w2e3r4t5y", "passwort1", "password", "qwerty", "1234567890", "00000000", "abcdef", "qwerty123", "11111111"};

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

    public static boolean isBadPassword(String password) {
        String lowerCasePassword = password.toLowerCase();
        for (String fuuuPassword : BAD_PASSWORDS) {
            if (lowerCasePassword.equals(fuuuPassword)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialCharacters(String password) {
        String specialCharacters = "!@#$%^&* ";
        for (char specialChar : specialCharacters.toCharArray()) {
            if (password.contains(specialChar + "")) {
                return true;
            }
        }
        return false;
    }

    public static String getNewPassword() {

        Random random = new Random();
        StringBuilder newPassword = new StringBuilder();
        char abc;
        String Letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&* ";

        abc = Character.toUpperCase(Letters.charAt(random.nextInt(Letters.length())));
        newPassword.append(abc);
        abc = Letters.charAt(random.nextInt(Letters.length()));
        newPassword.append(abc);
        abc = numbers.charAt(random.nextInt(numbers.length()));
        newPassword.append(abc);
        abc = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        newPassword.append(abc);

        for (int i = 0; i < 5; i++) {
            boolean isLetter = random.nextBoolean();
            if (isLetter) {
                boolean isBigLetter = random.nextBoolean();
                if (isBigLetter) {
                    abc = Character.toUpperCase(Letters.charAt(random.nextInt(Letters.length())));
                } else {
                    abc = Letters.charAt(random.nextInt(Letters.length()));
                }

            }
            else{
                boolean isNumber = random.nextBoolean();
                if (isNumber) {
                    abc = numbers.charAt(random.nextInt(numbers.length()));
                }else{
                    abc = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
                }

            }
            newPassword.append(abc);
        }
        return newPassword.toString();
    }
}