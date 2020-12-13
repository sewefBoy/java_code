package design_pattern.observer2;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    
    public void tempChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        tempChanged();
    }
    
    
}