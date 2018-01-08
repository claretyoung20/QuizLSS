/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizsll;

/**
 *
 * @author Youngclaret
 */
public class MyList {

    Node head, tail;

    MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void addLast(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    void visit(Node p) {
        System.out.print(p.info + "  ");
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.next;
        }
    }

    void delete(int target) {
        Node targetNode = new Node(target);

        Node R = this.head;
        Node T = null;

        if (isEmpty()) {
            return;
        }

        while (R != null) {
            //check
            if (R.info > targetNode.info) {
                // remove 
                deleNode(R);
            }
            R = R.next;

        }

    }

    void deleNode(Node q) {
        if (q == null || isEmpty()) {
            return;
        }
        Node f, p;
        f = null;
        p = head;

        while (p != null) {
            if (p == q) {
                break;
            }
            f = p;
            p = p.next;
        }
        if (p == null) {
            return;
        }
        if (f == null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        f.next = p.next;
        if (f.next == null) {
            tail = f;
        }
    }

    void removeTail() {
        Node H = head;
        Node T = tail;
        if (H == T) {
            head = tail = null;
        }
        while (H != null) {
            if (H.next == tail) {
                H.next = null;
                tail = H;
                break;
            }
            H = H.next;
        }
    }
}
