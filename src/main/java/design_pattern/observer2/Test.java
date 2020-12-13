package design_pattern.observer2;

public class Test {

    public static void main(String[] args) {

        //实例化主题
        WeatherData wd = new WeatherData();
        //实例化观察者，并传入主题
        App1 app1 = new App1(wd);
        //每次改变温度时，都会通知观察者更新输出。
        wd.setTemperature(20);
        wd.setTemperature(22);
        
    }     
}