package com.denix04.gui.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
    private JButton strategiesBtn;
    private JButton operationBtn;
    private JButton quitBtn;

    public MenuPanel(){
        setVisible(true);
        setLayout(null);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(800,600));

        strategiesBtn = new JButton("Estrategias");
        operationBtn = new JButton("Operaciones");
        quitBtn = new JButton("Salir");

        strategiesBtn.setBounds(200,100,150,50);
        operationBtn.setBounds(200,300,150,50);
        quitBtn.setBounds(200,500,150,50);

        add(strategiesBtn);
        add(operationBtn);
        add(quitBtn);
    }

}
