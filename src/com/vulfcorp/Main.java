package com.vulfcorp;

import com.vulfcorp.classroom.ClassRoom;
import com.vulfcorp.persons.Student;
import com.vulfcorp.persons.Teacher;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher");
        List students = Student.makeStudents(7);
        ClassRoom classRoom = new ClassRoom("112", teacher, students);
        classRoom.beginLecture();
    }
}
