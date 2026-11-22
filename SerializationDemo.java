
import java.io.*;

class Student implements Serializable {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Tanvi");

            // Serialization
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);
            oos.close();

            System.out.println("Object Serialized Successfully!");

            // Deserialization
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student obj = (Student) ois.readObject();
            ois.close();

            System.out.println("Roll No: " + obj.roll);
            System.out.println("Name: " + obj.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


