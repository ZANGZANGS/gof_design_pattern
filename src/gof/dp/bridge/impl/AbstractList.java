package gof.dp.bridge.impl;

public abstract class AbstractList<T> {

    public abstract void addElement(T obj);
    public abstract T deleteElement(int i);
    public abstract void insertElement(int i, T obj);
    public abstract T getElement(int i);
    public abstract int getElementSize();
}

