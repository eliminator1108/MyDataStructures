/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author Pranav
 */
public class Node {

    public int data;
    public Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }
}
