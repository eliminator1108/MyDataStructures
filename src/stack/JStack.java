package stack;

import java.io.*;

class JStack {

    public static void main(String args[]) throws IOException {
        Stack s = new Stack();
        String ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter more? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            s.push();
        }
        s.displayStack();
        while (true) {
            System.out.println("Delete more? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            s.pop();
        }
        s.displayStack();
    }
}