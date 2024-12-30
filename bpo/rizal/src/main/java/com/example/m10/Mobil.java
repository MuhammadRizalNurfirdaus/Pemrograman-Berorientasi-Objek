package com.example.m10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mobil extends JFrame {
    private JLabel merekLabel;
    private JLabel modelLabel;
    private JLabel typeLabel;
    private JLabel kecepatanLabel;
    private JTextField merekText;
    private JTextField modelText;
    private JTextField typeText;
    private JTextField kecepatanText;
    private JButton tombolSubmit;
    private JLabel hasilLabel;

    public Mobil() {
        setTitle("Informasi Mobil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        merekLabel = new JLabel(" Merek :");
        modelLabel = new JLabel(" Model :");
        typeLabel = new JLabel(" Type :");
        kecepatanLabel = new JLabel(" Kecepatan(CC) :");
        merekText = new JTextField();
        modelText = new JTextField();
        typeText = new JTextField();
        kecepatanText = new JTextField();
        tombolSubmit = new JButton("Submit");
        hasilLabel = new JLabel("");

        add(merekLabel);
        add(merekText);
        add(modelLabel);
        add(modelText);
        add(typeLabel);
        add(typeText);
        add(kecepatanLabel);
        add(kecepatanText);
        add(tombolSubmit);
        add(hasilLabel);

        tombolSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String merek = merekText.getText();
                String model = modelText.getText();
                String type = typeText.getText();
                String kecepatan = kecepatanText.getText();
                hasilLabel.setText("Mobil Anda : " + merek + " " + model + " " + type + " " + kecepatan);
            }
        });
    }

    public static void main(String[] args) {
        Mobil form = new Mobil();
        form.setVisible(true);
    }
}