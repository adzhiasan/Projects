package com.company;

import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        JFrame f=new JFrame();//creating instance of JFrame
//
//        JButton b=new JButton("click");//creating instance of JButton
//        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
//
//        f.add(b);//adding button in JFrame
//
//        f.setSize(400,500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible

	    var db = DataBase.GetDataBase();

        var date = new Date();

	    db.addGroup(
	            new Group("4253")
                        .addStudent(new Student("Стас", "Бобиков", Gender.Male, date))
                        .addStudent(new Student("Антон", "Васильченко", Gender.Male, date))
                        .addStudent(new Student("Дарья", "Князева", Gender.Female, date))
                        .addStudent(new Student("Борис", "Чернышов", Gender.Male, date))
        ).addGroup(
                new Group("4252")
                        .addStudent(new Student("Трифонов", "Трифонов", Gender.Male, date))
                        .addStudent(new Student("Рэм", "Кудусов", Gender.Male, date))
                        .addStudent(new Student("Виктория", "Новикова", Gender.Female, date))
                        .addStudent(new Student("Александр", "Петров", Gender.Male, date))
        ).addGroup(
                new Group("4251")
                    .addStudent(new Student("Сергей", "Колобов", Gender.Male, date))
                    .addStudent(new Student("Николай", "Никонов", Gender.Male, date))
                    .addStudent(new Student("Дмитрий", "Димитренко", Gender.Male, date))
                    .addStudent(new Student("Мария", "Попова", Gender.Female, date))
        );

	    ShowDB(db);

                SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentsFrame sf = new StudentsFrame(db);
                sf.setVisible(true);
            }
        });

    }


    public static void ShowDB(DataBase db){
        for(Group group : db.allGroups()){
            System.out.println("Group name: " + group.GroupNumber);
            for(Student student  : group.allStudents()){
                System.out.println("\tStudent name: " + student.getName() + " Surname: " + student.getSurName());
            }

        }

    }


}