package design_pattern.observer2;

public class Test {

    public static void main(String[] args) {

        //ʵ��������
        WeatherData wd = new WeatherData();
        //ʵ�����۲��ߣ�����������
        App1 app1 = new App1(wd);
        //ÿ�θı��¶�ʱ������֪ͨ�۲��߸��������
        wd.setTemperature(20);
        wd.setTemperature(22);
        
    }     
}