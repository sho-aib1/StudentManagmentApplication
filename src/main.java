

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import student_man.Student;
import student_man.StudentDao;

public class main {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Student Management Application");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("============================================================");
			System.out.println(" Press 1 to Add Student");

			System.out.println(" Press 2 to Delete Student");

			System.out.println(" Press 3 to Display Student");

			System.out.println(" Press 4 to Exit Student");
			System.out.println("============================================================");

			int ch = Integer.parseInt(br.readLine());
			if (ch == 1) {
				// add student

				System.out.println("Enter User Name :");

				String name = br.readLine();

				System.out.println("Enter User Phone :");
				String phone = br.readLine();

				System.out.println("Enter User City :");
				String city = br.readLine();

				Student st = new Student(name, phone, city);
				boolean ans = StudentDao.insertStudenttoDb(st);
				if (ans) {
					System.out.println("Successfully Added");
				} else {
					System.out.println("Something Went Wrong");
				}
				System.out.println(st);
			} else if (ch == 2) {
				// delete student

				System.out.println("Enter UserId to delete :");
				int del = Integer.parseInt(br.readLine());
				boolean ans = StudentDao.deleteStudenttoDb(del);
				if (ans) {
					System.out.println("Details Deleted Successfully");
				} else {
					System.out.println("Something Went Wrong");
				}
			} else if (ch == 3) {
				System.out.println("Press 1 to show All Students :");
				System.out.println("Press 2 to show Student Details :");

				int choice = Integer.parseInt(br.readLine());
				if (choice == 1) {
					StudentDao.showAll_FromDB();
				} else if (choice == 2) {
					System.out.println("Enter User Id ");
					int Showid = Integer.parseInt(br.readLine());
					StudentDao.showStudentFromDb(Showid);

				} else {
					System.out.println("Invalid Input");

				}




					}
				else if (ch == 4) {
				// exit
				break;
			}
		}
		System.out.println("============================================================");
		System.out.println("Thank you for using Our Application");
		System.out.println("See you soon Bye Byee");
		System.out.println("============================================================");

	}

}
