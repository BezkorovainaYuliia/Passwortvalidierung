package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
    }

    public static boolean isPasswordLong(String password) {
        return password.length() >= 8;
    }

}