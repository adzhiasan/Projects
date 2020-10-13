package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class DataBase {
    private static DataBase dataBase;
    private ArrayList<Group> groups;

    private  DataBase(){
        groups = new ArrayList<Group>();
    }

    public static DataBase GetDataBase(){
        if(dataBase == null){
            dataBase = new DataBase();
        }
        return dataBase;
    }

    public DataBase addGroup(Group group){
        groups.add(group);
        return dataBase;
    }

    public DataBase removeGroup(Group group){
        groups.remove(group);
        return  dataBase;
    }

    public ArrayList<Group> allGroups(){
        return groups;
    }

    public int getGroupSize(){ return groups.size(); }
}
