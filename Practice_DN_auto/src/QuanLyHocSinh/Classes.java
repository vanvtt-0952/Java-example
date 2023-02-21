package QuanLyHocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classes {
	private String name;
	private List<Student> students;

	public Classes(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	public void displayClassInfo() {
		System.out.println("Thong tin Class");
		System.out.println("\t Name: " + getName());
		System.out.println("\tDanh Sach Hoc Sinh");
		students.forEach(student -> student.displyaInfomation()); // use lambda
		// Use foreach
//		for (Student student : students) {
//			student.displyaInfomation();
//		}
	}

	public List<Student> chooseStudentsHas20YearOld() {
//		return students.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());// use lambda
		List<Student> studentHas20Yearold = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getAge() == 20) {
				studentHas20Yearold.add(student);
			}
		}
		return studentHas20Yearold;
	}

	public void addStudentForClass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten Hoc Sinh");
		String name = sc.nextLine();
		System.out.println("Nhap tuoi Hoc Sinh");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap dia chi Hoc Sinh");
		String address = sc.nextLine();
		Student st = new Student(name, age, address);
		this.students.add(st);

	}

	public long countStudent23YearOldInDN() {
		return students.stream().filter(student -> student.getAge() == 23 && student.getAddress().equals("DN")).count();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
