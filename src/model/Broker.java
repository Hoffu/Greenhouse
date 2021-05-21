package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.controller.Event;
import sample.Controller;

import java.util.HashMap;
import java.util.Map;

public class Broker {
    private Controller controller;

    //First option
    private HashMap<Class<?>, Circle> eventColorHashMap = new HashMap<>();

    //Second option
//    private HashMap<Class<?>, Color> eventColorHashMap = new HashMap<>();
//    private HashMap<String, Circle> circlesHashMap = new HashMap<>();

    public Broker(Controller controller) {
        this.controller = controller;

        //First option
        eventColorHashMap.put(GreenhouseControls.LightOn.class, controller.lightCircle);
        eventColorHashMap.put(GreenhouseControls.LightOff.class, controller.lightCircle);
        eventColorHashMap.put(GreenhouseControls.WaterOn.class, controller.waterCircle);
        eventColorHashMap.put(GreenhouseControls.WaterOff.class, controller.waterCircle);
        eventColorHashMap.put(GreenhouseControls.ThermostatDay.class, controller.thermCircle);
        eventColorHashMap.put(GreenhouseControls.ThermostatNight.class, controller.thermCircle);


        //Second option

//        eventColorHashMap.put(GreenhouseControls.LightOn.class, Color.DARKGREEN);
//        eventColorHashMap.put(GreenhouseControls.LightOff.class, Color.DARKRED);
//        eventColorHashMap.put(GreenhouseControls.WaterOn.class, Color.DARKGREEN);
//        eventColorHashMap.put(GreenhouseControls.WaterOff.class, Color.DARKRED);
//        eventColorHashMap.put(GreenhouseControls.ThermostatDay.class, Color.YELLOW);
//        eventColorHashMap.put(GreenhouseControls.ThermostatNight.class, Color.DARKGRAY);
//
//        circlesHashMap.put("Light", controller.lightCircle);
//        circlesHashMap.put("Water", controller.waterCircle);
//        circlesHashMap.put("Thermostat", controller.thermCircle);
    }

    public void checkEvent(Event e) {
        //First option
        controller.label.setText(e.toString());
        for(Map.Entry<Class<?>, Circle> entry : eventColorHashMap.entrySet()) {
            if (e.getClass() == entry.getKey()) {
                if (entry.getValue().getFill() == Color.DARKGREEN) {
                    entry.getValue().setFill(Color.DARKRED);
                } else {
                    entry.getValue().setFill(Color.DARKGREEN);
                }
            }
        }



        //Second option

//        controller.label.setText(e.toString());
//        for(Map.Entry<Class<?>, Color> entryEvent : eventColorHashMap.entrySet()) {
//            if (entryEvent.getKey() == e.getClass()) {
//                for(Map.Entry<String, Circle> entryCircles : circlesHashMap.entrySet()) {
//                    if (e.toString().startsWith(entryCircles.getKey())) {
//                        entryCircles.getValue().setFill(entryEvent.getValue());
//                    }
//                }
//            }
//        }
    }
}
