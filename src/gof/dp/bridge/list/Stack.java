package gof.dp.bridge.list;

import gof.dp.bridge.impl.AbstractList;

public class Stack<T> extends List<T> {

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("stack를 구현합니다.");
    }

    public void push(T obj){
        impl.addElement(obj);
    }

    public T pop(){
        return impl.deleteElement(impl.getElementSize()-1);
    }

    public int size(){
        return impl.getElementSize();
    }

    public boolean isEmpty(){
        return impl.getElementSize() <=0;
    }
}
