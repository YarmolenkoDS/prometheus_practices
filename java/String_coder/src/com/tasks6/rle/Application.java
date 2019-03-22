package com.tasks6.rle;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        StringBuilder actualString = new StringBuilder();
        Integer count = 1;
        ArrayList<String> counter = new ArrayList<String>();
        if (args == null) {
            throw new NullPointerException();
        } else if (args[0].equals("")) {
            System.out.print("");
        } else {
            String intputString = args[0];
            for (int i = 0; i < intputString.length(); i++) {
                if (i < intputString.length() - 1) {
                    if ((intputString.charAt(i)) == ((intputString.charAt(i + 1)))) {
                        count++;
                    } else {
                        counter.add("" + intputString.charAt(i));
                        counter.add(count == 1 ? "" : ((count >= 2 && count <= 9) ? count.toString()
                                : (count > 9 ? ("9" + ("" + intputString.charAt(i) + (count % 9))) : "")));
                        count = 1;
                    }
                } else if ((i == intputString.length() - 1) && (intputString.charAt(i)) == ((intputString.charAt(i - 1)))) {
                    counter.add("" + intputString.charAt(i));
                    counter.add(count == 1 ? "" : ((count >= 2 && count <= 9) ? count.toString()
                            : (count > 9 ? ("9" + ("" + intputString.charAt(i) + (count % 9))) : "")));
                    ;
                } else if ((i == intputString.length() - 1) && (intputString.charAt(i)) != ((intputString.charAt(i - 1)))) {
                    counter.add("" + intputString.charAt(i));
                }
            }
            for (String el : counter) {
                actualString.append(el);
            }
            System.out.print(actualString.toString());
        }
    }
}
