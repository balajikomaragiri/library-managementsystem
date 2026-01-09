package com.balaji.librarymanagementsystem;

public class magizine extends LibraryItem {
    protected int issuenumber;
    public magizine(String itemid,String title,int issuenumber) {
        super(itemid, title);
        this.issuenumber = issuenumber;
    }
    @Override
    public void showdetails(){
        System.out.println("bookid:"+"\nbook title:" +title+ "\nissue number :" +issuenumber);


    }
}
