package equals_hashcode;

public class NormalHashCodeTest{

    public static void main(String[] args) {
        // �½�2����ͬ���ݵ�Person����
        // ����equals�Ƚ������Ƿ����
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("aaa", 200);
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        System.out.printf("p1.equals(p3) : %s; p1(%d) p3(%d)\n", p1.equals(p3), p1.hashCode(), p3.hashCode());
        Integer i= 90;
        System.out.println("adfadf"+i.getClass());

    }

    /**
     * @desc Person�ࡣ
     */
    private static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " - " +age;
        }

        /** 
         * @desc ����equals���� 
         */  
        public boolean equals(Object obj){  
            if(obj == null){  
                return false;  
            }  

            //�����ͬһ�����󷵻�true����֮����false  
            if(this == obj){  
                return true;  
            }  

            //�ж��Ƿ�������ͬ  
            if(this.getClass() != obj.getClass()){  
                return false;  
            }  

            Person person = (Person)obj;  
            return name.equals(person.name) && age==person.age;  
        } 
    }
}