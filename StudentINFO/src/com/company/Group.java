package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Group {
    public final String GroupNumber;
    private String tutorName;
    private ArrayList<Student> students;

    public Group(String groupNumber, Student... students){

        this.students =  new ArrayList<Student>();
        this.GroupNumber = groupNumber;

        for (Student item: students) {
            this.students.add(item);
        }
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public Group addStudent(Student student){
        students.add(student);
        return  this;
    }

    public Group removeStudent(Student student){
        students.remove(student);
        return this;
    }

    public Iterable<Student> allStudents(){
        return students;
    }
}
