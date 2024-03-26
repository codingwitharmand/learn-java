package com.cwa.practice;

public interface Criterion<T> {
    boolean test(T item);
}
