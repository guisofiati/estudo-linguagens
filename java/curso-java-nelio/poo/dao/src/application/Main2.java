package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		List<Department> departments = new ArrayList<>();
		
		System.out.println("Insert");
		Department dep = new Department(null, "Food");
		depDao.insert(dep);
		System.out.println("Insert completed! Id = " + dep.getId());
		
		System.out.println();
		
		System.out.println("Find by id");
		dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println();
		
		System.out.println("Update");
		dep = depDao.findById(2);
		dep.setName("Baby");
		depDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println();
		
		System.out.println("Delete by id");
		System.out.print("Enter an id to delete: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Id " + id + " deleted.");
		
		System.out.println();
		
		System.out.println("Find all");
		departments = depDao.findAll();
		for (Department obj : departments) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}