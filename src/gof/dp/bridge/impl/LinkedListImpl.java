package gof.dp.bridge.impl;

import java.util.LinkedList;

public class LinkedListImpl<T> extends AbstractList<T> {

    LinkedList<T> linkedList;

    public LinkedListImpl(){
        linkedList = new LinkedList<T>();
        System.out.println("LinkedList를 사용하여 구현합니다.");
    }

    @Override
    public void addElement(T obj) {
        linkedList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return linkedList.remove(i);
    }

    @Override
    public void insertElement(int i,T obj) {
        linkedList.add(i, obj);
    }

    @Override
    public T getElement(int i) {
        return linkedList.get(i);
    }

    @Override
    public int getElementSize() {
        return linkedList.size();
    }
}
