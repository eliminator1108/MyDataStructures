/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.io.*;
import node.Node;

/**
 *
 * @author Pranav
 */
public class Stack {

    private Node top;
    private BufferedReader br;

    public Stack() {
        top = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void push() throws IOException, NumberFormatException {
        Node p;
        p = top;
        Node node = new Node();
        System.out.println("Enter data");
        node.data = Integer.parseInt(br.readLine());
        if (p == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        System.out.println();
    }

    public void displayStack() {
        Node p;
        for (p = top; p != null; p = p.next) {
            System.out.println(p.data);
        }
        System.out.println();
    }

    public void pop() {
        if (top == null) {
            System.out.println("Empty Stack");
        } else {
            System.out.println(top.data + " popped");
            top = top.next;
        }
        System.out.println();
    }
}
