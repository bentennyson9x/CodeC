/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Post {
    private String PostID, Title,brief,content,author,creatPublisher;
    Scanner s= new Scanner(System.in);
    public Post(String PostID, String Title, String brief, String content, String author, String creatPublisher) {
        this.PostID = PostID;
        this.Title = Title;
        this.brief = brief;
        this.content = content;
        this.author = author;
        this.creatPublisher = creatPublisher;
    }

    public Post() {
    }

    public void setPost() {
       this.PostID=s.nextLine();
    }
    public void setTitle(){ 
        this.Title=s.nextLine();
    }
    public void setbrief(){
        this.brief=s.nextLine();
    }
    public void setContent(){
       this. content=s.nextLine();
    }
    public void setAuthor(){
        this.author=s.nextLine();
    }
    public void setCreatPublisher(){
        this.creatPublisher=s.nextLine();
    }
    public String getPostID() {
        return PostID;
    }

    public void setPostID(String PostID) {
        this.PostID = PostID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatPublisher() {
        return creatPublisher;
    }

    public void setCreatPublisher(String creatPublisher) {
        this.creatPublisher = creatPublisher;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }
    
    public void Display(){
        System.out.printf("%s %20s %20s %20s %20s %20s\n",getPostID(),getTitle(),getBrief(),getContent(),getAuthor(),getCreatPublisher());
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Post[] n1 = new Post [3];
        for (int i=0;i<3;i++){
            n1[i]=new Post();
            System.out.println("Nhap PostID: ");
            n1[i].setPost();
            System.out.println("Nhap Title: ");
            n1[i].setTitle();
            System.out.println("Nhap Brief: ");
            n1[i].setbrief();
            System.out.println("Nhap Content: ");
            n1[i].setContent();
            System.out.println("Nhap Author: ");
            n1[i].setAuthor();
            System.out.println("Nhap Creat Publisher: ");
            n1[i].setCreatPublisher();
        } 
       for(int i=0;i<3;i++){
         //  System.out.printf("PostID ");
           n1[i].Display();
       }
        
        
    }
    
}
