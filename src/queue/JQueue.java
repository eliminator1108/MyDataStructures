package queue;

import java.io.*;

class JQueue {

    public static void main(String args[]) throws IOException {
        Queue q = new Queue();
        String ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter more? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            q.enterData();
        }
        q.displayQueue();
        while (true) {
            System.out.println("Delete more? y or n");
            ch = br.readLine();
            if (!(ch.equals("y"))) {
                break;
            }
            q.delQueue();
        }
        q.displayQueue();
    }
}