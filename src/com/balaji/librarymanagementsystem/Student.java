package com.balaji.librarymanagementsystem;

public class Student extends User{
    int maxborrowlimit;
    public Student(String userid,String name) {
        super(userid,name);
    }

    @Override
    public void borrowitem( LibraryItem item) {
        if (item instanceof Book){
            super.borrowitem(item);
        }
        else{
            System.out.println("students can only borrow books.");
        }

    }
}
