package com.denix04;


import com.denix04.persistence.controller.IntrospectionController;
import com.denix04.persistence.controller.OperationController;
import com.denix04.persistence.controller.StrategyController;
import com.denix04.persistence.entity.Introspection;
import com.denix04.persistence.entity.Operation;
import com.denix04.persistence.entity.Strategy;
import com.denix04.persistence.entity.enums.Instrument;
import com.denix04.persistence.entity.enums.Mood;
import com.denix04.persistence.entity.enums.Trend;
import com.denix04.persistence.entity.enums.TypeOperation;

import com.denix04.gui.*;
import com.denix04.gui.panel.*;;

public class App {
    public static void main( String[] args ) {

        IntrospectionController iCont = new IntrospectionController();
        iCont.create(new Introspection(Mood.HAPPY,"hola","no","acuerdo"));

        Strategy strategy;
        strategy = new Strategy("la mata tendencia", "no la para nadie");
        //StrategyController sController = new StrategyController();
        //sController.create(strategy);

        //OperationController opCont = new OperationController();
        //opCont.create(new Operation(
                    //30, Instrument.ACTION, 20, 
                    //TypeOperation.BUY, 4.3, 
                    //Trend.BEARISH, 3.3, "compra ypf", strategy));

        Frame frame = new Frame();
        frame.add(new MenuPanel());
    }
}
