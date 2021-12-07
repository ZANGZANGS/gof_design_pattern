package gof.dp.bridge.impl;

import java.util.ArrayList;

public class ArrayImpl<T> extends AbstractList<T> {

    ArrayList<T> arrayList;

    public ArrayImpl(){
        arrayList = new ArrayList<T>();
        System.out.println("ArrayList 사용하여 구현합니다.");
    }

    @Override
    public void addElement(T obj) {
        arrayList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return arrayList.remove(i);
    }

    @Override
    public void insertElement(int i,T obj) {
        arrayList.add(i, obj);
    }

    @Override
    public T getElement(int i) {
        return arrayList.get(i);
    }

    @Override
    public int getElementSize() {
        return arrayList.size();
    }
}
