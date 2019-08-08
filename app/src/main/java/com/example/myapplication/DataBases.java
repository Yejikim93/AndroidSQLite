package com.example.myapplication;

import android.provider.BaseColumns;

public final class DataBases {

    public static final class CreateDB implements BaseColumns{
        public static final String USERID = "userid";
        public static final String EXERCISENAME = "name";
        public static final String AGE = "age";
        public static final String GENDER = "gender";
        public static final String _TABLENAME0 = "usertable";
        public static final String _CREATE0 = "create table if not exists "+_TABLENAME0+"("
                +_ID+" integer primary key autoincrement, "
                +USERID+" text not null , "
                +EXERCISENAME+" text not null , "
                +AGE+" integer not null , "
                +GENDER+" text not null );";
    }
}