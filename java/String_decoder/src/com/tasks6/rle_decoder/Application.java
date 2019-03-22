package com.tasks6.rle_decoder;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        String expectedRezult = "Hhhhhhhhhhhhhheeeellooooo";    //Hh9h4h4e4l2o5
        StringBuilder actualString = new StringBuilder();
        ArrayList<String> counter = new ArrayList<String>();
        if (args == null) {
            throw new NullPointerException();
        } else if (args[0] == null) {
            throw new NullPointerException();
        } else if (args[0].equals("") || !args[0].matches("([a-zA-Z]+\\d?)+")) {
            System.out.print("");
        } else {
            String intputString = args[0];
            for (int i = 0; i < intputString.length(); i++) {
                if (i < intputString.length() - 1) {
                    int current = i;
                    int next = i + 1;
                    if (intputString.charAt(current) == intputString.charAt(next)) {
                        System.out.print("");
                        return;
                    } else if (("" + intputString.charAt(current)).matches("[a-zA-Z]")
                            && ("" + intputString.charAt(next)).matches("[a-zA-Z]")) {
                        counter.add("" + intputString.charAt(i));
                    } else if (("" + intputString.charAt(current)).matches("[a-zA-Z]")
                            && ("" + intputString.charAt(next)).matches("\\d")) {

                        int amount = Integer.parseInt("" + intputString.charAt(next));
                        for (int j = 0; j < amount; j++) {
                            counter.add("" + intputString.charAt(current));
                        }
                    }
                } else if (i == intputString.length() - 1) {
                    if (("" + intputString.charAt(i)).matches("[a-zA-Z]")) {
                        counter.add("" + intputString.charAt(i));
                    }
                }
            }
            for (String el : counter) {
                actualString.append(el);
            }
//            System.out.println("Expected rezult : " + expectedRezult);
            System.out.println("Actual rezult : " + actualString.toString());
//            System.out.println(expectedRezult.equals(actualString.toString()));
        }
    }
}
