package com.denix04.gui.panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.denix04.gui.Frame;

public class NewOperation extends JPanel{
    private JPanel infPnl;
    private JPanel closPnl;
    private JPanel openPnl;

    private Label closPnlTitle = new Label("Cierre");
    private Label openPnlTitle = new Label("Apertura");

    private Label infDate = new Label("Fecha");
    private Label infPrice = new Label("Precio");

    private Button backBtn = new Button("Atras");

    public NewOperation() {
        setBackground(Color.WHITE);
        addActions();
        add(closPnlTitle);
        add(openPnlTitle);
        add(infDate);
        add(infPrice);
        add(backBtn);

    }

    private void addActions() {
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
