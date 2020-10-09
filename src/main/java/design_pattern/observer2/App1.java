package design_pattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class App1 implements Observer {
    
    Observable observable;
    private float temperature;
    
    public App1(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub

        if(o instanceof WeatherData){
            WeatherData wd = (WeatherData)o;
            this.temperature = wd.getTemperature();
            display();
        }
    }
    
    public void display(){
        System.out.println(this.getClass()+"当前温度："+this.temperature+"摄氏度");
    }

}