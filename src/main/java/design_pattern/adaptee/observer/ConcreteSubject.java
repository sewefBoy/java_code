package design_pattern.adaptee.observer;

//具体目标
class ConcreteSubject extends Subject
{
    public void notifyObserver()
    {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");       
       
        for(Object obs:observers)
        {
            ((Observer)obs).response();
        }
       
    }          
}