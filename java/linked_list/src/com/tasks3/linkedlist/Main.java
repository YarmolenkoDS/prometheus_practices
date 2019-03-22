package com.tasks3.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(43);
        list.printlist();
        System.out.println("list size: " + list.size());
        System.out.println("element whose index 0: " + list.get(0));
        System.out.println("element whose index 1: " + list.get(1));
        System.out.println("element whose index 2: " + list.get(2));
        System.out.println("element whose index 3: " + list.get(3));
        System.out.println("removal was successful:" + list.delete(0));
        System.out.println("list size: " + list.size());
        list.printlist();
        System.out.println("element whose index 0: " + list.get(0));
    }
}
