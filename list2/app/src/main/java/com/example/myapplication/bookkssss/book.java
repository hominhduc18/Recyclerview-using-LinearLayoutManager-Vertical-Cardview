package com.example.myapplication.bookkssss;

public class book {
    private int resourceID;
    private String title;

    public book(int resourceID, String title) {
        this.resourceID = resourceID;
        this.title = title;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
