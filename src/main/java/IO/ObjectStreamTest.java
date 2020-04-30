package IO;

import java.io.*;

public class ObjectStreamTest {
    public static void main(String[] args) {
        InputStream is = null;
        ObjectInputStream ois = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;

        try {
//            is = new FileInputStream("a.txt");
            os = new FileOutputStream("c.txt");
//            ois = new ObjectInputStream(is);
            oos = new ObjectOutputStream(os);
            oos.writeObject(new student(1001,"曾小贤123",24).toString());


//            System.out.println(ois.readInt());
//            System.out.println(ois.readLine());
//            System.out.println(ois.readChar());

//            oos.writeInt(ois.readInt());
//            oos.writeUTF(ois.readLine());
//            oos.writeChar(ois.readChar());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                os.close();
//                ois.close();
//                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


class student implements Serializable{
    private int id;
    private String name;
    private int age;

    public student() {
    }

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
