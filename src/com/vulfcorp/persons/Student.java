package com.vulfcorp.persons;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    public Student(String name) {
        super.name=name;
    }

    public static List<Student> makeStudents(int count){
        List list = new ArrayList(count);
        for(int i = 0; i < count; i++){
            list.add(new Student("student#"+(i+1)));
        }
        return list;
    }

    public String doMainActivity (){
        return this.name+" do smt";
    }

    public String doMainActivity(String info){
        return this.name+" listen lecture";
    }
}
