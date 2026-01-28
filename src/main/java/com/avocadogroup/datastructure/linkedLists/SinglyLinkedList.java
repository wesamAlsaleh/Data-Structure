package com.avocadogroup.datastructure.linkedLists;

import java.util.StringJoiner;

public class SinglyLinkedList {
    /**
     * Head refer to the front of the list
     */
    private Node head;

    /**
     * Size of SinglyLinkedList
     */
    private int size;

    /**
     * Init SinglyLinkedList
     */
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Init SinglyLinkedList with specified head node and size
     *
     * @param head the head node of list
     * @param size the size of list
     */
    public SinglyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    /**
     * Inserts a new node at a specified position of the list
     *
     * @param data     data to be stored in a new node
     * @param position position at which a new node is to be inserted
     */
    public void insertNth(int data, int position) {
        // check if the position is in the range
        checkBounds(position, 0, size);

        // create node instance
        Node newNode = new Node(data);

        // if the head is null
        if (head == null) {
            /* the list is empty */
            head = newNode; // make the head the created node
            size++; // increase the size of the linked list
            return; // return nothing
        }
        // if the position is zero replace the old head
        else if (position == 0) {
            /* the insert at the head of the list */
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        // if not the head then get the head as the current node
        Node cur = head;

        // got to the node that before the position to insert
        for (int i = 0; i < position - 1; ++i) {
            cur = cur.next;
        }

        // make the next node for the created node as the old node next
        newNode.next = cur.next;

        // make the next node for the old node to the new node
        cur.next = newNode;

        // increase the size
        size++;
    }

    /**
     * Inserts an element at the head of the list
     *
     * @param data element to be added
     */
    public void insertHead(int data) {
        insertNth(data, 0);
    }

    /**
     * Insert an element at the tail of the list
     *
     * @param data element to be added
     */
    public void insert(int data) {
        insertNth(data, size);
    }

    /**
     * Deletes a node at the head
     */
    public void deleteHead() {
        deleteNth(0);
    }

    /**
     * Deletes an element at the tail
     */
    public void delete() {
        deleteNth(size - 1);
    }

    /**
     * Deletes an element at Nth position
     */
    public void deleteNth(int position) {
        checkBounds(position, 0, size - 1);

        // delete the head
        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        Node cur = head;

        for (int i = 0; i < position - 1; ++i) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        size--;
    }

    /**
     * @param position to check position
     * @param low      low index
     * @param high     high index
     * @throws IndexOutOfBoundsException if {@code position} not in range {@code low} to {@code high}
     */
    public void checkBounds(int position, int low, int high) {
        // safety validation
        if (position > high || position < low) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    /**
     * Clear all nodes in the list
     */
    public void clear() {
        Node cur = head;

        // while there is nodes
        while (cur != null) {
            // go to the next node
            cur = cur.next;
        }

        // in the last node make the head to null and the size to zero
        head = null;
        size = 0;
    }

    /**
     * Checks if the list is empty
     *
     * @return {@code true} if list is empty, otherwise {@code false}.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the size of the linked list.
     *
     * @return the size of the list.
     */
    public int size() {
        return size;
    }

    /**
     * Get head of the list.
     *
     * @return head of the list.
     */
    public Node getHead() {
        return head;
    }

    /**
     * Calculate the count of the list manually
     *
     * @return count of the list
     */
    public int count() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    /**
     * Test if the value key is present in the list.
     *
     * @param key the value to be searched.
     * @return {@code true} if key is present in the list, otherwise {@code false}.
     */
    public boolean search(int key) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * Return element at special index.
     *
     * @param index given index of element
     * @return element at special index.
     */
    public int getNth(int index) {
        checkBounds(index, 0, size - 1);
        Node cur = head;
        for (int i = 0; i < index; ++i) {
            cur = cur.next;
        }
        return cur.value;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("->");
        Node cur = head;
        while (cur != null) {
            joiner.add(cur.value + "");
            cur = cur.next;
        }
        return joiner.toString();
    }
}
