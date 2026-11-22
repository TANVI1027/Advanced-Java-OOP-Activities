
import java.util.ArrayList;

interface Library {
    void display();
}

class Book implements Library {
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }

    public void display() {
        System.out.println(id + " - " + name +
            " - " + (issued ? "Issued" : "Available"));
    }
}

class Member extends Book {
    Member(int id, String name) {
        super(id, name);
    }

    void issueBook() {
        if (issued) {
            System.out.println("Book already issued!");
        } else {
            issued = true;
            System.out.println("Book issued successfully!");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Member> books = new ArrayList<>();

        Member b1 = new Member(101, "Java Programming");
        Member b2 = new Member(102, "Python Basics");

        books.add(b1);
        books.add(b2);

        b1.issueBook();

        System.out.println("\nLibrary Books:");

        for (Member b : books) {
            b.display();
        }
    }
}
