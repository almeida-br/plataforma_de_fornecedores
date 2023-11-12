package com.spring_boot.CRUD.view;

import javax.swing.*;
import java.awt.*;

public class UserForm extends JFrame{

    private JTextField campo=new JTextField("preencha");
    private JLabel nome=new JLabel("Nome");
    private Container con=getContentPane();
    UserForm(){
        super("JFrame ContentPane Layout in Java Swing Example");
        setSize(500,500);
        setVisible(true);
        con.setLayout(new FlowLayout());
        con.add(nome);
        con.add(campo);
    }
    public static void main(String[] args) {
        UserForm FormFrame=new UserForm();
    }

}
