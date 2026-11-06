package Odev;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() { return list.isEmpty(); }
    public int getSize() { return list.size(); }
    public Object peek() { return list.get(getSize() - 1); }
    public Object pop() { return list.remove(getSize() - 1); }
    public void push(Object o) { list.add(o); }

    @Override
    @SuppressWarnings("unchecked")
    public Object clone() throws CloneNotSupportedException {
        MyStack stackClone = (MyStack) super.clone();
        stackClone.list = (ArrayList<Object>) list.clone();
        return stackClone;
    }
}