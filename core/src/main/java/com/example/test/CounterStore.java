package com.example.test;

public class CounterStore {
    private int count;

    public void add(int num) {
        count += num;
    }

    public int get() {
        return count;
    }
}
