 package com.blog;
public class Movie {
//    private long id;
//    private String title;
//    private String content;
//
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
    private String name;
    private int rating;
    private int year;
    public Movie(String name, int rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {

        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }


}

