package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        String[][] a = {
                {"b", "c", "d"},
                {"e", "f", "g"},
                {"h", "i", "j"},
        };

        for (int j = 0; j < a.length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < a[0].length; i++)
                    System.out.print(a[i][j] + " ");

            } else {
                for (int i = a[0].length - 1; i >= 0; i--)
                    System.out.print(a[i][j] + " ");
            }
        }

    }
}


