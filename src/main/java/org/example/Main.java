package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
    }

    public static boolean isPasswordLong(String password) {
        return password.length() >= 8;
    }

    public static boolean isNummers(String password) {
        String nummers = "0123456789";
        for(char c : password.toCharArray()) {
            if(Character.isDigit(c)) {
                return true;
            }
        }
         return  false;
    }
}