package com.cwa.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Repository<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public List<T> findAll() {
        return new ArrayList<>(items);
    }

    public List<T> findByCriterion(Criterion<T> criterion) {
        return items.stream().filter(criterion::test).collect(Collectors.toList());
    }

    public <U extends Comparable<U>> List<T> sorted(Comparator<T> comparator) {
        return items.stream().sorted(comparator).collect(Collectors.toList());
    }

    public Optional<T> findFirstByCriterion(Criterion<T> criterion) {
        return items.stream().filter(criterion::test).findFirst();
    }
}
