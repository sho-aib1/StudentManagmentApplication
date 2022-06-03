package student_man;

public class Student {
	private int StudentId;
	private String StuName;
	private String stuPhone;
	private String stuCity;

	public Student(int studentId, String stuName, String stuPhone, String stuCity) {
		super();
		StudentId = studentId;
		StuName = stuName;
		this.stuPhone = stuPhone;
		this.stuCity = stuCity;
	}

	public Student(String stuName, String stuPhone, String stuCity) {
		super();
		StuName = stuName;
		this.stuPhone = stuPhone;
		this.stuCity = stuCity;
	}

	public Student() {
		super();
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStuName() {
		return StuName;
	}

	public void setStuName(String stuName) {
		StuName = stuName;
	}

	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getStuCity() {
		return stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StuName=" + StuName + ", stuPhone=" + stuPhone + ", stuCity="
				+ stuCity + "]";
	}

}
