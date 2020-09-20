package com.vulfcorp.persons;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    public Teacher(String name) {
        super.name = name;
    }

    public static List<Teacher> makeTeachers(int count){
        List list = new ArrayList(count);
        for(int i = 0; i < count; i++){
            list.add(new Student("teacher#"+(i+1)));
        }
        return list;
    }

    public String doMainActivity (){
        return super.name + " speaks about a subject ...";
    }

}
