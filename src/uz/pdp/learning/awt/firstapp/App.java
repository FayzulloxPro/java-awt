package uz.pdp.learning.awt.firstapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends Frame {
    Label l1, l2;
    TextField t1, t2;
    Button b;

    public App() {
        super("M Frame");

        l1 = new Label("First");
        l2 = new Label("Second");

        t1 = new TextField(10);
        t2 = new TextField(10);

        b=new Button(" Ok ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);

        add(b);

        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {

        App f=new App();



        f.setSize(300, 300);
        f.setVisible(true);
    }
}

