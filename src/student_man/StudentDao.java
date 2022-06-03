package student_man;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudenttoDb(Student st) {
		boolean f = false;
		try {
			// jdbc code
			Connection con=CP.creatc();
			String q = "insert into student(sname,sphone,scity) values(?,?,?);";
//prepare statement
			PreparedStatement pst = con.prepareStatement(q);
			// initialise parameter
			pst.setString(1, st.getStuName());
			pst.setString(2, st.getStuPhone());
			pst.setString(3, st.getStuCity());
			//execute
			pst.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static boolean deleteStudenttoDb(int userdel) {

		boolean f = false;
		try {
			Connection con = CP.creatc();
			// Query
			String q = "delete from student where s_id=?;";

			PreparedStatement pst = con.prepareStatement(q);
			pst.setInt(1, userdel);
			pst.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public static void showAll_FromDB() {


		try {
			Connection con = CP.creatc();
			String q = "select * from student;";
			PreparedStatement stmt = con.prepareStatement(q);
			ResultSet set = stmt.executeQuery();
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");

				System.out.println("ID : " + id);
				System.out.println("Name :" + name);
				System.out.println("Phone No :" + phone);
				System.out.println("City :" + city);
				System.out.println("===========================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void showStudentFromDb(int id) {
		try {
			Connection con = CP.creatc();
			String q = "Select * from student where s_id=?;";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setInt(1, id);
			ResultSet set = pst.executeQuery();
			while (set.next()) {
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");

				System.out.println("ID : " + id);
				System.out.println("Name :" + name);
				System.out.println("Phone No :" + phone);
				System.out.println("City :" + city);

			}


} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
