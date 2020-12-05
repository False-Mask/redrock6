package com.example.level3;

public class recyclerdata {
    private String name;
    private String inside;

    //构造方法
    public recyclerdata(String name,String inside){
        this.name=name;
        this.inside=inside;
    }



   //set get 方法
    public void setName(String name) {
        this.name = name;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }


    public String getName() {
        return name;
    }

    public String getInside() {
        return inside;
    }

}
