package com.mundodedafne.apps.recyclerviewexample;

public class MyListData {
    private String description;
    private int imgId;

    public MyListData(String description, int imgId){
        this.description = description;
        this.imgId = imgId;
    }

    public String getDescription(){ return description;}
    public int getImageId(){return imgId;}

    public void setDescription(String description){this.description = description; }
    public void setImageId(int imgId){this.imgId = imgId; }

}
