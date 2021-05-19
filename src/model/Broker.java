package model;

import javafx.scene.paint.Color;
import model.controller.Event;
import sample.Controller;

public class Broker {
    private Controller controller;

    public Broker(Controller controller) {
        this.controller = controller;
    }

    public void checkEvent(Event e) {
        controller.label.setText(e.toString());
        if (e instanceof GreenhouseControls.LightOn) controller.lightCircle.setFill(Color.DARKGREEN);
        if (e instanceof GreenhouseControls.LightOff) controller.lightCircle.setFill(Color.DARKRED);
        if (e instanceof GreenhouseControls.WaterOn) controller.waterCircle.setFill(Color.DARKGREEN);
        if (e instanceof GreenhouseControls.WaterOff) controller.waterCircle.setFill(Color.DARKRED);
        if (e instanceof GreenhouseControls.ThermostatDay) controller.thermCircle.setFill(Color.YELLOW);
        if (e instanceof GreenhouseControls.ThermostatNight) controller.thermCircle.setFill(Color.DARKGRAY);
    }
}
