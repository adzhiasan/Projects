package com.company;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;
import java.util.List;

public class StudentsFrame extends JFrame {

    public StudentsFrame(DataBase dataBase){
        super("Пример со списком JList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contents = new JPanel();

        String[] groupNames = new String[dataBase.getGroupSize()];

        for (int i = 0; i< dataBase.getGroupSize(); i++)
            groupNames[i] = dataBase.allGroups().get(i).GroupNumber;

        var list = new JList<String>(groupNames);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                list
            }
        });
        var pane = new JScrollPane();
        list.setLocation(10,10);
        contents.add(pane);


        JTextField textField = new JTextField();
        textField.setSize(300,390);
        contents.add(textField);


//        contents.setBounds(10,10, 60,390);
//        contents.setLocation(10,10);
        setContentPane(contents);
        // Вывод окна
        setSize(400, 200);
        setVisible(true);
    }


}
