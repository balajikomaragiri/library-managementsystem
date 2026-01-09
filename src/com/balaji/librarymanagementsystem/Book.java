package com.balaji.librarymanagementsystem;

public class Book extends LibraryItem {
    private String authorname;
    public  Book(String itemid,String title,String authorname){
        super(itemid,title);
        this.authorname = authorname;
    }
    @Override
    public void showdetails(){
        System.out.println("bookid:" +itemid+"\nbook title:" + title+ "\nauthor :" +authorname);


    }
    public String toString() {
        return itemid +","+title+","+isavailable();

    }
}
