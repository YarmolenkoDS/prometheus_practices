package com.tasks3.linkedlist;

public class LinkedList {

    private Node first;
    private Node last;
    private Node current;
    private Node prev;
    private int count;


    public LinkedList() {
        //PUT YOUR CODE HERE
        this.first = new Node();
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        if (first.getData() == null) {
            first.setData(data);
            last = first;
            count++;
        } else {
            current = new Node();
            current.setData(data);
            last.setNext(current);
            last = current;
            count++;
        }
        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        //PUT YOUR CODE HERE
        int tempCount = 0;
        current = first;
        if (index >= 0 && index < size()) {
            while (current.getNext() != null && tempCount != index) {
                current = current.getNext();
                tempCount++;
            }
            return current.getData();
        } else {
            return null;
        }
        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        int tempCount = 0;
        current = first;
        if (index > 0 && index < size()) {
            while (current.getNext() != null && tempCount != index) {
                prev = current;
                current = current.getNext();
                tempCount++;
            }
            prev.setNext(current.getNext());
            current.setNext(null);
            count--;
            return true;
        } else if (index == 0 && first.getData() != null && first.getNext() != null) {
            first = current.getNext();
            count--;
            return true;
        } else if (index == 0 && first.getData() != null && first.getNext() == null) {
            first.setData(null);
            count--;
            return true;
        } else {
            return false;
        }
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        return count;
        //PUT YOUR CODE HERE
    }
    public void printlist() {
        current = first;
        while (current.getNext() != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println(current.getData());
    }
}
