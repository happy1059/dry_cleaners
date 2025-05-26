package com.happy.second;

public class ReadWriteUserDetails {
    public String doB, gender, mobile;

    //constructor
    public ReadWriteUserDetails(){
    };

    public ReadWriteUserDetails( String textDob, String textGender, String textMobile){
        this.doB = textDob;
        this.gender= textGender;
        this.mobile= textMobile;
    }
}
