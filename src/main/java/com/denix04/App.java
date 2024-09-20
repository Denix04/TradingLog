package com.denix04;

import javax.swing.JFrame;

import com.denix04.gui.panel.MenuPanel;

import jakarta.persistence.*;

public class App {
    public static void main( String[] args ) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tomi_bitacora");
        EntityManager em = emf.createEntityManager();

        JFrame frame = new JFrame("Tomi");
        //frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MenuPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
