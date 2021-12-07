package gof.dp.bridge.main;

import gof.dp.bridge.impl.ArrayImpl;
import gof.dp.bridge.impl.LinkedListImpl;
import gof.dp.bridge.list.Queue;
import gof.dp.bridge.list.Stack;

public class BirdgeMainTest {
    public static void main(String[] args) {


        System.out.println("===== ArrayStack Test =====");

        Stack<String> arrayStack = new Stack<String>(new ArrayImpl<String>());
        arrayStack.push("alpa");
        arrayStack.push("bravo");
        arrayStack.push("chaly");

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("=========================");

        System.out.println("===== LinkedListStack Test =====");

        Stack<String> linkedlistStack = new Stack<String>(new ArrayImpl<String>());
        linkedlistStack.push("delta");
        linkedlistStack.push("eco");
        linkedlistStack.push("fafa");

        System.out.println(linkedlistStack.pop());
        System.out.println(linkedlistStack.pop());
        System.out.println(linkedlistStack.pop());
        System.out.println("=========================");


        System.out.println("===== ArrayQueue Test =====");
        Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());
        arrayQueue.enQueue("Apple");
        arrayQueue.enQueue("Banana");
        arrayQueue.enQueue("Carot");
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());



        System.out.println("===== LinkedListQueue Test =====");

        Queue<String> linkedlistQueue = new Queue<String>(new ArrayImpl<String>());
        linkedlistQueue.enQueue("ONE");
        linkedlistQueue.enQueue("TWO");
        linkedlistQueue.enQueue("THREE");

        System.out.println(linkedlistQueue.deQueue());
        System.out.println(linkedlistQueue.deQueue());
        System.out.println(linkedlistQueue.deQueue());





    }
}
