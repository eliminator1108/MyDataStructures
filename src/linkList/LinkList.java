/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkList;

import node.Node;
import java.io.*;

/**
 *
 * @author Pranav
 */
public class LinkList {

    private Node head;
    private BufferedReader br;

    public LinkList() {
        head = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void insertFront() throws IOException, NumberFormatException {
        Node p;
        p = head;
        Node node = new Node();
        System.out.println("Enter data");
        node.data = Integer.parseInt(br.readLine());
        if (p == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void insertBack() throws IOException, NumberFormatException {
        Node p;
        p = head;
        Node node = new Node();
        System.out.println("Enter data");
        node.data = Integer.parseInt(br.readLine());
        if (head == null) {
            head = node;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
    }

    public void insertAfter() throws IOException, NumberFormatException {
        Node p;
        p = head;
        Node node = new Node();
        System.out.println("Insert after which node? Enter data of that node");
        int d = Integer.parseInt(br.readLine());
        System.out.println("Enter data");
        node.data = Integer.parseInt(br.readLine());
        if (head == null) {
            head = node;
        } else {
            try {
                for (; p.data != d; p = p.next) {
                }
                node.next = p.next;
                p.next = node;
            } catch (NullPointerException npe) {
                System.out.println("Element not found. " + npe.getMessage());
            }
        }
    }

    public void insertBefore() throws IOException, NumberFormatException {
        Node p;
        p = head;
        Node node = new Node();
        System.out.println("Insert before which node? Enter data of that node");
        int d = Integer.parseInt(br.readLine());
        System.out.println("Enter data");
        node.data = Integer.parseInt(br.readLine());
        if (head == null) {
            head = node;
        } else if (head.next == null) {
            if (head.data == d) {
                node.next = head;
                head = node;
            } else {
                System.out.println("Element not found.");
            }
        } else {
            if (head.data == d) {
                node.next = head;
                head = node;
            } else {
                try {
                    for (; (p.next).data != d; p = p.next) {
                    }
                    node.next = p.next;
                    p.next = node;
                } catch (NullPointerException npe) {
                    System.out.println("Element not found " + npe.getMessage());
                }
            }
        }
    }

    public void displayList() {
        Node p;
        System.out.println("List:");
        for (p = head; p != null; p = p.next) {
            System.out.println(p.data);
        }
        System.out.println();
    }

    public void delFront() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            int d = head.data;
            head = head.next;
            System.out.println(d + " deleted");
        }
        System.out.println();
    }

    public void delBack() {
        if (head == null) {
            System.out.println("Empty list");
        } else if (head.next == null) {
            int d = head.data;
            head = null;
            System.out.println(d + " deleted");
        } else {
            Node p;
            for (p = head; (p.next).next != null; p = p.next) {
            }
            int d = (p.next).data; //Data of last element
            p.next = null;
            System.out.println(d + " deleted");
        }
        System.out.println();
    }

    public void delAfter() throws IOException, NumberFormatException {
        Node p;
        System.out.println("Delete after which node? Enter data of that node");
        int d = Integer.parseInt(br.readLine());
        if (head == null) {
            System.out.println("Empty List.");
        } else {
            try {
                for (p = head; p.data != d; p = p.next) {
                }
                if (p.next == null) {
                    System.out.println("Cannot delete. No element after " + p.data);
                } else {
                    d = (p.next).data;
                    p.next = (p.next).next;
                    System.out.println(d + " deleted");
                }
            } catch (NullPointerException npe) {
                System.out.println("Element not found.");
            }
        }
    }

    public void delBefore() throws IOException, NumberFormatException {
        Node p;
        System.out.println("Delete before which node? Enter data of that node");
        int d = Integer.parseInt(br.readLine());
        if (head == null) {
            System.out.println("Empty list.");
        } else if (head.next == null) {
            System.out.println("Cannot Delete. Single element exists.");
        } else {
            if (head.data == d) {
                System.out.println("Cannot delete. No element before " + head.data);
            } else {
                try {
                    for (p = head; ((p.next).next).data != d; p = p.next) {
                    }
                    d = (p.next).data;
                    p.next = (p.next).next;
                    System.out.println(d + " deleted");
                } catch (NullPointerException npe) {
                    System.out.println("Element not found " + npe.getMessage());
                }
            }
        }
    }
}
