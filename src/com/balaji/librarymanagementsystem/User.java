package com.balaji.librarymanagementsystem;

public class User {
    protected String userid;
    protected String name;
    protected int maxborrowlimit = 1;
    private LibraryItem borroweditem;
    public User(String userid,String name ) {
        this.userid = userid;
        this.name = name;
        this.borroweditem = null;
    }
    public void borrowitem(LibraryItem item){
        if (borroweditem != null){
            System.out.println(name + "has already borrowd item.return it first");
        }
        else if (item.isavailable()){
            borroweditem = item;
            item.borrowitem();

        }

    }
    public void returnitem(){
        if (borroweditem == null){
            System.out.println(name + "has no borrow items.");
        }
        else{
            borroweditem.returnitem();
            borroweditem = null;
        }

    }
    public void showdetails(){
        if (borroweditem == null){
            System.out.println( name + "has no borrow items");
        }
        else{
            System.out.println(name +" " + "has borrowed ");
            borroweditem.showdetails();
        }

    }
}
