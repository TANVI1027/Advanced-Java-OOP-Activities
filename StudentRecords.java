
import java.util.ArrayList;
import java.util.HashMap;

public class StudentRecords {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Tanvi");
        students.add("Sairam");
        students.add("Atharva");

        HashMap<Integer, String> records = new HashMap<>();

        records.put(101, "Tanvi");
        records.put(102, "Sairam");
        records.put(103, "Atharva");

        System.out.println("Student List: " + students);
        System.out.println("Student Records: " + records);
    }
}

