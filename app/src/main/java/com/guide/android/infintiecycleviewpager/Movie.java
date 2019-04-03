package com.guide.android.infintiecycleviewpager;

public class Movie {
    String title,description;
    int imageMovie;


    public Movie() {
    }

    public Movie(String title, String description, int imageMovie) {
        this.title = title;
        this.description = description;
        this.imageMovie = imageMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageMovie() {
        return imageMovie;
    }

    public void setImageMovie(int imageMovie) {
        this.imageMovie = imageMovie;
    }
}
