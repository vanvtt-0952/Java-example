package QuanLyHocSinh;

import java.util.ArrayList;
import java.util.List;

public class School {
	public static void main(String[] args) {
		Student st1 = new Student("A", 20, "DN");
		Student st2 = new Student("A", 23, "DN");
		Student st3 = new Student("A", 23, "DN");

		List<Student> students = new ArrayList<Student>();
		students.add(st3);
		students.add(st2);
		students.add(st1);

		Classes class1 = new Classes("Class 1", students);

		System.out.println("===== THong tin class 1");
		class1.displayClassInfo();
		class1.chooseStudentsHas20YearOld();
		class1.countStudent23YearOldInDN();
		class1.addStudentForClass();

		System.out.println("THong tin class sau khi add 1 Hoc Sinh");
		class1.displayClassInfo();

	}
}
