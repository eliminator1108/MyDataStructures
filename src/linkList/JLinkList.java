package linkList;

import java.io.*;

class JLinkList {

    public static void main(String args[]) throws IOException {
        LinkList l = new LinkList();
        String ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter more at back? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            l.insertBack();
        }
        l.displayList();
        while (true) {
            System.out.println("Enter more in front? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            l.insertFront();
        }
        l.displayList();
        while (true) {
            System.out.println("Delete more from front? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            l.delFront();
        }
        l.displayList();
        while (true) {
            System.out.println("Delete more from back? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            l.delBack();
        }
        l.displayList();
        l.insertAfter();
        l.displayList();
        l.insertBefore();
        l.displayList();
        l.delAfter();
        l.displayList();
        l.delBefore();
        l.displayList();
    }
}