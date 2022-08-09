package com.company.hometask.fifth.lists;

import com.company.hometask.fifth.objects.Home;

public class HomeList {
    Node head;

    class Node {
        Home data;
        Node next;

        public Node(Home data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to add a new Node
    public void pushNode(Home data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //Displaying the elements in the list
    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null" + "\n");
    }

    // Finding the length of the list
    public int getLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public int getSquaresOfHomes() {
        Home home;
        int result = 0;
        Node temp = head;

        while (temp != null) {
            home = temp.data;
            result += home.getSquare();
            temp = temp.next;
        }
        return result;
    }


}
