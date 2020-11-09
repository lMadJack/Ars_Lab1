package com.program;

public class MyList {
    Object[] data;
    int capacity;
    int num;
    static final int DEFAULT_CAPACITY = 100;

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
        num = 0;
    }

    public void add(Object a) {
        data[num] = a;
        num++;
    }

    public Object get(int index) {
        if (index < 0 || index >= num) {
            throw new RuntimeException("index out of bounds");
        }
        return data[index];
    }

    public void getAll() {
        for (int i = 0; i < num; i++) {
            System.out.println(data[i]);
        }
    }

    public void del(int index) {
        num++;
        data[num] = data[index];
        if (num == 0) {
            throw new RuntimeException("list is empty");
        }
        num--;
        data[num] = null;
    }
}
