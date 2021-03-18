package com.example.myapplication.activities.settergetter;

public class setterclass
{
    private String name , pass , con_pass;
    private String mobile_number;

    public setterclass()
    {

    }

    public setterclass(String name, String pass, String con_pass, String mobile_number) {

        this.name = name;
        this.pass = pass;
        this.con_pass = con_pass;
        this.mobile_number = mobile_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCon_pass() {
        return con_pass;
    }

    public void setCon_pass(String con_pass) {
        this.con_pass = con_pass;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
}
