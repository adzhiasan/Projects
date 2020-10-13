package com.company;


import java.util.Date;

public class Main {

    public static void main(String[] args) {

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

        DBForm form = new DBForm(db);

    }
}
