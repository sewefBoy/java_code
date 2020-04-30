package lambda;

import lambda.interfaces.LambdaInterface;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("2020-01-14","nan"));
        list.add(new Person("2020-01-12","nv"));
        list.add(new Person("2020-01-18","nv"));
        list.add(new Person("2020-01-20","nan"));
        list.sort((a,b)->{return a.getName().compareTo(b.getName());});
        for(Person p : list){
            System.out.println(p.toString());
        }
    }
}


