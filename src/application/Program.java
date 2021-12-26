package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TEST 2: seller findByDepartment ====");
        Department department = new Department(2);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        DB.closeConnection();
    }
}
