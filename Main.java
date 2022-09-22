package com.google.lesson03;

public class Main {
    public static void main(String[] args) {
        ArrayListUser arrayListUser=new ArrayListUser();
        User user1 =new User("Anna", "Charles", 18);
        User user2 = new User("Sultanbek", "Myrzakhmet", 18);
        User user3 = new User("Max", "Karl", 25);
        arrayListUser.addFirst(user1);
        arrayListUser.addLast(user2);
        arrayListUser.addFirst(user3);
        System.out.println(arrayListUser.getUsers()[1].getFirstName());
        System.out.println(arrayListUser.getUser(0).getFirstName());
        System.out.println(arrayListUser.getSize());
        arrayListUser.addFirst(user2);
        arrayListUser.addLast(user1);
        System.out.println(arrayListUser.getFirst().getFirstName());
        System.out.println(arrayListUser.getLast().getFirstName());
        arrayListUser.set((arrayListUser.getSize()-1), user3);
        System.out.println(arrayListUser.getLast().getFirstName());
        System.out.println(arrayListUser.delete(arrayListUser.getSize()-1).getFirstName());
        System.out.println(arrayListUser.getUsers()[0].getFirstName());
        System.out.println(arrayListUser.getSize());
        for (int i = 0; i < arrayListUser.getSize(); i++) {
            System.out.println(arrayListUser.getUsers()[i].getFirstName());
        }
    }
}
