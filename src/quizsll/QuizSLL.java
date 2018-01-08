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
public class QuizSLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList myList = new MyList();
        System.out.println("Add to the list");
        myList.addLast(1);
        myList.addLast(4);
        myList.addLast(31);
        myList.addLast(2);
        myList.addLast(43);
        myList.addLast(16);
        myList.addLast(48);
        myList.addLast(5);
        myList.traverse();
        System.out.println("\nRemove Last");
        myList.removeTail();
        myList.traverse();
        System.out.println("\nBefore Delete");
        myList.traverse();
        myList.delete(4);
        System.out.println("\n After Delete");
        myList.traverse();
        System.out.println("\n");
        
    }
    
}
