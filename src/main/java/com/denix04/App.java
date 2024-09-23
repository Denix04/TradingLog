package com.denix04;


import com.denix04.gui.Frame;
import com.denix04.gui.panel.MenuPanel;

import jakarta.persistence.*;

public class App {
    public static void main( String[] args ) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tomi_bitacora");
        EntityManager em = emf.createEntityManager();

        Frame frame = new Frame();
        frame.add(new MenuPanel());
    }
}
