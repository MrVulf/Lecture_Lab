package com.vulfcorp.classroom;

import com.vulfcorp.persons.Student;
import com.vulfcorp.persons.Teacher;

import java.util.Collection;

public class ClassRoom {
    private String number;
    private Teacher teacher;
    private Collection<Student> students;

    public ClassRoom(String number, Teacher teacher, Collection<Student> students) {
        this.number = number;
        this.teacher = teacher;
        this.students = students;
    }

    public void beginLecture(){
        System.out.println("LECTURE START");
        String teacherInfo = teacher.doMainActivity();
        System.out.println(teacherInfo);
        for(Student student : students){
            System.out.println(student.doMainActivity(teacherInfo));
        }
    }
}
