package com.denix04.gui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.denix04.gui.Frame;

public class MenuPanel extends JPanel{
    private JButton strategiesBtn;
    private JButton operationBtn;
    private JButton quitBtn;
    private JButton newOrBtn;

    public MenuPanel(){
        setLayout(null);
        setBackground(Color.WHITE);

        strategiesBtn = new JButton("Estrategias");
        operationBtn = new JButton("Operaciones");
        quitBtn = new JButton("Salir");
        newOrBtn = new JButton("Nueva Operacione");

        strategiesBtn.setBounds(200,100,150,50);
        operationBtn.setBounds(200,200,150,50);
        newOrBtn.setBounds(200,300,250,50);
        quitBtn.setBounds(200,400,150,50);

        addActions();

        add(strategiesBtn);
        add(operationBtn);
        add(quitBtn);
        add(newOrBtn);
    }

    public void addActions() {
        newOrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame newOpFrm = new Frame(400,400);
                NewOperation newOpPnl = new NewOperation();
                newOpFrm.add(newOpPnl);
            }
        });

        quitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
