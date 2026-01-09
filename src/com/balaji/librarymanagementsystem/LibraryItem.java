package com.balaji.librarymanagementsystem;

public class LibraryItem {
    protected String itemid;
    protected String title;
    protected boolean isavailable;
    public LibraryItem (String itemid, String title){
        this.itemid = itemid;
        this.title = title;
    }
    public boolean isavailable(){
        return  isavailable = true;
    }
    public void borrowitem(){
        if(isavailable){
            System.out.println(title + " " +"borrowed successfully");
            isavailable = false;
        }
        else{
            System.out.println( title + "is not available");
        }

    }
    public void returnitem(){
        isavailable = true;
        System.out.println(title + " returned successfully");

    }
    public void showdetails(){
        System.out.println(  "id :"+itemid +"\ntitle:" + title +"\nisavailable :"+isavailable );

    }
}
