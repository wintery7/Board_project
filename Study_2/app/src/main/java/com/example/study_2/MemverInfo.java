package com.example.study_2;

import android.widget.EditText;

public class MemverInfo {
    private String name;
    private String phoneNumber;
    private String birthDay;
    private String address;

    public MemverInfo(String name, String phoneNumber, String birthDay, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String phoneNumber(){
        return this.name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String birthDay(){
        return this.name;
    }
    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    public String address(){
        return this.name;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
