package com.example.team;

public class MyListData {
    private String description;
    private int imgid;
    public MyListData(String description,int imgid){
        this.description=description;
        this.imgid=imgid;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public int getImgid(){
        return imgid;
    }
    public void setImgid(int imgid){
        this.imgid=imgid;
    }
}
