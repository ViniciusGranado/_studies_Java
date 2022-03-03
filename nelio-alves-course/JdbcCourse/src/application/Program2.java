package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program2 {
  public static void main(String[] args) {
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    System.out.println("=== TEST 1: Department findById ===");
    Department department = departmentDao.findById(2);
    System.out.println(department);

    System.out.println("\n=== TEST 2: Department findAll ===");
    List<Department> list = departmentDao.findAll();
    for(Department obj : list) {
      System.out.println(obj);
    }

    System.out.println("\n=== TEST 3: Department insert ===");
    Department newSeller = new Department(null, "D2");
    departmentDao.insert(newSeller);
    System.out.println("Inserted! New id = " + newSeller.getId());

    System.out.println("\n=== TEST 4: Department update ===");
    department = departmentDao.findById(1);
    department.setName("D1");
    departmentDao.update(department);
    System.out.println("Update completed");
  }
}
