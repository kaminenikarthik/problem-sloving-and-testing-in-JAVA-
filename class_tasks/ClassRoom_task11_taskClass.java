import java.io.*;

// A simple interface
interface Sample {
    final String name = "Shree";
    void display();
}

// A class that implements the interface
public class testClass implements Sample {
    public void display() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        testClass t = new testClass();
        t.display();
        System.out.println(name);
    }
}
