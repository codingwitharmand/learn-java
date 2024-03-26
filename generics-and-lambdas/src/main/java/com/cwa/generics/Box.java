package com.cwa.generics;

public class Box<T extends Number> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
