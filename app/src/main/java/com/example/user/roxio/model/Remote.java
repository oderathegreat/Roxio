package com.example.user.roxio.model;

public class Remote {


    String name;
    String image;
    String description;
    String title;

    public Remote() {
    }

    public Remote(String name, String image, String description, String title) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
