package application;

import model.entities.Department;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Department obj = new Department(1, "Books");

        System.out.println(obj);
    }
}
