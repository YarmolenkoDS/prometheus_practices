package com.tasks3.fibonacci;

public class Fibonacci {
    public static long getNumber(int position){
        //PUT YOUR CODE HERE
        if (position <= 0) {
            return -1;
        } else if (position == 1) {
            return 1;
        } else if (position == 2) {
            return 1;
        } else {
            return getNumber(position - 1) + getNumber(position - 2);
        }
        //PUT YOUR CODE HERE
    }

    public static void main(String[] args) {
        System.out.print(getNumber(7));
    }
}
