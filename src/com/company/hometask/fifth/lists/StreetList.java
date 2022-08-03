package com.company.hometask.fifth.lists;

import com.company.hometask.fifth.objects.Home;
import com.company.hometask.fifth.objects.Street;

public class StreetList {
    Node head;

    class Node {
        Street data;
        Node next;

        public Node(Street data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to add a new Node
    public void pushNode(Street data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
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

    public int getAllSquare() {
       Street street;
        int result = 0;
        StreetList.Node temp = head;

        while (temp != null) {
            street = temp.data;
            result += street.getSquare();
            temp = temp.next;
        }
        return result;
    }

    public int getHomesCountFromStreet(){
        int result = 0;
        Street street;
        StreetList.Node temp = head;

        while (temp != null) {
            street = temp.data;
            result += street.getHomesCount();
            temp = temp.next;
        }
        return result;
    }


}
