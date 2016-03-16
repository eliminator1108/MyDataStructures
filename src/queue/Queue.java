/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.io.*;
import node.Node;

/**
 *
 * @author Pranav
 */
public class Queue {

    private Node head;
    private BufferedReader br;

    public Queue() {
        head = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void enterData() throws IOException, NumberFormatException {
        Node p;
        Node node = new Node();
        System.out.println("Enter data");
        node.data = Integer.parseInt(br.readLine());
        if (head == null) {
            head = node;
        } else {
            for (p = head; p.next != null; p = p.next) {
            }
            p.next = node;
        }
    }

    public void displayQueue() {
        Node p;
        for (p = head; p != null; p = p.next) {
            System.out.println(p.data);
        }
        System.out.println();
    }

    public void delQueue() {
        if (head == null) {
            System.out.println("empty queue");
        } else {
            int d = head.data;
            head = head.next;
            System.out.println(d + " deleted");
        }
        System.out.println();
    }
}
