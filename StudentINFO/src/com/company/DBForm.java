package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DBForm extends JFrame
{
    private  JTextField textField;
    private  JList<String> list;

    public DBForm(DataBase db)
    {
        super("Пример со списком JList");
        var content = super.getContentPane();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField = new JTextField();
        list = new JList<String>(getGroupNames(db));

        list.addListSelectionListener(new SelectionAction(list, textField));

        content.add(list);
        content.add(textField);

        super.setLayout(new BoxLayout(content, BoxLayout.LINE_AXIS));
        super.setSize(400, 200);
        super.setVisible(true);
    }

    private String[] getGroupNames(DataBase db){
        String[] groupNames = new String[db.getGroupSize()];
        for (int i = 0; i< db.getGroupSize(); i++)
            groupNames[i] = db.allGroups().get(i).GroupNumber;

        return  groupNames;
    }

    private class  SelectionAction implements ListSelectionListener {
        private JList<String> groups;
        private JTextField textField;

        private SelectionAction(JList<String> groups, JTextField textField) {
            this.textField = textField;
            this.groups = groups;
        }

        public void valueChanged(ListSelectionEvent e)
        {
            var _db = DataBase.GetDataBase();
            var _names = groups.getSelectedValuesList();

            textField.setText("");

            for(String name: _names){
                var result = _db.getGroupByName(name);

                if(result != null){
                    presentGroup(result);
                }
            }
        }

        private void presentGroup(Group group){
            for(Student _student: group.allStudents()){
                textField.setText(textField.getText() + "\n");
                textField.setText(textField.getText() +
                        " Name: " + _student.getName() +
                        " Surname: " + _student.getSurName());
            }
        }
    }
}
