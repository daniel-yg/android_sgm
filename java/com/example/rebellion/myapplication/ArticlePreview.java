package com.example.rebellion.myapplication;

public class ArticlePreview {

    private String title;
    private int image;
    private String destClass;

    public ArticlePreview(String title, int image, String destClass){
        this.title = title;
        this.image = image;
        this.destClass = "com.example.rebellion.myapplication." + destClass;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getDestClass() {
        return destClass;
    }

}
