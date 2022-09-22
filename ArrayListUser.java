package com.google.lesson03;

public class ArrayListUser {
    private int size = 0;
    private User[] arr;


    public ArrayListUser() {
        this.arr = new User[this.size];
    }

    public User[] getUsers() {
        return this.arr;
    }

    public int getSize() {
        return this.size;
    }

    public User getUser(int index) {
        return this.arr[index];
    }

    public User getFirst() {
        return this.arr[0];
    }

    public User getLast() {
        return this.arr[this.size - 1];
    }

    public void addFirst(User user) {
        ++this.size;
        User[] temp = new User[this.size];
        temp[0] = user;
        int counter=1;
        for (int i = 0; i < this.size-1; ++i, ++counter) {
            temp[counter] = this.arr[i];
        }
        this.arr = temp;

    }

    public void addLast(User user) {

        User[] temp = new User[this.size+1];

        for (int i = 0; i < this.size; ++i) {
            temp[i] = this.arr[i];
        }

        temp[this.size] = user;
        this.arr = temp;
        ++this.size;

    }

    public void set(int index, User user) {
        arr[index] = user;
    }

    public User delete(int index) {
        User user = arr[index];
        int counter = 0;
        User[] temp = new User[this.size - 1];

        for (int i = 0; i < this.size; ++i) {
            if (i != index) {
                temp[counter] = this.arr[counter];
                ++counter;
            }
        }

        this.arr = temp;
        this.size--;
        return user;
    }

}
