package com.aloine.mature_recycler.model;

public class Model {
    private int image;
    private int name;
    private int location;
    private int description;

    public Model(int image, int name, int location, int description) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.description = description;

    }
    public Model() {
        
    }

    public int getImage() {
        return image;
    }

    public int getDescription() {
        return description;
    }

    public int getLocation() {
        return location;
    }

    public int getName() {
        return name;
    }
}
