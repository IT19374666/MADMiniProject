package com.example.myapplication;

public class AccountTypes {
    private String accTypeName;
    private int accTYpeImage;

    public AccountTypes(String accTypeName, int accTYpeImage){
        this.accTypeName = accTypeName;
        this.accTYpeImage = accTYpeImage;

    }

    public String getAccTypeName() {
        return accTypeName;
    }

    public int getAccTYpeImage() {
        return accTYpeImage;
    }
}
