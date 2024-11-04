package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MAIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JButton button = new JButton("Нажми меня!");
        frame.add(button, BorderLayout.SOUTH);
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Молодец, ты знаешь как нажимать кнопки))"));

        JLabel label = new JLabel("Привет, добро позаловать в тренажер для java-разработчиков!");
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}