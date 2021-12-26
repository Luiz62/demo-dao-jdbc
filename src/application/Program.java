package application;

import model.entities.Department;
import model.entities.Seller;
import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Luiz", "luiz@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
